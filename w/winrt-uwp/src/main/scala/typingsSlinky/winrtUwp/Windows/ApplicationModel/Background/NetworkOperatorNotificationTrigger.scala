package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile network operator notification trigger. */
@js.native
trait NetworkOperatorNotificationTrigger extends StObject {
  
  /** Gets the account identifier for the mobile network operator notification trigger. */
  var networkAccountId: String = js.native
}
object NetworkOperatorNotificationTrigger {
  
  @scala.inline
  def apply(networkAccountId: String): NetworkOperatorNotificationTrigger = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorNotificationTrigger]
  }
  
  @scala.inline
  implicit class NetworkOperatorNotificationTriggerMutableBuilder[Self <: NetworkOperatorNotificationTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
  }
}
