package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Booleans.`false`
import typingsSlinky.webidl2.webidl2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.SingleTypeDescription
  - typingsSlinky.webidl2.mod.UnionTypeDescription
*/
trait IDLTypeDescription extends js.Object
object IDLTypeDescription {
  
  @scala.inline
  def SingleTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: String,
    nullable: Boolean,
    sequence: Boolean,
    union: `false`
  ): IDLTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLTypeDescription]
  }
  
  @scala.inline
  def UnionTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    sequence: Boolean,
    union: `true`
  ): IDLTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLTypeDescription]
  }
}
