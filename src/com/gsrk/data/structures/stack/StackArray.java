package com.gsrk.data.structures.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackArray {
	private int[] arrStack ;
	private int size;
	private int index;
	

	public StackArray(int size){
		this.size= size;
		arrStack = new int[size];
	}
	
	public void push(int element){
		
		if(isFull()){
			throw new StackOverflowError();
		}else{
			arrStack[index]= element;
			index++;
		}
		
	}
	
	public int pop(){
		
		if(isEmpty()){
			throw new EmptyStackException();
		}else{
			  index-- ;
		        return arrStack[index--]; 
		}
		
	}
	
	public int size(){
		return index;
	}
	
	 
	public void printStack(){
		System.out.println(Arrays.toString(arrStack));
	}
	
	
	private boolean isFull(){
		if(index==size){
			return true;
		}else{
			return false;
		}
		
	}
	
	private boolean isEmpty(){
		if(index==0){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	public static void main(String rags[]){
		
		StackArray stack = new StackArray(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.printStack();
		
		
		//stack.pop();
		
		System.out.println("After POP" + 	stack.pop());
		
		stack.printStack();
	}
		
}
