package typingsSlinky.smartFoxServer.SFS2X.Requests.MMO

import typingsSlinky.smartFoxServer.SFS2X.Entities.Data.Vec3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MMORoomSettings extends js.Object {
  /** @type {Entities.Data.Vec3D} Defines the Area of Interest (AoI) for the MMORoom. */
  var defaultAOI: Vec3D = js.native
  /** @type {MapLimits} Defines the limits of the virtual environment represented by the MMORoom. */
  var mapLimits: MapLimits = js.native
  /** @type {number} Configures the speed at which the SFSEvent.PROXIMITY_LIST_UPDATE event is sent by the server. */
  var proximityListUpdateMillis: Double = js.native
  /** @type {boolean} Sets if the users entry points in the current user's Area of Interest should be transmitted in the SFSEvent.PROXIMITY_LIST_UPDATE event. */
  var sendAOIEntryPoint: Boolean = js.native
  /** @type {number} Defines the time limit before a user without a physical position set inside the MMORoom is kicked from the Room. */
  var userMaxLimboSeconds: Double = js.native
}

object MMORoomSettings {
  @scala.inline
  def apply(
    defaultAOI: Vec3D,
    mapLimits: MapLimits,
    proximityListUpdateMillis: Double,
    sendAOIEntryPoint: Boolean,
    userMaxLimboSeconds: Double
  ): MMORoomSettings = {
    val __obj = js.Dynamic.literal(defaultAOI = defaultAOI.asInstanceOf[js.Any], mapLimits = mapLimits.asInstanceOf[js.Any], proximityListUpdateMillis = proximityListUpdateMillis.asInstanceOf[js.Any], sendAOIEntryPoint = sendAOIEntryPoint.asInstanceOf[js.Any], userMaxLimboSeconds = userMaxLimboSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MMORoomSettings]
  }
  @scala.inline
  implicit class MMORoomSettingsOps[Self <: MMORoomSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultAOI(value: Vec3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAOI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapLimits(value: MapLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProximityListUpdateMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximityListUpdateMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendAOIEntryPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAOIEntryPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserMaxLimboSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMaxLimboSeconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

