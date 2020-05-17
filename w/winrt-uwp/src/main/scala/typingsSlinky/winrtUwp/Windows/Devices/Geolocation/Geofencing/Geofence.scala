package typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geofencing

import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.IGeoshape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information to define a geofence, an area of interest, to monitor. */
@js.native
trait Geofence extends js.Object {
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
  implicit class GeofenceOps[Self <: Geofence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwellTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwellTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeoshape(value: IGeoshape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoshape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoredStates(value: MonitoredGeofenceStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleUse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

