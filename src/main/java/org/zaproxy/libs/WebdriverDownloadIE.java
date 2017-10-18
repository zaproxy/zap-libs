/*
 * Zed Attack Proxy (ZAP) and its related class files.
 * 
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 *   
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */
package org.zaproxy.libs;

public class WebdriverDownloadIE {

    /**
     * The webdriver files are not held in the repo to prevent space problems. Run the program to download the files before
     * building the add-on. It will need to be changed whenever there are new versions.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // IEDriverServer releases: http://www.seleniumhq.org/download/

        final String SHORT_VERSION = "3.6";
        final String LONG_VERSION = "3.6.0";

        DownloadTools.downloadDriver(
                "http://selenium-release.storage.googleapis.com/" + SHORT_VERSION + "/IEDriverServer_Win32_" + LONG_VERSION + ".zip",
                "files/webdriver/windows/32/",
                "IEDriverServer.exe");

        DownloadTools.downloadDriver(
                "http://selenium-release.storage.googleapis.com/" + SHORT_VERSION + "/IEDriverServer_x64_" + LONG_VERSION + ".zip",
                "files/webdriver/windows/64/",
                "IEDriverServer.exe");
    }
}
