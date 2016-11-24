/*
 * Copyright 2009-2014 PrimeTek.
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
package com.example.view.data.tree;

import com.example.service.DocumentService;
import org.primefaces.model.TreeNode;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Named("treeIconView")
public class IconView {

	private TreeNode root;

//	@ManagedProperty("#{documentService}")
	private DocumentService service;

	@Inject
	public IconView(DocumentService service) {
		this.service = service;
	}

	@PostConstruct
	public void init() {
		root = service.createDocuments();
	}

	public void setService(DocumentService service) {
		this.service = service;
	}

	public TreeNode getRoot() {
		return root;
	}
}
