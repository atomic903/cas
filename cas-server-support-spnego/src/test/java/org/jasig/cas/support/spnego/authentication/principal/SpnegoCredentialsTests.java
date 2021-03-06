/*
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.support.spnego.authentication.principal;

import org.jasig.cas.authentication.principal.Principal;
import org.jasig.cas.authentication.principal.SimplePrincipal;
import org.jasig.cas.support.spnego.authentication.principal.SpnegoCredentials;

import junit.framework.TestCase;


public class SpnegoCredentialsTests extends TestCase {

    
    public void testToStringWithNoPrincipal() {
        final SpnegoCredentials credentials = new SpnegoCredentials(new byte[] {});
        
        assertTrue(credentials.toString().contains("unknown"));
    }
    
    public void testToStringWithPrincipal() {
        final SpnegoCredentials credentials = new SpnegoCredentials(new byte[] {});
        final Principal principal = new SimplePrincipal("test");
        credentials.setPrincipal(principal);
        assertEquals("test", credentials.toString());
    }
}
