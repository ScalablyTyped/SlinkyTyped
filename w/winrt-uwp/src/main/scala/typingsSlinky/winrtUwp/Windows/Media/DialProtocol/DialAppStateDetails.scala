package typingsSlinky.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the state of the DIAL app. */
@js.native
trait DialAppStateDetails extends StObject {
  
  /** Gets the entire XML response that is provided by the app when state of the app was requested. */
  var fullXml: String = js.native
  
  /** Gets the state of the application at the time the GetAppStateAsync was completed. */
  var state: DialAppState = js.native
}
object DialAppStateDetails {
  
  @scala.inline
  def apply(fullXml: String, state: DialAppState): DialAppStateDetails = {
    val __obj = js.Dynamic.literal(fullXml = fullXml.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialAppStateDetails]
  }
  
  @scala.inline
  implicit class DialAppStateDetailsMutableBuilder[Self <: DialAppStateDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullXml(value: String): Self = StObject.set(x, "fullXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: DialAppState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
