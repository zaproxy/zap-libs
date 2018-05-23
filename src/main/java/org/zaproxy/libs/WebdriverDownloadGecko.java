/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2017 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.libs;

public class WebdriverDownloadGecko {

    /**
     * The webdriver files are not held in the repo to prevent space problems. Run the program to download the files before
     * building the add-on. It will need to be changed whenever there are new versions.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Geckodriver releases: https://github.com/mozilla/geckodriver/releases
        final String VERSION = "v0.20.1";

        // Windows
        DownloadTools.downloadDriver(
                "https://github.com/mozilla/geckodriver/releases/download/" + VERSION + "/geckodriver-" + VERSION
                        + "-win32.zip",
                "files/webdriver/windows/32/",
                "geckodriver.exe");
        DownloadTools.downloadDriver(
                "https://github.com/mozilla/geckodriver/releases/download/" + VERSION + "/geckodriver-" + VERSION
                        + "-win64.zip",
                "files/webdriver/windows/64/",
                "geckodriver.exe");

        // Linux
        DownloadTools.downloadDriver(
                "https://github.com/mozilla/geckodriver/releases/download/" + VERSION + "/geckodriver-" + VERSION
                        + "-linux32.tar.gz",
                "files/webdriver/linux/32/",
                "geckodriver");
        DownloadTools.downloadDriver(
                "https://github.com/mozilla/geckodriver/releases/download/" + VERSION + "/geckodriver-" + VERSION
                        + "-linux64.tar.gz",
                "files/webdriver/linux/64/",
                "geckodriver");

        // MacOS
        DownloadTools.downloadDriver(
                "https://github.com/mozilla/geckodriver/releases/download/" + VERSION + "/geckodriver-" + VERSION
                        + "-macos.tar.gz",
                "files/webdriver/macos/64/",
                "geckodriver");
    }
}
