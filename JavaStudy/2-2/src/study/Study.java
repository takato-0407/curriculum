package study;

/**
 * Study.java
 */
class Account {

    // フィールド変数
    private String userName;
    private int id;
    private String password;
   
    // コンストラクタ
    public Account(String userName, int id, String password) {
        this.userName = userName;
        this.id = 1;
        this.password = password;
    }
    
    protected void printAccountInfo() {
    	System.out.println(userName);
    	System.out.println(1);
    	System.out.println(password);
    }
    // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
    // アクセス修飾子:「protected」
    // メソッド名:「printAccountInfo」


}