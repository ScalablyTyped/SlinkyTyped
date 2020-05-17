package typingsSlinky.winrtUwp.Windows.System.Profile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides version information about the device family. */
@js.native
trait AnalyticsVersionInfo extends js.Object {
  /** Gets the device family. */
  var deviceFamily: String = js.native
  /** Gets the version within the device family. */
  var deviceFamilyVersion: String = js.native
}

object AnalyticsVersionInfo {
  @scala.inline
  def apply(deviceFamily: String, deviceFamilyVersion: String): AnalyticsVersionInfo = {
    val __obj = js.Dynamic.literal(deviceFamily = deviceFamily.asInstanceOf[js.Any], deviceFamilyVersion = deviceFamilyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsVersionInfo]
  }
  @scala.inline
  implicit class AnalyticsVersionInfoOps[Self <: AnalyticsVersionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceFamilyVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceFamilyVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

