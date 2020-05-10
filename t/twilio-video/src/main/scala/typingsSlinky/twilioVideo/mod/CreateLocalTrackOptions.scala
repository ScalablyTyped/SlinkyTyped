package typingsSlinky.twilioVideo.mod

import typingsSlinky.std.MediaTrackConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalTrackOptions extends MediaTrackConstraints {
  // In API reference logLevel is not optional, but in the Twilio examples it is
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.native
  var name: js.UndefOr[String] = js.native
  var workaroundWebKitBug180748: js.UndefOr[Boolean] = js.native
}

object CreateLocalTrackOptions {
  @scala.inline
  def apply(): CreateLocalTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalTrackOptions]
  }
  @scala.inline
  implicit class CreateLocalTrackOptionsOps[Self <: CreateLocalTrackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogLevel(value: LogLevel | LogLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkaroundWebKitBug180748(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workaroundWebKitBug180748")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkaroundWebKitBug180748: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workaroundWebKitBug180748")(js.undefined)
        ret
    }
  }
  
}

