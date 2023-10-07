public class DatabaseConfig {
    private String databaseType;
    private String user;
    private String password;
    private String databaseName;
    private String port = "3306";

    private DatabaseConfig() {
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getPort() {
        return port;
    }

    static class DatabaseConfigBuilder {
        private DatabaseConfig databaseConfig = new DatabaseConfig();

        public DatabaseConfigBuilder setDatabaseType(String databaseType) {
            databaseConfig.databaseType = databaseType;
            return this;
        }

        public DatabaseConfigBuilder setUser(String user) {
            databaseConfig.user = user;
            return this;
        }

        public DatabaseConfigBuilder setPassword(String password) {
            databaseConfig.password = password;
            return this;
        }

        public DatabaseConfigBuilder setDatabaseName(String databaseName) {
            databaseConfig.databaseName = databaseName;
            return this;
        }

        public DatabaseConfigBuilder setPort(String port) {
            databaseConfig.port = port;
            return this;
        }

        public DatabaseConfig build() {
            if (databaseConfig.getDatabaseType() == null
                    || databaseConfig.getUser() == null
                    || databaseConfig.getPassword() == null
                    || databaseConfig.getDatabaseName() == null) {
                throw new NullPointerException("Khởi tạo thiếu tham số: user, password, databaseType, databaseName không thể null !");
            }
            return databaseConfig;
        }
    }

    @Override
    public String toString() {
        return "DatabaseConfig{" +
                "databaseType='" + databaseType + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", databaseName='" + databaseName + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
