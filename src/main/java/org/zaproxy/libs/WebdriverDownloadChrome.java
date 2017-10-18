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

public class WebdriverDownloadChrome {

    /**
     * The webdriver files are not held in the repo to prevent space problems. Run the program to download the files before
     * building the add-on. It will need to be changed whenever there are new versions.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Chromedriver releases: https://sites.google.com/a/chromium.org/chromedriver/downloads
        final String VERSION = "2.33";

        // Windows
        DownloadTools.downloadDriver(
                "https://chromedriver.storage.googleapis.com/" + VERSION + "/chromedriver_win32.zip",
                "files/webdriver/windows/32/",
                "chromedriver.exe");

        // Linux
        DownloadTools.downloadDriver(
                "https://chromedriver.storage.googleapis.com/" + VERSION + "/chromedriver_linux32.zip",
                "files/webdriver/linux/32/",
                "chromedriver");

        DownloadTools.downloadDriver(
                "https://chromedriver.storage.googleapis.com/" + VERSION + "/chromedriver_linux64.zip",
                "files/webdriver/linux/64/",
                "chromedriver");

        // MacOS
        DownloadTools.downloadDriver(
                "https://chromedriver.storage.googleapis.com/" + VERSION + "/chromedriver_mac64.zip",
                "files/webdriver/macos/64/",
                "chromedriver");
    }
}
