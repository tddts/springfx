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

package com.github.tddts.springfx.exception;

/**
 * Generic bean exception.
 *
 * @author Tigran_Dadaiants dtkcommon@gmail.com
 */
public class FxBeanException extends SpringFxException {

  public FxBeanException() {
  }

  public FxBeanException(String message) {
    super(message);
  }

  public FxBeanException(String message, Throwable cause) {
    super(message, cause);
  }

  public FxBeanException(Throwable cause) {
    super(cause);
  }

  public FxBeanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
