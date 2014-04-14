/*
 * Project:  jParley-API
 * Outline:  jParley framework API components
 *
 * File:     Subroutine.java
 * Folder:   /.../com/soulwarelabs/jparley
 * Revision: 1.10, 08 April 2014
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

import com.soulwarelabs.jcommons.Box;
import com.soulwarelabs.jcommons.Optional;

/**
 * Common SQL stored subroutine.
 *
 * @since v1.0
 *
 * @author Ilya Gubarev
 * @version 08 April 2014
 */
public interface Subroutine {

    /**
     * Gets a full-qualified name of the subroutine.
     *
     * @return full-qualified name.
     *
     * @since v1.0
     */
    String getName();

    /**
     * Executes the subroutine.
     *
     * @param connection SQL database connection.
     * @throws SQLException if error occurs while executing the subroutine.
     *
     * @see Connection
     *
     * @since v1.0
     */
    void execute(Connection connection) throws SQLException;

    /**
     * Sets a new input parameter.
     *
     * @param index parameter index.
     * @param value boxed parameter initial value.
     *
     * @see Box
     *
     * @since v1.0
     */
    void input(int index, Box<?> value);

    /**
     * Sets a new input parameter.
     *
     * @param index parameter index.
     * @param value parameter initial value.
     *
     * @since v1.0
     */
    void input(int index, @Optional Object value);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value boxed parameter initial value.
     *
     * @see Box
     *
     * @since v1.0
     */
    void input(String name, Box<?> value);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value parameter initial value.
     *
     * @since v1.0
     */
    void input(String name, @Optional Object value);

    /**
     * Sets a new input parameter.
     *
     * @param index parameter index.
     * @param value boxed parameter initial value.
     * @param type parameter SQL type code.
     *
     * @see Box
     *
     * @since v1.0
     */
    void input(int index, Box<?> value, int type);

    /**
     * Sets a new input parameter.
     *
     * @param index parameter index.
     * @param value parameter initial value.
     * @param type parameter SQL type code.
     *
     * @since v1.0
     */
    void input(int index, @Optional Object value, int type);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value boxed parameter initial value.
     * @param type parameter SQL type code.
     *
     * @see Box
     *
     * @since v1.0
     */
    void input(String name, Box<?> value, int type);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value parameter initial value.
     * @param type parameter SQL type code.
     *
     * @since v1.0
     */
    void input(String name, @Optional Object value, int type);

    /**
     * Sets a new input parameter.
     *
     * @param index parameter index.
     * @param value boxed parameter initial value.
     * @param encoder parameter SQL data encoder.
     *
     * @see Box
     * @see Converter
     *
     * @since v1.0
     */
    void input(int index, Box<?> value, Converter encoder);

    /**
     * Sets a new input parameter.
     *
     * @param index parameter index.
     * @param value parameter initial value.
     * @param encoder parameter SQL data encoder.
     *
     * @see Converter
     *
     * @since v1.0
     */
    void input(int index, @Optional Object value, Converter encoder);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value boxed parameter initial value.
     * @param encoder parameter SQL data encoder.
     *
     * @see Box
     * @see Converter
     *
     * @since v1.0
     */
    void input(String name, Box<?> value, Converter encoder);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value parameter initial value.
     * @param encoder parameter SQL data encoder.
     *
     * @see Converter
     *
     * @since v1.0
     */
    void input(String name, @Optional Object value, Converter encoder);

    /**
     * Resets the subroutine to its initial state.
     *
     * @since v1.0
     */
    void reset();
}
