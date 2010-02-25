/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.util.arbol;

import ar.com.sebasjm.rigel.core.Component;
import java.util.Locale;

/**
 *
 * @author sebasjm at computer dot org
 */
public interface StringInterface extends Component {

    public String trim();
    public String toUpperCase();
    public String toUpperCase(Locale locale);
    public String toLowerCase();
    public String toLowerCase(Locale locale);
    public char[] toCharArray();
    public String substring(int beginIndex, int endIndex);
    public String substring(int beginIndex);
    public CharSequence subSequence(int beginIndex, int endIndex);
    public boolean startsWith(String prefix);
    public boolean startsWith(String prefix, int toffset);
    public String[] split(String regex);
    public String[] split(String regex, int limit);
    public String replaceFirst(String regex, String replacement);
    public String replaceAll(String regex, String replacement);
    public String replace(CharSequence target, CharSequence replacement);
    public String replace(char oldChar, char newChar);
    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len);
    public boolean regionMatches(int toffset, String other, int ooffset, int len);
    public int offsetByCodePoints(int index, int codePointOffset);
    public boolean matches(String regex);
    public int length();
    public int lastIndexOf(String str, int fromIndex);
    public int lastIndexOf(String str);
    public int lastIndexOf(int ch, int fromIndex);
    public int lastIndexOf(int ch);
    public String intern();
    public int indexOf(String str, int fromIndex);
    public int indexOf(String str);
    public int indexOf(int ch, int fromIndex);
    public int indexOf(int ch);
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin);
    public byte[] getBytes();
//    public byte[] getBytes(String charsetName);
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin);
    public boolean equalsIgnoreCase(String anotherString);
    public boolean endsWith(String suffix);
    public boolean contentEquals(CharSequence cs);
    public boolean contentEquals(StringBuffer sb);
    public boolean contains(CharSequence s);
    public String concat(String str);
    public int compareToIgnoreCase(String str);
    public int compareTo(String anotherString);
    public int codePointCount(int beginIndex, int endIndex);
    public int codePointBefore(int index);
    public int codePointAt(int index);
    public char charAt(int index);
}
