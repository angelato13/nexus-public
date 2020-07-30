/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.content.event.repository;

import org.sonatype.nexus.repository.Repository;
import org.sonatype.nexus.repository.content.RepositoryContent;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.sonatype.nexus.repository.content.store.InternalIds.contentRepositoryId;

/**
 * Base {@link RepositoryContent} event.
 *
 * @since 3.next
 */
public class RepositoryContentEvent
{
  protected final RepositoryContent content;

  public RepositoryContentEvent(final RepositoryContent content) {
    this.content = checkNotNull(content);
  }

  public RepositoryContent getContent() {
    return content;
  }

  public boolean fromRepository(final Repository repository) {
    return contentRepositoryId(content) == contentRepositoryId(repository);
  }
}