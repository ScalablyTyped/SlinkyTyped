package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.ActionTypes.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeUpdate extends StObject {
  
  var `type`: Update = js.native
}
object TypeUpdate {
  
  @scala.inline
  def apply(`type`: Update): TypeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeUpdate]
  }
  
  @scala.inline
  implicit class TypeUpdateMutableBuilder[Self <: TypeUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
