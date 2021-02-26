package typingsSlinky.winrtUwp.Windows.System.RemoteSystems

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an application on a remote system. */
@js.native
trait RemoteSystemApp extends StObject {
  
  /** The app-specific attributes of this application. */
  var Attributes: IMapView[String, String] = js.native
  
  /** The display-friendly name for this application. This is the name used by the device for Bluetooth identification. If this hasn't been set or the device doesn't support Bluetooth, this field will be empty. */
  var displayName: String = js.native
  
  /** The unique identifier for this application. */
  var id: String = js.native
  
  /** Indicates whether this application is currently available for proximal connection. */
  var isAvailableByProximity: Boolean = js.native
  
  /** Indicates whether this application is currently available for spatial sharing connection. */
  var isAvailableBySpatialProximity: Boolean = js.native
}
object RemoteSystemApp {
  
  @scala.inline
  def apply(
    Attributes: IMapView[String, String],
    displayName: String,
    id: String,
    isAvailableByProximity: Boolean,
    isAvailableBySpatialProximity: Boolean
  ): RemoteSystemApp = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAvailableByProximity = isAvailableByProximity.asInstanceOf[js.Any], isAvailableBySpatialProximity = isAvailableBySpatialProximity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemApp]
  }
  
  @scala.inline
  implicit class RemoteSystemAppMutableBuilder[Self <: RemoteSystemApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: IMapView[String, String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailableByProximity(value: Boolean): Self = StObject.set(x, "isAvailableByProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailableBySpatialProximity(value: Boolean): Self = StObject.set(x, "isAvailableBySpatialProximity", value.asInstanceOf[js.Any])
  }
}
