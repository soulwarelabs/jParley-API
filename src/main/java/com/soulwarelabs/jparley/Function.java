/*
 * Project:  jParley-API
 * Outline:  jParley framework API components
 *
 * File:     Function.java
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
 * Common SQL stored function.
 *
 * @see Subroutine
 *
 * @since v1.0.0
 *
 * @author Ilya Gubarev
 * @version 16 June 2014
 */
public interface Function extends Subroutine {

    /**
     * Gets function result SQL data decoder (optional).
     *
     * @return SQL data decoder (optional).
     *
     * @see Converter
     *
     * @since v1.0.0
     */
    Converter getDecoder();

    /**
     * Sets function result SQL data decoder (optional).
     *
     * @param decoder SQL data decoder (optional).
     *
     * @see Converter
     *
     * @since v1.0.0
     */
    void setDecoder(Converter decoder);

    /**
     * Gets a boxed result of the function.
     *
     * @return boxed function result.
     *
     * @see Box
     *
     * @since v1.0.0
     */
    Box<Object> getResult();

    /**
     * Gets function result SQL structure name.
     *
     * @return SQL structure name (optional).
     *
     * @since v1.0.0
     */
    String getStruct();

    /**
     * Sets function result SQL structure name.
     *
     * @param struct SQL structure name (optional).
     *
     * @since v1.0.0
     */
    void setStruct(String struct);

    /**
     * Gets function result SQL type code.
     *
     * @return SQL type code.
     *
     * @since v1.0.0
     */
    int getType();

    /**
     * Sets function result SQL type code.
     *
     * @param type SQL type code.
     *
     * @since v1.0.0
     */
    void setType(int type);
}
