package typingsSlinky.winrtUwp.global.Windows.Devices.Geolocation

import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason
import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState
import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates
import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.IGeoshape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A geofence is a virtual area around a geographical point. The geofencing APIs enable applications to provide geographically contextual experiences in a timely manner without the need for the app to be continuously running and consuming device resources. Geofencing enables scenarios like popping up a reminder for a user when they are leaving work or home or displaying coupons when the user gets within range of a store. */
@JSGlobal("Windows.Devices.Geolocation.Geofencing")
@js.native
object Geofencing extends js.Object {
  /** Contains the information to define a geofence, an area of interest, to monitor. */
  @js.native
  class Geofence protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.Geofence {
    /**
      * Initializes a new Geofence object given the id and the shape of the geofence.
      * @param id The Id of the geofence.
      * @param geoshape The area that defines the geofence to monitor.
      */
    def this(id: String, geoshape: IGeoshape) = this()
    /**
      * Initializes a new Geofence object given the id, the shape of the geofence, the states to monitor the geofence for, and the singleUse flag.
      * @param id The Id of the geofence.
      * @param geoshape The area that defines the geofence to monitor.
      * @param monitoredStates The states to monitor the geofence for.
      * @param singleUse True indicates the geofence should be monitored only for one use. False indicates the geofence should be monitored for multiple uses.
      */
    def this(id: String, geoshape: IGeoshape, monitoredStates: MonitoredGeofenceStates, singleUse: Boolean) = this()
    /**
      * Initializes a new Geofence object given the id, the shape of the geofence, the states to monitor the geofence for, the singleUse flag, and the dwellTime for the geofence.
      * @param id The Id of the geofence.
      * @param geoshape The area that defines the geofence to monitor.
      * @param monitoredStates The states to monitor the geofence for.
      * @param singleUse True indicates the geofence should be monitored only for one use. False indicates the geofence should be monitored for multiple uses.
      * @param dwellTime The time that a position has to be in or out of the geofence in order for the notification to be triggered.
      */
    def this(
      id: String,
      geoshape: IGeoshape,
      monitoredStates: MonitoredGeofenceStates,
      singleUse: Boolean,
      dwellTime: Double
    ) = this()
    /**
      * Initializes a new Geofence object given the id, the shape of the geofence, the states to monitor the geofence for, the singleUse flag, the dwellTime for the geofence, the time to start monitoring the geofence, and the duration of the geofence.
      * @param id The Id of the geofence.
      * @param geoshape The area that defines the geofence to monitor.
      * @param monitoredStates The states to monitor the geofence for.
      * @param singleUse True indicates the geofence should be monitored only for one use. False indicates the geofence should be monitored for multiple uses.
      * @param dwellTime The time that a position has to be in or out of the geofence in order for the notification to be triggered.
      * @param startTime The time to start monitoring the geofence.
      * @param duration The duration of time to monitor the geofence for. The duration begins at the startTime.
      */
    def this(
      id: String,
      geoshape: IGeoshape,
      monitoredStates: MonitoredGeofenceStates,
      singleUse: Boolean,
      dwellTime: Double,
      startTime: js.Date,
      duration: Double
    ) = this()
    /** Gets the time window, beginning after the StartTime , during which the Geofence is monitored. */
    /* CompleteClass */
    override var duration: Double = js.native
    /** The minimum time that a position has to be inside or outside of the Geofence in order for the notification to be triggered. */
    /* CompleteClass */
    override var dwellTime: Double = js.native
    /** The shape of the geofence region. */
    /* CompleteClass */
    override var geoshape: IGeoshape = js.native
    /** The id of the Geofence . */
    /* CompleteClass */
    override var id: String = js.native
    /** Indicates the states that the Geofence is being monitored for. */
    /* CompleteClass */
    override var monitoredStates: MonitoredGeofenceStates = js.native
    /** Indicates whether the Geofence should be triggered once or multiple times. */
    /* CompleteClass */
    override var singleUse: Boolean = js.native
    /** The time to start monitoring the Geofence . */
    /* CompleteClass */
    override var startTime: js.Date = js.native
  }
  
  /** Contains the information about the monitored Geofence objects. */
  @js.native
  abstract class GeofenceMonitor ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitor
  
  /** Contains the information about the state changes for a Geofence . */
  @js.native
  abstract class GeofenceStateChangeReport ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceStateChangeReport {
    /** The Geofence object whose state has changed. */
    /* CompleteClass */
    override var geofence: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.Geofence = js.native
    /** The position of the Geofence object whose state has changed. */
    /* CompleteClass */
    override var geoposition: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geoposition = js.native
    /** The new state of the Geofence object whose state has changed. */
    /* CompleteClass */
    override var newState: GeofenceState = js.native
    /** Indicates the reason a Geofence was removed. */
    /* CompleteClass */
    override var removalReason: GeofenceRemovalReason = js.native
  }
  
  /* static members */
  @js.native
  object GeofenceMonitor extends js.Object {
    /** Gets the GeofenceMonitor object which contains all of an app's Geofence information. */
    var current: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitor = js.native
  }
  
  /** Indicates the current state of a GeofenceMonitor . */
  @js.native
  object GeofenceMonitorStatus extends js.Object {
    /* 3 */ val disabled: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.disabled with Double = js.native
    /* 1 */ val initializing: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.initializing with Double = js.native
    /* 2 */ val noData: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.noData with Double = js.native
    /* 5 */ val notAvailable: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.notAvailable with Double = js.native
    /* 4 */ val notInitialized: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.notInitialized with Double = js.native
    /* 0 */ val ready: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.ready with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus with Double
      ] = js.native
  }
  
  /** Indicates the reason a Geofence was removed. */
  @js.native
  object GeofenceRemovalReason extends js.Object {
    /* 1 */ val expired: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason.expired with Double = js.native
    /* 0 */ val used: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason.used with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason with Double
      ] = js.native
  }
  
  /** Indicates the current state of a Geofence . */
  @js.native
  object GeofenceState extends js.Object {
    /* 1 */ val entered: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.entered with Double = js.native
    /* 2 */ val exited: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.exited with Double = js.native
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.none with Double = js.native
    /* 3 */ val removed: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.removed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState with Double
      ] = js.native
  }
  
  /** Indicates the state or states of the Geofences that are currently being monitored by the system. */
  @js.native
  object MonitoredGeofenceStates extends js.Object {
    /* 1 */ val entered: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.entered with Double = js.native
    /* 2 */ val exited: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.exited with Double = js.native
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.none with Double = js.native
    /* 3 */ val removed: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.removed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates with Double
      ] = js.native
  }
  
}

