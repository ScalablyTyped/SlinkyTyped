package typingsSlinky.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes unique name and transport information for an advertising app. */
@js.native
trait AllJoynServiceInfo extends StObject {
  
  /** The path to the service object. This path is used to match communications with service objects connected to the session. */
  var objectPath: String = js.native
  
  /** The port used to connect to the session. */
  var sessionPort: Double = js.native
  
  /** The unique bus name associated with the advertising app. */
  var uniqueName: String = js.native
}
object AllJoynServiceInfo {
  
  @scala.inline
  def apply(objectPath: String, sessionPort: Double, uniqueName: String): AllJoynServiceInfo = {
    val __obj = js.Dynamic.literal(objectPath = objectPath.asInstanceOf[js.Any], sessionPort = sessionPort.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynServiceInfo]
  }
  
  @scala.inline
  implicit class AllJoynServiceInfoMutableBuilder[Self <: AllJoynServiceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectPath(value: String): Self = StObject.set(x, "objectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionPort(value: Double): Self = StObject.set(x, "sessionPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
