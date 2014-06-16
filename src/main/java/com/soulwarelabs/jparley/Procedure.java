/*
 * Project:  jParley-API
 * Outline:  jParley framework API components
 *
 * File:     Procedure.java
 * Folder:   /.../com/soulwarelabs/jparley
 * Revision: 1.14, 16 June 2014
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

import com.soulwarelabs.jcommons.Box;

/**
 * Common SQL stored procedure.
 *
 * @see Subroutine
 *
 * @since v1.0.0
 *
 * @author Ilya Gubarev
 * @version 16 June 2014
 */
public interface Procedure extends Subroutine {

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value boxed parameter initial value.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    void in(String name, Box<?> value);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value parameter initial value (optional).
     *
     * @since v1.0.0
     */
    void in(String name, Object value);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value boxed parameter initial value.
     * @param type parameter SQL type code (optional).
     *
     * @see Box
     *
     * @since v1.0.0
     */
    void in(String name, Box<?> value, Integer type);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value parameter initial value (optional).
     * @param type parameter SQL type code (optional).
     *
     * @since v1.0
     */
    void in(String name, Object value, Integer type);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value boxed parameter initial value.
     * @param encoder parameter SQL data encoder (optional).
     *
     * @see Box
     * @see Converter
     *
     * @since v1.0.0
     */
    void in(String name, Box<?> value, Converter encoder);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value parameter initial value (optional).
     * @param encoder parameter SQL data encoder (optional).
     *
     * @see Converter
     *
     * @since v1.0.0
     */
    void in(String name, Object value, Converter encoder);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value boxed parameter initial value.
     * @param encoder parameter SQL data encoder (optional).
     * @param type parameter SQL type code (optional).
     *
     * @see Box
     * @see Converter
     *
     * @since v1.0.0
     */
    void in(String name, Box<?> value, Integer type, Converter encoder);

    /**
     * Sets a new input parameter.
     *
     * @param name parameter name.
     * @param value parameter initial value (optional).
     * @param encoder parameter SQL data encoder (optional).
     * @param type parameter SQL type code (optional).
     *
     * @see Converter
     *
     * @since v1.0.0
     */
    void in(String name, Object value, Integer type, Converter encoder);

    /**
     * Sets a new output parameter
     *
     * @param index parameter index.
     * @param type parameter SQL type code.
     * @return boxed result.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    Box<Object> out(int index, int type);

    /**
     * Sets a new output parameter
     *
     * @param name parameter name.
     * @param type parameter SQL type code.
     * @return boxed result.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    Box<Object> out(String name, int type);

    /**
     * Sets a new output parameter
     *
     * @param index parameter index.
     * @param type parameter SQL type code.
     * @param struct parameter SQL structure name (optional).
     * @return boxed result.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    Box<Object> out(int index, int type, String struct);

    /**
     * Sets a new output parameter
     *
     * @param name parameter name.
     * @param type parameter SQL type code.
     * @param struct parameter SQL structure name (optional).
     * @return boxed result.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    Box<Object> out(String name, int type, String struct);

    /**
     * Sets a new output parameter
     *
     * @param index parameter index.
     * @param type parameter SQL type code.
     * @param decoder parameter SQL decoder (optional).
     * @return boxed result.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    Box<Object> out(int index, int type, Converter decoder);

    /**
     * Sets a new output parameter
     *
     * @param name parameter name.
     * @param type parameter SQL type code.
     * @param decoder parameter SQL decoder (optional).
     * @return boxed result.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    Box<Object> out(String name, int type, Converter decoder);

    /**
     * Sets a new output parameter
     *
     * @param index parameter index.
     * @param type parameter SQL type code.
     * @param struct parameter SQL structure name (optional).
     * @param decoder parameter SQL decoder (optional).
     * @return boxed result.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    Box<Object> out(int index, int type, String struct, Converter decoder);

    /**
     * Sets a new output parameter
     *
     * @param name parameter name.
     * @param type parameter SQL type code.
     * @param struct parameter SQL structure name (optional).
     * @param decoder parameter SQL decoder (optional).
     * @return boxed result.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    Box<Object> out(String name, int type, String struct, Converter decoder);

    /**
     * Removes specified parameter.
     *
     * @param name parameter name.
     *
     * @since v1.0.0
     */
    void remove(String name);
}
