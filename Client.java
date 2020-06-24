package windows;

public class Client {
    public static void main(String[] args) {
        Composite window = new Window("window");
        window.add(new Picture("logo图片"));
        Composite frame = new Frame("Frame");
        frame.add(new Label("用户名"));
        frame.add(new TextBox("请输入用户名"));
        frame.add(new Label("密码"));
        frame.add(new PasswordBox("请输入密码"));
        frame.add(new CheckBox("请记住用户名"));
        frame.add(new LinkLable("忘记密码"));
        window.add(frame);
        window.add(new Button("登录"));
        window.add(new Button("注册"));
        window.print();
    }
}
