/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.Consumers;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String arr[]) {
        Customer adarsha = new Customer("adarsha", "9999");
        greetCustomer(adarsha);
        greetCustomerConsumer.accept(adarsha);
        greetCustomerConsumerV2.accept(adarsha, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, isPhoneShow) ->
            System.out.println("Hello  " + customer.customerName + " thanks for registerring " + (isPhoneShow ? customer.phNumber : "****"));


    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello  " + customer.customerName + " thanks for registerring " + customer.phNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello  " + customer.customerName + " thanks for registerring " + customer.phNumber);
    }

    static class Customer {

        private String customerName;
        private String phNumber;

        public Customer(String customerName, String phNumber) {
            this.customerName = customerName;
            this.phNumber = phNumber;
        }
    }
}


