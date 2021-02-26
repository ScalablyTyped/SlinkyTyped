package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestMessageLogDetails extends StObject {
  
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
  implicit class TestMessageLogDetailsMutableBuilder[Self <: TestMessageLogDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryId(value: Double): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
