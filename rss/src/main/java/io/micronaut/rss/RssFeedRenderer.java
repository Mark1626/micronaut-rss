/*
 * Copyright 2017-2020 original authors
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

package io.micronaut.rss;

import io.micronaut.core.io.Writable;

/**
 * Interface which defines the render of an {@link io.micronaut.rss.RssChannel} to {@link io.micronaut.core.io.Writable}.
 *
 * @author Sergio del Amo
 * @since 1.0
 */
public interface RssFeedRenderer {
    /**
     * Renders an RSS channel to a {@link io.micronaut.core.io.Writable}.
     * @param rssChannel The RSS channel to render
     * @return A {@link io.micronaut.core.io.Writable}.
     */
    Writable render(RssChannel rssChannel);
}
