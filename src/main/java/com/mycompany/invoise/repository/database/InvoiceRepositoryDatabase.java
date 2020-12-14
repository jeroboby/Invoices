package com.mycompany.invoise.repository.database;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    public void create(Invoice invoice) {
        /*[...]
        PreparedStatement pstmt = connexion.prepareStatement("INSERT INTO FACTURE"
        (NUMBER, CUSTOMERNAME) VALUES (?,?)  *  );
            [...]
        pstmt.executeUpdate();
         */
        System.out.println("Database: invoice added with number: "+invoice.getNumber()+ " for "+ invoice.getCustomerName());
    }
}
