package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.geofencestatechanged
import typingsSlinky.winrtUwp.winrtUwpStrings.statuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A geofence is a virtual area around a geographical point. The geofencing APIs enable applications to provide geographically contextual experiences in a timely manner without the need for the app to be continuously running and consuming device resources. Geofencing enables scenarios like popping up a reminder for a user when they are leaving work or home or displaying coupons when the user gets within range of a store. */
object Geofencing {
  
  @js.native
  sealed trait GeofenceMonitorStatus extends StObject
  /** Indicates the current state of a GeofenceMonitor . */
  @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus")
  @js.native
  object GeofenceMonitorStatus extends StObject {
    
    /** Access to location is denied. */
    @js.native
    sealed trait disabled extends GeofenceMonitorStatus
    
    /** The monitor is in the process of initializing. */
    @js.native
    sealed trait initializing extends GeofenceMonitorStatus
    
    /** There is no data on the status of the monitor. */
    @js.native
    sealed trait noData extends GeofenceMonitorStatus
    
    /** The geofence monitor is not available. */
    @js.native
    sealed trait notAvailable extends GeofenceMonitorStatus
    
    /** The geofence monitor has not been initialized. */
    @js.native
    sealed trait notInitialized extends GeofenceMonitorStatus
    
    /** The monitor is ready and active. */
    @js.native
    sealed trait ready extends GeofenceMonitorStatus
  }
  
  @js.native
  sealed trait GeofenceRemovalReason extends StObject
  /** Indicates the reason a Geofence was removed. */
  @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason")
  @js.native
  object GeofenceRemovalReason extends StObject {
    
    /** The duration of the geofence has expired. */
    @js.native
    sealed trait expired extends GeofenceRemovalReason
    
    /** The geofence event was triggered and the geofence was used. */
    @js.native
    sealed trait used extends GeofenceRemovalReason
  }
  
  @js.native
  sealed trait GeofenceState extends StObject
  /** Indicates the current state of a Geofence . */
  @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceState")
  @js.native
  object GeofenceState extends StObject {
    
    /** The device has entered the geofence area. */
    @js.native
    sealed trait entered extends GeofenceState
    
    /** The device has left the geofence area. */
    @js.native
    sealed trait exited extends GeofenceState
    
    /** No flag is set. */
    @js.native
    sealed trait none extends GeofenceState
    
    /** The geofence was removed. */
    @js.native
    sealed trait removed extends GeofenceState
  }
  
  @js.native
  sealed trait MonitoredGeofenceStates extends StObject
  /** Indicates the state or states of the Geofences that are currently being monitored by the system. */
  @JSGlobal("Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates")
  @js.native
  object MonitoredGeofenceStates extends StObject {
    
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
  
  /** Contains the information to define a geofence, an area of interest, to monitor. */
  @js.native
  trait Geofence extends StObject {
    
    /** Gets the time window, beginning after the StartTime , during which the Geofence is monitored. */
    var duration: Double = js.native
    
    /** The minimum time that a position has to be inside or outside of the Geofence in order for the notification to be triggered. */
    var dwellTime: Double = js.native
    
    /** The shape of the geofence region. */
    var geoshape: IGeoshape = js.native
    
    /** The id of the Geofence . */
    var id: String = js.native
    
    /** Indicates the states that the Geofence is being monitored for. */
    var monitoredStates: MonitoredGeofenceStates = js.native
    
    /** Indicates whether the Geofence should be triggered once or multiple times. */
    var singleUse: Boolean = js.native
    
    /** The time to start monitoring the Geofence . */
    var startTime: js.Date = js.native
  }
  object Geofence {
    
    @scala.inline
    def apply(
      duration: Double,
      dwellTime: Double,
      geoshape: IGeoshape,
      id: String,
      monitoredStates: MonitoredGeofenceStates,
      singleUse: Boolean,
      startTime: js.Date
    ): Geofence = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], dwellTime = dwellTime.asInstanceOf[js.Any], geoshape = geoshape.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], monitoredStates = monitoredStates.asInstanceOf[js.Any], singleUse = singleUse.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geofence]
    }
    
    @scala.inline
    implicit class GeofenceMutableBuilder[Self <: Geofence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDwellTime(value: Double): Self = StObject.set(x, "dwellTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoshape(value: IGeoshape): Self = StObject.set(x, "geoshape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoredStates(value: MonitoredGeofenceStates): Self = StObject.set(x, "monitoredStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleUse(value: Boolean): Self = StObject.set(x, "singleUse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  /** Contains the information about the monitored Geofence objects. */
  @js.native
  trait GeofenceMonitor extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_geofencestatechanged(`type`: geofencestatechanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
    
    /** Returns a vector of the app's Geofence objects currently registered with the system wide GeofenceMonitor . */
    var geofences: IVector[Geofence] = js.native
    
    /** Last reading of the device's location. */
    var lastKnownGeoposition: Geoposition = js.native
    
    /** Raised when the state of one or more Geofence objects in the Geofences collection of the GeofenceMonitor has changed */
    def ongeofencestatechanged(ev: js.Any with WinRTEvent[GeofenceMonitor]): Unit = js.native
    /** Raised when the state of one or more Geofence objects in the Geofences collection of the GeofenceMonitor has changed */
    @JSName("ongeofencestatechanged")
    var ongeofencestatechanged_Original: TypedEventHandler[GeofenceMonitor, _] = js.native
    
    /** Raised when the status of the GeofenceMonitor has changed. */
    def onstatuschanged(ev: js.Any with WinRTEvent[GeofenceMonitor]): Unit = js.native
    /** Raised when the status of the GeofenceMonitor has changed. */
    @JSName("onstatuschanged")
    var onstatuschanged_Original: TypedEventHandler[GeofenceMonitor, _] = js.native
    
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
    
    /** Indicates the current state of the GeofenceMonitor . */
    var status: GeofenceMonitorStatus = js.native
  }
  
  /** Contains the information about the state changes for a Geofence . */
  @js.native
  trait GeofenceStateChangeReport extends StObject {
    
    /** The Geofence object whose state has changed. */
    var geofence: Geofence = js.native
    
    /** The position of the Geofence object whose state has changed. */
    var geoposition: Geoposition = js.native
    
    /** The new state of the Geofence object whose state has changed. */
    var newState: GeofenceState = js.native
    
    /** Indicates the reason a Geofence was removed. */
    var removalReason: GeofenceRemovalReason = js.native
  }
  object GeofenceStateChangeReport {
    
    @scala.inline
    def apply(
      geofence: Geofence,
      geoposition: Geoposition,
      newState: GeofenceState,
      removalReason: GeofenceRemovalReason
    ): GeofenceStateChangeReport = {
      val __obj = js.Dynamic.literal(geofence = geofence.asInstanceOf[js.Any], geoposition = geoposition.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], removalReason = removalReason.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeofenceStateChangeReport]
    }
    
    @scala.inline
    implicit class GeofenceStateChangeReportMutableBuilder[Self <: GeofenceStateChangeReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeofence(value: Geofence): Self = StObject.set(x, "geofence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoposition(value: Geoposition): Self = StObject.set(x, "geoposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewState(value: GeofenceState): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovalReason(value: GeofenceRemovalReason): Self = StObject.set(x, "removalReason", value.asInstanceOf[js.Any])
    }
  }
}
