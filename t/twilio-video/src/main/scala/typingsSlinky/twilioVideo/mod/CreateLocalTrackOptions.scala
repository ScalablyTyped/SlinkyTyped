package typingsSlinky.twilioVideo.mod

import typingsSlinky.std.MediaTrackConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogLevel(value: LogLevel | LogLevels): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setWorkaroundWebKitBug180748(value: Boolean): Self = this.set("workaroundWebKitBug180748", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkaroundWebKitBug180748: Self = this.set("workaroundWebKitBug180748", js.undefined)
  }
}
