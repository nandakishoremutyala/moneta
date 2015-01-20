/*
 * This software is licensed under the Apache License, Version 2.0
 * (the "License") agreement; you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moneta;

import java.sql.Connection;
import java.util.Properties;

import org.junit.Before;

public class HSqlTest {
	
	protected Connection nativeConnection;

	@Before
	public void setUp() throws Exception {
		org.hsqldb.jdbcDriver nativeDriver = new org.hsqldb.jdbcDriver();
        nativeConnection = nativeDriver.connect("jdbc:hsqldb:mem:TestDb", new Properties());
	}


}
