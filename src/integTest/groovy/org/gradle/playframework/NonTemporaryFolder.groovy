package org.gradle.playframework

import org.junit.rules.TemporaryFolder

class NonTemporaryFolder extends TemporaryFolder
{
    @Override
    protected void after() {
        System.out.println("NonTemporaryFolder.after(): delete overriden");
    }
}
