/*
 * Copyright (C) 2015-2016 KeepSafe Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.getkeepsafe.dexcount

/**
 * Configuration properties for {@link DexMethodCountTask} instances.
 */
class DexMethodCountExtension {
    private boolean includeClasses
    private boolean orderByMethodCount
    private boolean includeFieldCount = true
    private boolean includeTotalMethodCount = false
    private OutputFormat format = OutputFormat.LIST
    private boolean verbose

    /**
     * When true, includes individual classes in task output.
     * When false, only packages are included.
     */
    public boolean getIncludeClasses() {
        return includeClasses
    }

    public void setIncludeClasses(boolean includeClasses) {
        this.includeClasses = includeClasses
    }

    /**
     * When true, the task's output file is printed to the build's standard
     * output.
     */
    public boolean getVerbose() {
        return verbose
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose
    }

    /**
     * When true, the number of fields in a package or a class is also included
     * in the task's output.
     */
    public boolean getIncludeFieldCount() {
        return includeFieldCount
    }

    public void setIncludeFieldCount(boolean countFields) {
        this.includeFieldCount = countFields
    }

    /**
     * When true, includes the total number of methods in the task's output.
     */
    public boolean getIncludeTotalMethodCount() {
        return includeTotalMethodCount
    }

    public void setIncludeTotalMethodCount(boolean includeTotalMethodCount) {
        this.includeTotalMethodCount = includeTotalMethodCount;
    }

    /**
     * When true, the task's output list is sorted in descending order by
     * method counts, with larger packages appearing higher in the list.
     */
    public boolean getOrderByMethodCount() {
        return this.orderByMethodCount
    }

    public void setOrderByMethodCount(boolean orderByMethodCount) {
        this.orderByMethodCount = orderByMethodCount
    }

    public OutputFormat getFormat() {
        return format;
    }

    public void setFormat(Object format) {
        if (format instanceof OutputFormat) {
            this.format = (OutputFormat) format;
        } else {
            try {
                def formatName = "$format".toUpperCase(Locale.US)
                this.format = OutputFormat.valueOf(formatName)
            } catch (IllegalArgumentException ignored) {
                throw new IllegalArgumentException("Unrecognized output format '$format'")
            }
        }
    }
}
