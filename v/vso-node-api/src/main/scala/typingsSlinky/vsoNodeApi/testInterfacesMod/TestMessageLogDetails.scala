package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestMessageLogDetails extends js.Object {
  
  /**
    * Date when the resource is created
    */
  var dateCreated: js.Date = js.native
  
  /**
    * Id of the resource
    */
  var entryId: Double = js.native
  
  /**
    * Message of the resource
    */
  var message: String = js.native
}
object TestMessageLogDetails {
  
  @scala.inline
  def apply(dateCreated: js.Date, entryId: Double, message: String): TestMessageLogDetails = {
    val __obj = js.Dynamic.literal(dateCreated = dateCreated.asInstanceOf[js.Any], entryId = entryId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMessageLogDetails]
  }
  
  @scala.inline
  implicit class TestMessageLogDetailsOps[Self <: TestMessageLogDetails] (val x: Self) extends AnyVal {
    
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
    def setDateCreated(value: js.Date): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryId(value: Double): Self = this.set("entryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
