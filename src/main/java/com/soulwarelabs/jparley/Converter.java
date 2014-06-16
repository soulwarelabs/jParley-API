/*
 * Project:  jParley-API
 * Outline:  jParley framework API components
 *
 * File:     Converter.java
 * Folder:   /.../com/soulwarelabs/jparley
 * Revision: 1.07, 16 June 2014
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

/**
 * SQL data converter.
 * <p>
 * The converter performs data transformation on an opened SQL database
 * connection. Can be used to encode Java data type into SQL structure
 * or vice versa.
 * <p>
 * Designed to be thread-safe.
 *
 * @since v1.0.0
 *
 * @author Ilya Gubarev
 * @version 16 June 2014
 */
public interface Converter {

    /**
     * Transforms specified data using opened SQL connection.
     *
     * @param connection SQL database connection.
     * @param data data to be transformed (optional).
     * @return transformed data (optional).
     * @throws SQLException if error occurs while performing transformation.
     *
     * @see Connection
     *
     * @since v1.0.0
     */
    Object perform(Connection connection, Object data) throws SQLException;
}
