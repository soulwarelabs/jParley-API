/*
 * Project:  jParley-API
 * Outline:  jParley framework API components
 *
 * File:     Converter.java
 * Folder:   /.../com/soulwarelabs/jparley
 * Revision: 1.03, 08 April 2014
 * Created:  08 February 2014
 * Author:   Ilya Gubarev
 *
 * Copyright (c) 2013-2014 Soulware Labs, Ltd.
 * Contact information is available at http://www.soulwarelabs.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.soulwarelabs.jparley;

import java.sql.Connection;
import java.sql.SQLException;

import com.soulwarelabs.jcommons.Optional;

/**
 * SQL data converter.
 *
 * @since v1.0
 *
 * @author Ilya Gubarev
 * @version 08 April 2014
 */
public interface Converter {

    /**
     * Converts specified data using an SQL connection.
     *
     * @param connection an SQL database connection.
     * @param data data to be converted.
     * @return converted data.
     * @throws SQLException if error occurs while converting data.
     *
     * @see Connection
     *
     * @since v1.0
     */
    @Optional Object apply(Connection connection, @Optional Object data)
            throws SQLException;
}
