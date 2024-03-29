package com.winson.jdkapi.rmi.v2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author winson
 * @date 2022/4/27
 **/
public interface IRemoteMath extends Remote {

    int add(int one, int two) throws RemoteException;

    void sayHello(String msg) throws RemoteException;

}
