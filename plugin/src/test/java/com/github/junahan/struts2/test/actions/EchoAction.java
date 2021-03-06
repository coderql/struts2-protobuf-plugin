/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.github.junahan.struts2.test.actions;

import com.github.junahan.struts2.test.protocol.TestResponse;
import com.opensymphony.xwork2.Action;

public class EchoAction extends TestAction {
	private static final long serialVersionUID = -2144322110047021579L;
	private String echoMessage;
	
	@Override
	public String execute() throws Exception {
		if (echoMessage == null) echoMessage = " ";
		TestResponse.Builder trb = TestResponse.newBuilder();
		trb.setEchoMessage(echoMessage);
		responseMessage = trb.build();
		return Action.SUCCESS;
	}

	public String getEchoMessage() {
		return echoMessage;
	}

	public void setEchoMessage(String echoMessage) {
		this.echoMessage = echoMessage;
	}

}
