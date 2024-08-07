package net.javaguides.banking_app.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
@Schema(description ="Account Entity")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description ="Unique identifier for the Account", example = "1")
    private long id;
    @Column(name= "account_holder_name")
    @Schema(description ="Account Name", example = "FirstName")
    private String accountHolderName;
    @Schema(description ="Account balance", example = "456700.00")
    private double balance;

}
