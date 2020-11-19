package typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MonitoredGeofenceStates extends js.Object
/** Indicates the state or states of the Geofences that are currently being monitored by the system. */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates")
@js.native
object MonitoredGeofenceStates extends js.Object {
  
  /** The device has entered a geofence area. */
  @js.native
  sealed trait entered extends MonitoredGeofenceStates
  
  /** The device has left a geofence area. */
  @js.native
  sealed trait exited extends MonitoredGeofenceStates
  
  /** No flag is set. */
  @js.native
  sealed trait none extends MonitoredGeofenceStates
  
  /** The geofence has been removed. */
  @js.native
  sealed trait removed extends MonitoredGeofenceStates
}
