package jp.co.example.DbMapper;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.id
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_number
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    private Integer employeeNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.name
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.Note
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.id
     *
     * @return the value of employee.id
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.id
     *
     * @param id the value for employee.id
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_number
     *
     * @return the value of employee.employee_number
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_number
     *
     * @param employeeNumber the value for employee.employee_number
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.name
     *
     * @return the value of employee.name
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.name
     *
     * @param name the value for employee.name
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.Note
     *
     * @return the value of employee.Note
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.Note
     *
     * @param note the value for employee.Note
     *
     * @mbggenerated Wed Nov 01 20:44:01 JST 2017
     */
    public void setNote(String note) {
        this.note = note;
    }
}