/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.rackspace.cloudbigdata.us.v1.features;

import org.jclouds.rackspace.cloudbigdata.v1.features.ClusterApiLiveTest;
import org.testng.annotations.Test;

/**
 * Tests GroupApi - live
 *
 * @author Zack Shoylev
 */
@Test(groups = "live", testName = "AutoscaleUSGroupApiLiveTest", singleThreaded = true)
public class CloudBigDataUSClusterApiLiveTest extends ClusterApiLiveTest {
   /**
    * Ensures parent tests are executed for this provider.
    */
   public CloudBigDataUSClusterApiLiveTest() {
      provider = "rackspace-cloudbigdata-us";
   }
}
