/*******************************************************************************
 * Copyright 2018 Jarred Vardy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package com.ibdiscord.utils;
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/** @author vardy
 * @since 2018.08.18
 */

import com.ibdiscord.utils.exceptions.JavaVersionException;

public final class UJavaVersion {

    private static final String errorMessage = "You need Java 10 or higher to run this app. Your version: ";

    public static void checkVersion() throws JavaVersionException {
        double version = Double.parseDouble(System.getProperty("java.specification.version"));

        if(version != 10) {
            throwError(version);
            shutdown();
        }
    }

    private static void shutdown() {
        System.exit(1);
    }

    private static void throwError(double version) throws JavaVersionException {
        throw new JavaVersionException(errorMessage + version);
    }
}
