package typingsSlinky.seleniumWebdriver.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPerfLoggingPrefs extends js.Object {
  var bufferUsageReportingInterval: Double = js.native
  var enableNetwork: Boolean = js.native
  var enablePage: Boolean = js.native
  var enableTimeline: Boolean = js.native
  var tracingCategories: String = js.native
}

object IPerfLoggingPrefs {
  @scala.inline
  def apply(
    bufferUsageReportingInterval: Double,
    enableNetwork: Boolean,
    enablePage: Boolean,
    enableTimeline: Boolean,
    tracingCategories: String
  ): IPerfLoggingPrefs = {
    val __obj = js.Dynamic.literal(bufferUsageReportingInterval = bufferUsageReportingInterval.asInstanceOf[js.Any], enableNetwork = enableNetwork.asInstanceOf[js.Any], enablePage = enablePage.asInstanceOf[js.Any], enableTimeline = enableTimeline.asInstanceOf[js.Any], tracingCategories = tracingCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerfLoggingPrefs]
  }
  @scala.inline
  implicit class IPerfLoggingPrefsOps[Self <: IPerfLoggingPrefs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferUsageReportingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferUsageReportingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableNetwork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnablePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableTimeline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracingCategories(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracingCategories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

