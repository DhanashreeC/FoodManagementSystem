/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.order.foodOffer.FoodOfferMasterOrderCatalog;
import business.role.HouseholdUserRole;
import business.role.Role;
import business.order.uglyGrocery.UglyGroceryMasterOrderCatalog;
import java.util.ArrayList;

/**
 *
 * @author Monas
 */
public class HouseholdOrganization extends Organization {

    private UglyGroceryMasterOrderCatalog uglyGroceryMasterOrderCatalog;
    private FoodOfferMasterOrderCatalog foodOfferMasterOrderCatalog;

    public HouseholdOrganization(String name) {
        super(name);
        uglyGroceryMasterOrderCatalog = new UglyGroceryMasterOrderCatalog();
        foodOfferMasterOrderCatalog = new FoodOfferMasterOrderCatalog();
    }

    public UglyGroceryMasterOrderCatalog getUglyGroceryMasterOrderCatalog() {
        return uglyGroceryMasterOrderCatalog;
    }

    public FoodOfferMasterOrderCatalog getFoodOfferMasterOrderCatalog() {
        return foodOfferMasterOrderCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HouseholdUserRole());
        return roles;
    }
}
