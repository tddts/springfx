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

package com.github.tddts.sprix.beans.impl;

import com.github.tddts.sprix.beans.ResourceBundleProvider;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.support.MessageSourceResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Tigran_Dadaiants dtkcommon@gmail.com
 */
public class MessageSourceResourceBundleProvider implements ResourceBundleProvider, InitializingBean, MessageSourceAware {

  private MessageSource messageSource;
  private ResourceBundle resourceBundle;
  private Locale locale = Locale.getDefault();

  @Override
  public void afterPropertiesSet() throws Exception {
    if (messageSource != null) resourceBundle = new MessageSourceResourceBundle(messageSource, locale);
  }

  @Override
  public void setMessageSource(MessageSource messageSource) {
    this.messageSource = messageSource;
  }

  @Override
  public ResourceBundle getResourceBundle() {
    return resourceBundle;
  }

  public void setLocale(String tag) {
    Locale locale = Locale.forLanguageTag(tag);
    this.locale = locale == null ? Locale.getDefault() : locale;
  }
}
