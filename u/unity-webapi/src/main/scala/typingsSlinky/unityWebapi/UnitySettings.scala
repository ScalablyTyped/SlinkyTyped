package typingsSlinky.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitySettings extends StObject {
  
  var iconUrl: String = js.native
  
  var name: String = js.native
  
  var onInit: js.Function = js.native
}
object UnitySettings {
  
  @scala.inline
  def apply(iconUrl: String, name: String, onInit: js.Function): UnitySettings = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onInit = onInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitySettings]
  }
  
  @scala.inline
  implicit class UnitySettingsMutableBuilder[Self <: UnitySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInit(value: js.Function): Self = StObject.set(x, "onInit", value.asInstanceOf[js.Any])
  }
}
