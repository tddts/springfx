/*
 * Copyright 2018 Tigran Dadaiants
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.tddts.sprix.exception;

/**
 * Generic view exception.
 *
 * @author Tigran_Dadaiants dtkcommon@gmail.com
 */
public class SprixViewException extends SprixException {

  public SprixViewException() {
  }

  public SprixViewException(String s) {
    super(s);
  }

  public SprixViewException(String s, Throwable throwable) {
    super(s, throwable);
  }

  public SprixViewException(Throwable throwable) {
    super(throwable);
  }

  public SprixViewException(String s, Throwable throwable, boolean b, boolean b1) {
    super(s, throwable, b, b1);
  }
}
