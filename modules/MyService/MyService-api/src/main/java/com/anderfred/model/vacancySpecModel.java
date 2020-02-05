/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.anderfred.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the vacancySpec service. Represents a row in the &quot;vacancySpec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.anderfred.model.impl.vacancySpecModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.anderfred.model.impl.vacancySpecImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vacancySpec
 * @generated
 */
@ProviderType
public interface vacancySpecModel extends BaseModel<vacancySpec> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vacancy spec model instance should use the {@link vacancySpec} interface instead.
	 */

	/**
	 * Returns the primary key of this vacancy spec.
	 *
	 * @return the primary key of this vacancy spec
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this vacancy spec.
	 *
	 * @param primaryKey the primary key of this vacancy spec
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this vacancy spec.
	 *
	 * @return the ID of this vacancy spec
	 */
	public int getId();

	/**
	 * Sets the ID of this vacancy spec.
	 *
	 * @param id the ID of this vacancy spec
	 */
	public void setId(int id);

	/**
	 * Returns the name of this vacancy spec.
	 *
	 * @return the name of this vacancy spec
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this vacancy spec.
	 *
	 * @param name the name of this vacancy spec
	 */
	public void setName(String name);

}