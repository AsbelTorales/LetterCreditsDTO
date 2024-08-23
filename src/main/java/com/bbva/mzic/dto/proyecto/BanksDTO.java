package com.bbva.mzic.dto.proyecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


//The BanksDTO class...
 
public class BanksDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	//Attributes section for the DTO 

	private int id;
    private String name;
    private String address;
    private List<CodeDTO> code;

}

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CodeDTO> getCode() {
        return code;
    }

    public void setCode(List<CodeDTO> code) {
        this.code = code;
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
					.append(id, rhs.id)
					.append(name, rhs.name)
					.append(address, rhs.address)
					.append(code, rhs.code)
					.isEquals();
	}

	
	//Returns a hash code value for the object.
	 
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
			.append(this.name)
			.append(this.address)
			.append(this.code)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("name", name)
			.append("address", address)
			.append("code", code)
			.toString();
	}

