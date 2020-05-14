/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.immutable;

public final class MyImmutableClass {
    private final int count;
    private final Employee employee;

    public MyImmutableClass(int count, Employee employee) {
        this.count = count;
        this.employee = employee;
    }

    public int getCount() {
        return count;
    }

    public Employee getEmployee() throws CloneNotSupportedException {
        return (Employee) employee.clone();
    }
}
