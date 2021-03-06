/* *****************************************************************************
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
package com.ibdiscord.startup;

import com.ibdiscord.utils.objects.AbstractTask;
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/**
 * @author vardy
 * @since 2018.08.22
 */

public abstract class AbstractStartupTask extends AbstractTask {

    private boolean completed = false;

    public AbstractStartupTask(String name) {
        super(name);
    }

    @Override
    public void execute() {
        try {
            doTask();
            completed = true;

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public abstract void doTask() throws Exception;

    public boolean isCompleted() {
        return completed;
    }
}