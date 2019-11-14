package com.lisp.engine.base.domain;

/* author:Qinzijing
*  date: 2019/11/14
*  description:3维向量
*/
public class Vector3f {
    private float x;
    private float y;
    private float z;


    /*
    * 构造函数
    * */
    public Vector3f(float x, float y, float z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }
    /*
    * 求模
    * */
    public float length()
    {
        return (float)Math.sqrt(x * x + y * y + z * z);
    }
    /*
    * 点积
    * */
    public float dot(Vector3f r)
    {
        return x * r.getX() + y * r.getY() + z * r.getZ();
    }
    /*
    * 叉积
    * */
    public Vector3f cross(Vector3f r)
    {
        float x_ = y * r.getZ() - z * r.getY();
        float y_ = z * r.getX() - x * r.getZ();
        float z_ = x * r.getY() - y * r.getX();

        return new Vector3f(x_, y_, z_);
    }
    /*
    * 单位化
    * */
    public Vector3f normalize()
    {
        float length = length();

        x /= length;
        y /= length;
        z /= length;

        return this;
    }
    /*
    * 旋转
    * */
    public Vector3f rotate()
    {
        return null;
    }

    /*
    *
    * 加减乘除
    * */
    public Vector3f add(Vector3f r)
    {
        return new Vector3f(x + r.getX(), y + r.getY(), z + r.getZ());
    }

    public Vector3f add(float r)
    {
        return new Vector3f(x + r, y + r, z + r);
    }

    public Vector3f sub(Vector3f r)
    {
        return new Vector3f(x - r.getX(), y - r.getY(), z - r.getZ());
    }

    public Vector3f sub(float r)
    {
        return new Vector3f(x - r, y - r, z - r);
    }

    public Vector3f mul(Vector3f r)
    {
        return new Vector3f(x * r.getX(), y * r.getY(), z * r.getZ());
    }

    public Vector3f mul(float r)
    {
        return new Vector3f(x * r, y * r, z * r);
    }

    public Vector3f div(Vector3f r)
    {
        return new Vector3f(x / r.getX(), y / r.getY(), z / r.getZ());
    }

    public Vector3f div(float r)
    {
        return new Vector3f(x / r, y / r, z / r);
    }

    /*
    * getter setter
    * */
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
}