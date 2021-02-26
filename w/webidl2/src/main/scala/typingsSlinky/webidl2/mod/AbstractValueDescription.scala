package typingsSlinky.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractValueDescription extends AbstractBase {
  
  @JSName("parent")
  var parent_AbstractValueDescription: Argument | ConstantMemberType | FieldType = js.native
}
object AbstractValueDescription {
  
  @scala.inline
  def apply(extAttrs: js.Array[ExtendedAttribute], parent: Argument | ConstantMemberType | FieldType): AbstractValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractValueDescription]
  }
  
  @scala.inline
  implicit class AbstractValueDescriptionMutableBuilder[Self <: AbstractValueDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: Argument | ConstantMemberType | FieldType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
