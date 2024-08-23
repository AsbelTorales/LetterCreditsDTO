package com.bbva.mzic.dto.proyecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


//The LetterCreditsDTO class...
 
public class LetterCreditsDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	//Attributes section for the DTO 

	private String letter;
	private String reference;
	private int secuence;
	private List<BanksDTO> banks;
	private CustomerDTO customer;

}
    // Getters y Setters

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getSecuence() {
        return sequence;
    }

    public void setSecuence(int secuence) {
        this.secuence = secuence;
    }

    public List<BanksDTO> getBanks() {
        return banks;
    }

    public void setBanks(List<BanksDTO> banks) {
        this.banks = banks;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

	
	
	//Indicates whether some other object is "equal to" this one.
	 
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterCreditsDTO rhs = (LetterCreditsDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(letter, rhs.letter)
					.append(reference, rhs.reference)
					.append(secuence, rhs.secuence)
					.append(banks, rhs.banks)
					.append(custumer, rhs.custumer)
					.isEquals();
	}

	
	//Returns a hash code value for the object.
	 
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.letter)
			.append(this.reference)
			.append(this.secuence)
			.append(this.banks)
			.append(this.custumer)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("letter", letter)
			.append("reference", reference)
			.append("secuence", secuence)
			.append("banks", banks)
			.append("custumer", custumer)
			.toString();
	}

