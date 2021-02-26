package typingsSlinky.storybookUi.anon

import typingsSlinky.storybookUi.shortcutsMod.ValidationStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Valid extends StObject {
  
  var valid: ValidationStates = js.native
}
object Valid {
  
  @scala.inline
  def apply(valid: ValidationStates): Valid = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Valid]
  }
  
  @scala.inline
  implicit class ValidMutableBuilder[Self <: Valid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValid(value: ValidationStates): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
