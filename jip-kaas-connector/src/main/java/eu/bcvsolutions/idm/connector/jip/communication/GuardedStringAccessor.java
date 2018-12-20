/**
 * CzechIdM
 * Copyright (C) 2014 BCV solutions s.r.o., Czech Republic
 *
 * This software is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License 2.1 as published by the Free Software Foundation;
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 *
 * You can contact us on website http://www.bcvsolutions.eu.
 */

package eu.bcvsolutions.idm.connector.jip.communication;

import java.util.Arrays;

import org.identityconnectors.common.security.GuardedString;

/**
 * Třída sloužící k získání hesla z objektu třídy GuardedString.
 *
 * @author Jaromír Mlejnek
 */
public class GuardedStringAccessor implements GuardedString.Accessor {

    private char[] array;

    /**
     * Metoda uloži heslo z objektu třídy GuardedString do pole typu char.
     */
    public void access(char[] clearChars) {
        array = new char [clearChars.length];
        System.arraycopy(clearChars, 0, array, 0, clearChars.length);
    }

    /**
     * Metoda navracející heslo v poli typu char.
     *
     * @return Pole typu char, ve kterém je uloženo heslo.
     */
    public char[] getArray() {
        return array;
    }

    /**
     * Metoda vyčistí pole, ve kterém je heslo.
     */
    public void clearArray() {
        Arrays.fill(array, 0, array.length, ' ');
    }

}
