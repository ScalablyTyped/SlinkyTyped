package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueDescriptionSequence extends ValueDescription {
  
  var `type`: sequence = js.native
  
  var value: js.Array[js.Any] = js.native
}
object ValueDescriptionSequence {
  
  @scala.inline
  def apply(`type`: sequence, value: js.Array[js.Any]): ValueDescriptionSequence = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionSequence]
  }
  
  @scala.inline
  implicit class ValueDescriptionSequenceOps[Self <: ValueDescriptionSequence] (val x: Self) extends AnyVal {
    
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
    def setType(value: sequence): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[js.Any]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
