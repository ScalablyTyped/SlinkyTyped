package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastResultDetails extends StObject {
  
  var dateCompleted: js.Date = js.native
  
  var duration: Double = js.native
  
  var runBy: IdentityRef = js.native
}
object LastResultDetails {
  
  @scala.inline
  def apply(dateCompleted: js.Date, duration: Double, runBy: IdentityRef): LastResultDetails = {
    val __obj = js.Dynamic.literal(dateCompleted = dateCompleted.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastResultDetails]
  }
  
  @scala.inline
  implicit class LastResultDetailsMutableBuilder[Self <: LastResultDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateCompleted(value: js.Date): Self = StObject.set(x, "dateCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunBy(value: IdentityRef): Self = StObject.set(x, "runBy", value.asInstanceOf[js.Any])
  }
}
