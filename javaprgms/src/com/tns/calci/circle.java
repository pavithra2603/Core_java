package com.tns.calci;
public class circle 
{
float radius;
String color;
double area;
public float getRadius() {
	return radius;
}
public void setRadius(float radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
@Override
public String toString() {
	return "circle [radius=" + radius + ", color=" + color + ", area=" + area + "]";
}
}
