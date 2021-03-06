/*
 *  Copyright 2010, 2011 Christopher Pheby
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jadira.usertype.moneyandcurrency.legacyjdk.columnmapper;

import java.math.BigDecimal;

import org.jadira.usertype.spi.shared.AbstractBigDecimalColumnMapper;

public class BigDecimalBigDecimalColumnMapper extends AbstractBigDecimalColumnMapper<BigDecimal> {

	private static final long serialVersionUID = -9337890199015880L;

	@Override
	public BigDecimal fromNonNullValue(BigDecimal value) {
		return value;
	}

	@Override
	public BigDecimal fromNonNullString(String s) {
		return new BigDecimal(s);
	}

	@Override
	public BigDecimal toNonNullValue(BigDecimal value) {
		return value;
	}

	@Override
	public String toNonNullString(BigDecimal value) {
		return value.toString();
	}
}
