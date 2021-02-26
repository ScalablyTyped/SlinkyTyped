package typingsSlinky.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Totalacceptedrecipients extends StObject {
  
  var id: String = js.native
  
  var total_accepted_recipients: Double = js.native
  
  var total_rejected_recipients: Double = js.native
}
object Totalacceptedrecipients {
  
  @scala.inline
  def apply(id: String, total_accepted_recipients: Double, total_rejected_recipients: Double): Totalacceptedrecipients = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any], total_rejected_recipients = total_rejected_recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[Totalacceptedrecipients]
  }
  
  @scala.inline
  implicit class TotalacceptedrecipientsMutableBuilder[Self <: Totalacceptedrecipients] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_accepted_recipients(value: Double): Self = StObject.set(x, "total_accepted_recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_rejected_recipients(value: Double): Self = StObject.set(x, "total_rejected_recipients", value.asInstanceOf[js.Any])
  }
}
