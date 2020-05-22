package typingsSlinky.vsoNodeApi.buildInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildSummary extends js.Object {
  var build: XamlBuildReference
  var finishTime: js.Date
  var keepForever: Boolean
  var quality: String
  var reason: BuildReason
  var requestedFor: IdentityRef
  var startTime: js.Date
  var status: BuildStatus
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
}

