package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Section extends js.Object {
  
  var key: String = js.native
  
  var value: String = js.native
}
object Section {
  
  @scala.inline
  def apply(key: String, value: String): Section = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit class SectionOps[Self <: Section] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
