/*
 *  Copyright 2010 Christopher Pheby
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
package org.jadira.usertype.dateandtime.joda;

import java.math.BigInteger;

import org.jadira.usertype.dateandtime.shared.spi.AbstractUserType;
import org.joda.time.Instant;

import org.jadira.usertype.dateandtime.joda.columnmapper.BigIntegerColumnInstantMapper;

/**
 * Persist {@link Instant} via Hibernate using nanoseconds of the day. This class is INCOMPATIBLE with
 * Joda Time's {@link org.joda.time.contrib.hibernate.PersistentInstantExact} because that class uses a millisecond rather than nanosecond
 * absolute value. For compatibility use {@link PersistentInstantAsMillisLong}
 * @see PersistentInstantAsMillisLong
 */
public class PersistentInstantAsNanosBigInteger extends AbstractUserType<Instant, BigInteger, BigIntegerColumnInstantMapper> {
}
