/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2019 the original author or authors.
 */
package org.assertj.core.api;

import java.util.List;
import java.util.Map;

/**
 * Concrete assertions for {@link Map}s without any final methods to allow proxying.
 */
public class ProxyableMapAssert<KEY, VALUE> extends AbstractMapAssert<ProxyableMapAssert<KEY, VALUE>, Map<KEY, VALUE>, KEY, VALUE> {

  public ProxyableMapAssert(Map<KEY, VALUE> actual) {
    super(actual, ProxyableMapAssert.class);
  }

  @Override
  protected <ELEMENT> AbstractListAssert<?, List<? extends ELEMENT>, ELEMENT, ObjectAssert<ELEMENT>> newListAssertInstance(List<? extends ELEMENT> newActual) {
    return new ProxyableListAssert<>(newActual);
  }

}
