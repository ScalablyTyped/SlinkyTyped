package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueDescriptionDictionary
  extends AbstractValueDescription
     with ValueDescription {
  
  @JSName("type")
  var type_ValueDescriptionDictionary: dictionary = js.native
}
object ValueDescriptionDictionary {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: dictionary
  ): ValueDescriptionDictionary = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionDictionary]
  }
  
  @scala.inline
  implicit class ValueDescriptionDictionaryOps[Self <: ValueDescriptionDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: dictionary): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
