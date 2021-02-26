package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.NaN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueDescriptionNaN
  extends AbstractValueDescription
     with ValueDescription {
  
  @JSName("type")
  var type_ValueDescriptionNaN: NaN = js.native
}
object ValueDescriptionNaN {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: NaN
  ): ValueDescriptionNaN = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionNaN]
  }
  
  @scala.inline
  implicit class ValueDescriptionNaNMutableBuilder[Self <: ValueDescriptionNaN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NaN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
