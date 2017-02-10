/**
 * Copyright (C) 2017 uphy.jp
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.uphy.wso2.wso2am.example;

import org.wso2.am.admin.clients.registry.ResourceAdminServiceClient;
import org.wso2.carbon.endpoint.stub.types.EndpointAdminEndpointAdminException;
import org.wso2.carbon.registry.info.stub.RegistryExceptionException;
import org.wso2.carbon.registry.resource.stub.ResourceAdminServiceExceptionException;
import org.wso2.carbon.rest.api.stub.RestApiAdminAPIException;

import java.rmi.RemoteException;


/**
 * @author Yuhi Ishikura
 */
public class ResourceAdminServiceClientSample {

  public static void main(String[] args) throws RemoteException, RestApiAdminAPIException, EndpointAdminEndpointAdminException, RegistryExceptionException, ResourceAdminServiceExceptionException {
    System.setProperty("javax.net.ssl.trustStore", "/Users/ishikura/wso2am/wso2am-2.1.0/repository/resources/security/wso2carbon.jks");
    final String backendUrl = "https://localhost:9443/services/";
    final String userName = "admin";
    final String password = "admin";
    final String path = "/_system/governance/apimgt/applicationdata/workflow-extensions.xml";

    final ResourceAdminServiceClient client = new ResourceAdminServiceClient(backendUrl, userName, password);
    System.out.println(client.getTextContent(path));
  }

}
