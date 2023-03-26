package org.testjfx;

import com.paulweider.User;

public abstract class AbstractUser implements User
{
    private String fname, sname;
    private int age = 0;

    @Override
    public String getFirstName()
    {
        return this.fname;
    }

    @Override
    public String getSecondName()
    {
        return this.sname;
    }

    @Override
    public int getAge()
    {
        return this.age;
    }

    @Override
    public abstract void register();
}
