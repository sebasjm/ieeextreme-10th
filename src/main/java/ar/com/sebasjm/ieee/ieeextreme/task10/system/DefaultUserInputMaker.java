/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.system;

import ar.com.sebasjm.ieee.ieeextreme.task10.app.makers.UserInputMaker;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.UserInput;
import ar.com.sebasjm.rigel.core.Alias;
import ar.com.sebasjm.rigel.core.Component;
import ar.com.sebasjm.rigel.core.metadata.Interfaces;
import ar.com.sebasjm.rigel.core.metadata.Name;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 *
 * @author sebasjm at computer dot org
 */
@Name(DefaultUserInputMaker.class)
@Interfaces({
    @Name(UserInputMaker.class)
})
public class DefaultUserInputMaker {

    public DefaultUserInputMaker() {
        
    }

    public UserInput create(String value, Alias... alias) {
        return new UserInputLinkString(value);
    }

    public static class UserInputLinkString implements UserInput {

        private String delegate;

        public UserInputLinkString(String delegate) {
            this.delegate = delegate;
        }

        public String trim() {
            return delegate.trim();
        }

        public String toUpperCase() {
            return delegate.toUpperCase();
        }

        public String toUpperCase(Locale locale) {
            return delegate.toUpperCase(locale);
        }

        public String toString() {
            return delegate.toString();
        }

        public String toLowerCase() {
            return delegate.toLowerCase();
        }

        public String toLowerCase(Locale locale) {
            return delegate.toLowerCase(locale);
        }

        public char[] toCharArray() {
            return delegate.toCharArray();
        }

        public String substring(int beginIndex, int endIndex) {
            return delegate.substring(beginIndex, endIndex);
        }

        public String substring(int beginIndex) {
            return delegate.substring(beginIndex);
        }

        public CharSequence subSequence(int beginIndex, int endIndex) {
            return delegate.subSequence(beginIndex, endIndex);
        }

        public boolean startsWith(String prefix) {
            return delegate.startsWith(prefix);
        }

        public boolean startsWith(String prefix, int toffset) {
            return delegate.startsWith(prefix, toffset);
        }

        public String[] split(String regex) {
            return delegate.split(regex);
        }

        public String[] split(String regex, int limit) {
            return delegate.split(regex, limit);
        }

        public String replaceFirst(String regex, String replacement) {
            return delegate.replaceFirst(regex, replacement);
        }

        public String replaceAll(String regex, String replacement) {
            return delegate.replaceAll(regex, replacement);
        }

        public String replace(CharSequence target, CharSequence replacement) {
            return delegate.replace(target, replacement);
        }

        public String replace(char oldChar, char newChar) {
            return delegate.replace(oldChar, newChar);
        }

        public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
            return delegate.regionMatches(ignoreCase, toffset, other, ooffset, len);
        }

        public boolean regionMatches(int toffset, String other, int ooffset, int len) {
            return delegate.regionMatches(toffset, other, ooffset, len);
        }

        public int offsetByCodePoints(int index, int codePointOffset) {
            return delegate.offsetByCodePoints(index, codePointOffset);
        }

        public boolean matches(String regex) {
            return delegate.matches(regex);
        }

        public int length() {
            return delegate.length();
        }

        public int lastIndexOf(String str, int fromIndex) {
            return delegate.lastIndexOf(str, fromIndex);
        }

        public int lastIndexOf(String str) {
            return delegate.lastIndexOf(str);
        }

        public int lastIndexOf(int ch, int fromIndex) {
            return delegate.lastIndexOf(ch, fromIndex);
        }

        public int lastIndexOf(int ch) {
            return delegate.lastIndexOf(ch);
        }

        public String intern() {
            return delegate.intern();
        }

        public int indexOf(String str, int fromIndex) {
            return delegate.indexOf(str, fromIndex);
        }

        public int indexOf(String str) {
            return delegate.indexOf(str);
        }

        public int indexOf(int ch, int fromIndex) {
            return delegate.indexOf(ch, fromIndex);
        }

        public int indexOf(int ch) {
            return delegate.indexOf(ch);
        }

        public int hashCode() {
            return delegate.hashCode();
        }

        public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
            delegate.getChars(srcBegin, srcEnd, dst, dstBegin);
        }

        public byte[] getBytes() {
            return delegate.getBytes();
        }

        public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
            return delegate.getBytes(charsetName);
        }

        public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
            delegate.getBytes(srcBegin, srcEnd, dst, dstBegin);
        }

        public boolean equalsIgnoreCase(String anotherString) {
            return delegate.equalsIgnoreCase(anotherString);
        }

        public boolean equals(Object anObject) {
            return delegate.equals(anObject);
        }

        public boolean endsWith(String suffix) {
            return delegate.endsWith(suffix);
        }

        public boolean contentEquals(CharSequence cs) {
            return delegate.contentEquals(cs);
        }

        public boolean contentEquals(StringBuffer sb) {
            return delegate.contentEquals(sb);
        }

        public boolean contains(CharSequence s) {
            return delegate.contains(s);
        }

        public String concat(String str) {
            return delegate.concat(str);
        }

        public int compareToIgnoreCase(String str) {
            return delegate.compareToIgnoreCase(str);
        }

        public int compareTo(String anotherString) {
            return delegate.compareTo(anotherString);
        }

        public int codePointCount(int beginIndex, int endIndex) {
            return delegate.codePointCount(beginIndex, endIndex);
        }

        public int codePointBefore(int index) {
            return delegate.codePointBefore(index);
        }

        public int codePointAt(int index) {
            return delegate.codePointAt(index);
        }

        public char charAt(int index) {
            return delegate.charAt(index);
        }

        public Component getValue(Alias... alias) {
            return this;
        }

    }

}
