/*******************************************************************************
 * Copyright 2017 Ahmad Abolhadid
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
 ******************************************************************************/
package components;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Activity implements IComponent,IActivityService{

	String name, exp, permission;
	boolean isExported;
	List<Intent> intents;

	public String getName() {
		return name;
	}
	@XmlAttribute(name="name",namespace="http://schemas.android.com/apk/res/android")
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlAttribute(name="exported",namespace="http://schemas.android.com/apk/res/android")
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getExp() {
		return exp;
	}
	
	public boolean isExported() {
		return isExported;
	}

	public void setExported(boolean exported) {
		this.isExported = exported;
	}
	public List<Intent> getIntent() {
		return intents;
	}
	@XmlElement(name="intent-filter")
	public void setIntent(List<Intent> intents) {
		this.intents = intents;
	}
	public String getPermission() {
		return permission;
	}
	@XmlElement(name="permission")
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	
}
