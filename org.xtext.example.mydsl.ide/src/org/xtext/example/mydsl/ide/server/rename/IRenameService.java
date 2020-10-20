/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.example.mydsl.ide.server.rename;

import org.eclipse.lsp4j.RenameParams;
import org.eclipse.lsp4j.WorkspaceEdit;
import org.eclipse.xtext.util.CancelIndicator;

import org.xtext.example.mydsl.ide.server.WorkspaceManager;

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 * @deprecated use {@link IRenameService2} instead.
 */
@Deprecated
public interface IRenameService {
	@Deprecated
	WorkspaceEdit rename(WorkspaceManager workspaceManager, RenameParams renameParams, CancelIndicator cancelIndicator);
}