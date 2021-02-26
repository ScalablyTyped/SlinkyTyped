package typingsSlinky.storybookAddonKnobs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends StObject {
  
  var callback: js.UndefOr[js.Function0[_]] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var hideLabel: js.UndefOr[Boolean] = js.native
  
  var label: String = js.native
  
  var name: String = js.native
  
  var used: js.UndefOr[Boolean] = js.native
}
object Callback {
  
  @scala.inline
  def apply(label: String, name: String): Callback = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: () => _): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
