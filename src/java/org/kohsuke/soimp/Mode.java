package org.kohsuke.soimp;

/**
 * @author Kohsuke Kawaguchi
 */
enum Mode {
    NEW, DELETED, UPDATED;

    static Mode parse(char ch) {
        switch(ch) {
        case 'M':
            return UPDATED;
        case '!':
            return DELETED;
        case '?':
            return NEW;
        }
        return null;
    }
}
