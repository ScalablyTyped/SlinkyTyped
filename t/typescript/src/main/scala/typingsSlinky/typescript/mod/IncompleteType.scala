package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncompleteType extends FlowType {
  
  var flags: TypeFlags = js.native
  
  var `type`: Type = js.native
}
object IncompleteType {
  
  @scala.inline
  def apply(flags: TypeFlags, `type`: Type): IncompleteType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompleteType]
  }
  
  @scala.inline
  implicit class IncompleteTypeMutableBuilder[Self <: IncompleteType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
