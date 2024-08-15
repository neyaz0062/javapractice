package thread;
class TableLogic{
  synchronized public void tableOf(int m) throws InterruptedException {
        for (int i = 1; i <=10; i++) {
            System.out.println(m+" x "+i+" = "+(i*m));
            Thread.sleep(500);
        }
    }
}

class Table1 extends Thread{
    TableLogic tableLogic;
    public Table1(TableLogic tableLogic){
        this.tableLogic = tableLogic;
    }

    @Override
    public void run() {
        try {
            tableLogic.tableOf(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Table2 extends Thread{
    TableLogic tableLogic;
    public Table2(TableLogic tableLogic){
        this.tableLogic = tableLogic;
    }

    @Override
    public void run() {
        try {
            tableLogic.tableOf(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Multi {
    public static void main(String[] args) {

        TableLogic tableLogic = new TableLogic();
        Table1 table1 = new Table1(tableLogic);
        Table2 table2 = new Table2(tableLogic);
        table1.start();
        table2.start();


    }
}


