package typingsSlinky.vsoNodeApi.buildInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildSummary extends js.Object {
  var build: XamlBuildReference = js.native
  var finishTime: js.Date = js.native
  var keepForever: Boolean = js.native
  var quality: String = js.native
  var reason: BuildReason = js.native
  var requestedFor: IdentityRef = js.native
  var startTime: js.Date = js.native
  var status: BuildStatus = js.native
}

object BuildSummary {
  @scala.inline
  def apply(
    build: XamlBuildReference,
    finishTime: js.Date,
    keepForever: Boolean,
    quality: String,
    reason: BuildReason,
    requestedFor: IdentityRef,
    startTime: js.Date,
    status: BuildStatus
  ): BuildSummary = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSummary]
  }
  @scala.inline
  implicit class BuildSummaryOps[Self <: BuildSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: XamlBuildReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepForever(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepForever")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: BuildReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedFor(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: BuildStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

