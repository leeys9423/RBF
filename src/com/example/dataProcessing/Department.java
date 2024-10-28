package com.example.dataProcessing;

public class Department {

    private final int deptno;
    private final int dname;
    private final int loc;

    public Department(int deptno, int dname, int loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public int getDname() {
        return dname;
    }

    public int getLoc() {
        return loc;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptno=" + deptno +
                ", dname=" + dname +
                ", loc=" + loc +
                '}';
    }
}
