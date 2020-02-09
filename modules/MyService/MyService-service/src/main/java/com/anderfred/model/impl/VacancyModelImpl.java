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

package com.anderfred.model.impl;

import com.anderfred.model.Vacancy;
import com.anderfred.model.VacancyModel;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.ProxyUtil;
import org.osgi.annotation.versioning.ProviderType;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.sql.Types;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Vacancy service. Represents a row in the &quot;vacancy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>VacancyModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VacancyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacancyImpl
 * @generated
 */
@ProviderType
public class VacancyModelImpl
	extends BaseModelImpl<Vacancy> implements VacancyModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vacancy model instance should use the <code>Vacancy</code> interface instead.
	 */
	public static final String TABLE_NAME = "vacancy";

	public static final Object[][] TABLE_COLUMNS = {
		{"id_", Types.INTEGER}, {"publishedDate", Types.TIMESTAMP},
		{"employer", Types.VARCHAR}, {"text_", Types.VARCHAR},
		{"salary", Types.VARCHAR}, {"area", Types.INTEGER},
		{"spec", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("publishedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("employer", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("text_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("salary", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("area", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("spec", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table vacancy (id_ INTEGER not null primary key,publishedDate DATE null,employer VARCHAR(75) null,text_ VARCHAR(75) null,salary VARCHAR(75) null,area INTEGER,spec INTEGER)";

	public static final String TABLE_SQL_DROP = "drop table vacancy";

	public static final String ORDER_BY_JPQL = " ORDER BY vacancy.id ASC";

	public static final String ORDER_BY_SQL = " ORDER BY vacancy.id_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	public VacancyModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Vacancy.class;
	}

	@Override
	public String getModelClassName() {
		return Vacancy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Vacancy, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Vacancy, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Vacancy, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Vacancy)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Vacancy, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Vacancy, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Vacancy)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Vacancy, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Vacancy, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Vacancy>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Vacancy.class.getClassLoader(), Vacancy.class, ModelWrapper.class);

		try {
			Constructor<Vacancy> constructor =
				(Constructor<Vacancy>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<Vacancy, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Vacancy, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Vacancy, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Vacancy, Object>>();
		Map<String, BiConsumer<Vacancy, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Vacancy, ?>>();

		attributeGetterFunctions.put("id", Vacancy::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<Vacancy, Integer>)Vacancy::setId);
		attributeGetterFunctions.put(
			"publishedDate", Vacancy::getPublishedDate);
		attributeSetterBiConsumers.put(
			"publishedDate",
			(BiConsumer<Vacancy, Date>)Vacancy::setPublishedDate);
		attributeGetterFunctions.put("employer", Vacancy::getEmployer);
		attributeSetterBiConsumers.put(
			"employer", (BiConsumer<Vacancy, String>)Vacancy::setEmployer);
		attributeGetterFunctions.put("text", Vacancy::getText);
		attributeSetterBiConsumers.put(
			"text", (BiConsumer<Vacancy, String>)Vacancy::setText);
		attributeGetterFunctions.put("salary", Vacancy::getSalary);
		attributeSetterBiConsumers.put(
			"salary", (BiConsumer<Vacancy, String>)Vacancy::setSalary);
		attributeGetterFunctions.put("area", Vacancy::getArea);
		attributeSetterBiConsumers.put(
			"area", (BiConsumer<Vacancy, Integer>)Vacancy::setArea);
		attributeGetterFunctions.put("spec", Vacancy::getSpec);
		attributeSetterBiConsumers.put(
			"spec", (BiConsumer<Vacancy, Integer>)Vacancy::setSpec);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;
	}

	@Override
	public Date getPublishedDate() {
		return _publishedDate;
	}

	@Override
	public void setPublishedDate(Date publishedDate) {
		_publishedDate = publishedDate;
	}

	@Override
	public String getEmployer() {
		if (_employer == null) {
			return "";
		}
		else {
			return _employer;
		}
	}

	@Override
	public void setEmployer(String employer) {
		_employer = employer;
	}

	@Override
	public String getText() {
		if (_text == null) {
			return "";
		}
		else {
			return _text;
		}
	}

	@Override
	public void setText(String text) {
		_text = text;
	}

	@Override
	public String getSalary() {
		if (_salary == null) {
			return "";
		}
		else {
			return _salary;
		}
	}

	@Override
	public void setSalary(String salary) {
		_salary = salary;
	}

	@Override
	public int getArea() {
		return _area;
	}

	@Override
	public void setArea(int area) {
		_area = area;
	}

	@Override
	public int getSpec() {
		return _spec;
	}

	@Override
	public void setSpec(int spec) {
		_spec = spec;
	}

	@Override
	public Vacancy toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Vacancy>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VacancyImpl vacancyImpl = new VacancyImpl();

		vacancyImpl.setId(getId());
		vacancyImpl.setPublishedDate(getPublishedDate());
		vacancyImpl.setEmployer(getEmployer());
		vacancyImpl.setText(getText());
		vacancyImpl.setSalary(getSalary());
		vacancyImpl.setArea(getArea());
		vacancyImpl.setSpec(getSpec());

		vacancyImpl.resetOriginalValues();

		return vacancyImpl;
	}

	@Override
	public int compareTo(Vacancy vacancy) {
		int primaryKey = vacancy.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Vacancy)) {
			return false;
		}

		Vacancy vacancy = (Vacancy)obj;

		int primaryKey = vacancy.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Vacancy> toCacheModel() {
		VacancyCacheModel vacancyCacheModel = new VacancyCacheModel();

		vacancyCacheModel.id = getId();

		Date publishedDate = getPublishedDate();

		if (publishedDate != null) {
			vacancyCacheModel.publishedDate = publishedDate.getTime();
		}
		else {
			vacancyCacheModel.publishedDate = Long.MIN_VALUE;
		}

		vacancyCacheModel.employer = getEmployer();

		String employer = vacancyCacheModel.employer;

		if ((employer != null) && (employer.length() == 0)) {
			vacancyCacheModel.employer = null;
		}

		vacancyCacheModel.text = getText();

		String text = vacancyCacheModel.text;

		if ((text != null) && (text.length() == 0)) {
			vacancyCacheModel.text = null;
		}

		vacancyCacheModel.salary = getSalary();

		String salary = vacancyCacheModel.salary;

		if ((salary != null) && (salary.length() == 0)) {
			vacancyCacheModel.salary = null;
		}

		vacancyCacheModel.area = getArea();

		vacancyCacheModel.spec = getSpec();

		return vacancyCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Vacancy, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Vacancy, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Vacancy, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Vacancy)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Vacancy, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Vacancy, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Vacancy, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Vacancy)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Vacancy>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private int _id;
	private Date _publishedDate;
	private String _employer;
	private String _text;
	private String _salary;
	private int _area;
	private int _spec;
	private Vacancy _escapedModel;

}