package com.teachercrm.neetcode;

public class DeepInstinct {


    public static class Dog {
        String name;

        public Dog(String name)
        {
            this.name=name;
        }
    }

    public static void swap (Dog dog1, Dog dog2)
    {
        Dog temp=dog1;
        dog1 = dog2;
        dog2=temp;
    }


    public static void main(String[] args)
    {
        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2");

        swap(dog1,dog2);

        System.out.println(dog1.name);
        System.out.println(dog2.name);

    }

}
