package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSAssertion extends js.Object {
  
  val id: java.lang.String = js.native
  
  val `type`: MSCredentialType = js.native
}
object MSAssertion {
  
  @scala.inline
  def apply(id: java.lang.String, `type`: MSCredentialType): MSAssertion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSAssertion]
  }
  
  @scala.inline
  implicit class MSAssertionOps[Self <: MSAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MSCredentialType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
