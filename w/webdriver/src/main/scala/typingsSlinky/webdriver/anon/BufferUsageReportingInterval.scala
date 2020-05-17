package typingsSlinky.webdriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferUsageReportingInterval extends js.Object {
  var bufferUsageReportingInterval: js.UndefOr[Boolean] = js.native
  var enableNetwork: js.UndefOr[Boolean] = js.native
  var enablePage: js.UndefOr[Boolean] = js.native
  var enableTimeline: js.UndefOr[Boolean] = js.native
  var tracingCategories: js.UndefOr[Boolean] = js.native
}

object BufferUsageReportingInterval {
  @scala.inline
  def apply(): BufferUsageReportingInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferUsageReportingInterval]
  }
  @scala.inline
  implicit class BufferUsageReportingIntervalOps[Self <: BufferUsageReportingInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferUsageReportingInterval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferUsageReportingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferUsageReportingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferUsageReportingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNetwork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePage")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTimeline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTimeline")(js.undefined)
        ret
    }
    @scala.inline
    def withTracingCategories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracingCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracingCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracingCategories")(js.undefined)
        ret
    }
  }
  
}

