package ssm.exc.po;

public class Navigator {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column navigator.id
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column navigator.name
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column navigator.id
     *
     * @return the value of navigator.id
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column navigator.id
     *
     * @param id the value for navigator.id
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column navigator.name
     *
     * @return the value of navigator.name
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column navigator.name
     *
     * @param name the value for navigator.name
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}