/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.feedserver.metadata;


/**
 * Defines a basic date type. the date should be in a "YYYY-MM-DD" format
 * according to ISO 8601. Only the date part (year, month, day) are specified
 * and they are all mandatory.
 * 
 * @link http://en.wikipedia.org/wiki/ISO_8601
 */
public class SimpleDateTypeInfo extends BasicTypeInfo {

  public static final String NAME = "date";

  /**
   * Constructs a new basic type info.
   */
  public SimpleDateTypeInfo() {
    super(NAME);
  }
}
