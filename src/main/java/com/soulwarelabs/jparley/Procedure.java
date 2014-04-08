/*
 * Project:  jParley-API
 * Outline:  jParley framework API components
 *
 * File:     Procedure.java
 * Folder:   /.../com/soulwarelabs/jparley
 * Revision: 1.06, 08 April 2014
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

import com.soulwarelabs.jcommons.Hood;

/**
 *
 * @author gubarev
 */
public interface Procedure extends Subroutine {

    Hood<Object> setOutput(int index, int sqlType);

    Hood<Object> setOutput(String name, int sqlType);

    Hood<Object> setOutput(int index, int sqlType, String structName);

    Hood<Object> setOutput(String name, int sqlType, String structName);

    Hood<Object> setOutput(int index, int sqlType, Converter decoder);

    Hood<Object> setOutput(String name, int sqlType, Converter decoder);

    Hood<Object> setOutput(int index, int sqlType, String structName,
            Converter decoder);

    Hood<Object> setOutput(String name, int sqlType, String structName,
            Converter decoder);
}
