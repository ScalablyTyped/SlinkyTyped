package typingsSlinky.uiGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectOption extends StObject {
  
  var label: String = js.native
  
  var value: Double | String = js.native
}
object ISelectOption {
  
  @scala.inline
  def apply(label: String, value: Double | String): ISelectOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectOption]
  }
  
  @scala.inline
  implicit class ISelectOptionMutableBuilder[Self <: ISelectOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
