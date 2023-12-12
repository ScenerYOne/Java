class Login {
    private String username;
    private String password;

    public Login(String u, String p) {
        this.username = u;
        this.password = p;
    }

    public boolean isMatch(String u, String p) {
        return this.username.equals(u) && this.password.equals(p);
    }

    public void setPassword(String p) {
        this.password = p;
    }

    public String toString() {
        return "Username:" + username + ", Password :" + password;
    }
}