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
package com.ibdiscord.startup.tasks;

import com.ibdiscord.command.Command;
import com.ibdiscord.startup.AbstractStartupTask;
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/**
 * @author vardy
 * @since 2018.08.22
 */

public final class StartCommands extends AbstractStartupTask {

    public StartCommands() {
        super("Start-Commands");
    }

    @Override
    public void doTask() throws Exception {
        Command.init();
    }

}
