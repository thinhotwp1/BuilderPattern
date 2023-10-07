public class Main {
    public static void main(String[] args) {

        /**
         * Builder Pattern được dùng với những object có nhiều thuộc tính phức tạp cần được khởi tạo
         * mặc định hoặc có thể chọn lựa thuộc tính đó hoặc không tùy theo mục đích khởi tạo, điều
         * này giúp flexible hơn khi Factory Pattern khởi tạo nhiều object phức tạp và phải truyền
         * vào quá nhiều tham số đôi khi là không cần thiết.
         *
         * ==> Ví dụ dễ thấy nhất là cấu hình database (Dependency Injection) là một Factory Pattern
         * kết hợp với Builder Pattern để giảm thiểu mức độ phức tạp khi khởi tạo một cấu hình database
         * Có thể khởi tạo các cấu hình chung ở Abstract Factory sau đó khởi tạo những thuộc tính riêng
         * của từng database ở các lớp con như MySQLConnection, OracleConnection,...
         *
         * Ví dụ dưới Khởi tạo đối tượng cấu hình database bằng DatabaseConfigBuilder()
         * Với những cấu hình mặc định như port sẽ là 3306 hoặc có thể cấu hình dựa theo ý muốn.
         */

        // Case success
        DatabaseConfig databaseMysql =
                new DatabaseConfig.DatabaseConfigBuilder()
                        .setDatabaseType("mysql")
                        .setDatabaseName("blog")
                        .setUser("blog")
                        .setPassword("blog")
                        .build();
        System.out.println("Database Mysql success: " + databaseMysql.toString());


        // Case fail, missing properties, throw exception
        DatabaseConfig databaseMissingName =
                new DatabaseConfig.DatabaseConfigBuilder()
                        .setDatabaseType("mysql")
                        .setUser("blog")
                        .setPassword("blog")
                        .build();
    }
}
