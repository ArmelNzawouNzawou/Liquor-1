package service.address.Impl;

import domain.users.Address;
import factory.repository.AddressRepFactory;
import org.springframework.stereotype.Component;
import repository.address.Impl.AddressRep;
import service.address.AddressInt;

import java.util.ArrayList;

@Component
public class AddressService implements AddressInt {
    private static AddressService addressService;
    private AddressRep addressRep= AddressRepFactory.getAddress();

    private AddressService() {
    }

    public static AddressService getAddressService(){
        if(addressService==null){
            addressService=new AddressService();

        }return addressService;
    }
    @Override
    public Address create(Address address) {
        return addressRep.create(address);
    }

    @Override
    public Address update(Address address) {
        return addressRep.update(address);
    }

    @Override
    public void delete(String id) {
        addressRep.delete(id);
    }

    @Override
    public Address read(String id) {
        return addressRep.read(id);
    }

    @Override
    public ArrayList<Address> readAlll() {
        return addressRep.readAll();
    }
}
