/*
 * DocDoku, Professional Open Source
 * Copyright 2006 - 2013 DocDoku SARL
 *
 * This file is part of DocDokuPLM.
 *
 * DocDokuPLM is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DocDokuPLM is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with DocDokuPLM.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.docdoku.server.visualizers;

@ScormVisualizer
public class ScormVisualizerImpl implements DocumentVisualizer {

    @Override
    public String visualize(String fileName) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean canVisualize(String fileName) {
        /*if (FileIO.isArchiveFile(fileName)) {
            File file = new File(fileName.replace("/files",mBaseDir.getAbsolutePath()));
            String fileWoExt = FileIO.getFileNameWithoutExtension(file);
            File archive = new File(file.getAbsolutePath().replace(file.getName(),"scorm/" + fileWoExt));
            if (archive.exists() && archive.isDirectory()) {
                File[] children = archive.listFiles();
                for (int i = 0; i < children.length; i++) {
                    if (children[i].getName().equals("imsmanifest.xml")) {
                        return true;
                    }
                }
            }
        }*/
        return false;
    }
}
