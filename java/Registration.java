public class Registration {
    private String email;
    private String userName;
    private String password;

    private boolean validEmail(String email) {
        return email.endsWith("@yahoo.com");
    }

    private boolean validUserName(String userName) {
        return !userName.isEmpty() && userName.length() > 6;
    }

    private boolean validPassword(String password) {
        return !password.isEmpty() && password.length() > 6 && !password.contains(userName);
    }

    public void setEmail(String email) {
        if (validEmail(email)) {
            this.email = email;
            System.out.println("Email is set successfully");
        } else {
            System.out.println("Invalid email");
        }
    }

    public void setUserName(String userName) {
        if (validUserName(userName)) {
            this.userName = userName;
            System.out.println("Username is set successfully");
        } else {
            System.out.println("Invalid username");
        }
    }

    public void setPassword(String password) {
        if (validPassword(password)) {
            this.password = password;
            System.out.println("Password is set successfully");
        } else {
            System.out.println("Invalid password");
        }
    }

    String getEmail() {
        return email;
    }

    String getUserName() {
        return userName;
    }

    String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Registration r = new Registration();
        r.setEmail("user123@yahoo.com");
        r.setUserName("username124");
        r.setPassword("userpass123");
    }
}
