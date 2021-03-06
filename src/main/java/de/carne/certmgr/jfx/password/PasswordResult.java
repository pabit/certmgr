/*
 * Copyright (c) 2015-2018 Holger de Carne and contributors, All Rights Reserved.
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
package de.carne.certmgr.jfx.password;

import de.carne.boot.check.Nullable;
import javafx.scene.control.ButtonType;

final class PasswordResult {

	public static final PasswordResult CANCEL = new PasswordResult(ButtonType.CANCEL, null, false);

	private final ButtonType dialogResult;

	@Nullable
	private final char[] password;

	private final boolean rememberPassword;

	PasswordResult(ButtonType dialogResult, @Nullable char[] password, boolean rememberPassword) {
		this.dialogResult = dialogResult;
		this.password = password;
		this.rememberPassword = rememberPassword;
	}

	public ButtonType dialogResult() {
		return this.dialogResult;
	}

	@Nullable
	public char[] password() {
		return this.password;
	}

	public boolean rememberPassword() {
		return this.rememberPassword;
	}

}
