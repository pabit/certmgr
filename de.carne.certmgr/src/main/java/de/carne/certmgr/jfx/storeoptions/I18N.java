/*
 * Copyright (c) 2014-2016 Holger de Carne and contributors, All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.carne.certmgr.jfx.storeoptions;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Package localization resources.
 */
final class I18N {

	static final String TEXT_NEWTITLE = "storeoptions.newtitle";
	static final String TEXT_OPTIONSTITLE = "storeoptions.optionstitle";

	static final String TEXT_BUTTON_SAVE = "button.save";

	static final String MESSAGE_NOSTORENAME = "storeoptions.nostorename";
	static final String MESSAGE_INVALIDSTORENAME = "storeoptions.invalidstorename";
	static final String MESSAGE_NOSTOREFOLDER = "storeoptions.nostorefolder";
	static final String MESSAGE_INVALIDSTOREFOLDER = "storeoptions.invalidstorefolder";
	static final String MESSAGE_NODEFCRTVALIDTY = "storeoptions.nodefcrtvalidity";
	static final String MESSAGE_NODEFCRLUPDATE = "storeoptions.nodefcrlupdate";
	static final String MESSAGE_NODEFKEYALG = "storeoptions.nodefkeyalg";
	static final String MESSAGE_NODEFKEYSIZE = "storeoptions.nodefkeysize";
	static final String MESSAGE_NODEFSIGALG = "storeoptions.nodefsigalg";

	static final String MESSAGE_CREATESTORE_ERROR = "storeoptions.createstoreerror";
	static final String MESSAGE_WRITESTOREOPTIONS_ERROR = "storeoptions.writestoreoptionserror";

	static ResourceBundle bundle() {
		return ResourceBundle.getBundle(I18N.class.getName());
	}

	static String format(String pattern, Object... arguments) {
		return MessageFormat.format(bundle().getString(pattern), arguments);
	}

}