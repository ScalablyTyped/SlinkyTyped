package typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing

import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geoposition
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.geofencestatechanged
import typingsSlinky.winrtUwp.winrtUwpStrings.statuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about the monitored Geofence objects. */
@js.native
trait GeofenceMonitor extends js.Object {
  /** Returns a vector of the app's Geofence objects currently registered with the system wide GeofenceMonitor . */
  var geofences: IVector[Geofence] = js.native
  /** Last reading of the device's location. */
  var lastKnownGeoposition: Geoposition = js.native
  /** Raised when the state of one or more Geofence objects in the Geofences collection of the GeofenceMonitor has changed */
  @JSName("ongeofencestatechanged")
  var ongeofencestatechanged_Original: TypedEventHandler[GeofenceMonitor, _] = js.native
  /** Raised when the status of the GeofenceMonitor has changed. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: TypedEventHandler[GeofenceMonitor, _] = js.native
  /** Indicates the current state of the GeofenceMonitor . */
  var status: GeofenceMonitorStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_geofencestatechanged(`type`: geofencestatechanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
  /** Raised when the state of one or more Geofence objects in the Geofences collection of the GeofenceMonitor has changed */
  def ongeofencestatechanged(ev: js.Any with WinRTEvent[GeofenceMonitor]): Unit = js.native
  /** Raised when the status of the GeofenceMonitor has changed. */
  def onstatuschanged(ev: js.Any with WinRTEvent[GeofenceMonitor]): Unit = js.native
  /**
    * Gets a collection of status changes to the Geofence objects in the Geofences collection of the GeofenceMonitor .
    * @return collection of status changes to the GeofenceMonitor .
    */
  def readReports(): IVectorView[GeofenceStateChangeReport] = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_geofencestatechanged(`type`: geofencestatechanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
}

