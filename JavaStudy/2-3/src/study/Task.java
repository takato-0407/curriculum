package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
    public class Task extends Calculator{
    /**
     * タスクの実行
     */
    	private int a = 10;
    	private int b = 20;
    	private int c = 30;
  
    
    
    public void doTask() {
    	System.out.println("plusメゾットの引数が一つの場合" + ";" + plus(a));
    	System.out.println("plusメゾットの引数が一つの場合" + ";" + plus(a, b));
    	System.out.println("plusメゾットの引数が一つの場合" + ";" + plus(a, b, c));
    }
}