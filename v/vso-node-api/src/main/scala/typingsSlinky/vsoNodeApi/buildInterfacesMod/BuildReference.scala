package typingsSlinky.vsoNodeApi.buildInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildReference extends js.Object {
  var _links: js.Any = js.native
  /**
    * The build number.
    */
  var buildNumber: String = js.native
  /**
    * Indicates whether the build has been deleted.
    */
  var deleted: Boolean = js.native
  /**
    * The time that the build was completed.
    */
  var finishTime: js.Date = js.native
  /**
    * The ID of the build.
    */
  var id: Double = js.native
  /**
    * The time that the build was queued.
    */
  var queueTime: js.Date = js.native
  /**
    * The identity on whose behalf the build was queued.
    */
  var requestedFor: IdentityRef = js.native
  /**
    * The build result.
    */
  var result: BuildResult = js.native
  /**
    * The time that the build was started.
    */
  var startTime: js.Date = js.native
  /**
    * The build status.
    */
  var status: BuildStatus = js.native
}

object BuildReference {
  @scala.inline
  def apply(
    _links: js.Any,
    buildNumber: String,
    deleted: Boolean,
    finishTime: js.Date,
    id: Double,
    queueTime: js.Date,
    requestedFor: IdentityRef,
    result: BuildResult,
    startTime: js.Date,
    status: BuildStatus
  ): BuildReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], buildNumber = buildNumber.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildReference]
  }
  @scala.inline
  implicit class BuildReferenceOps[Self <: BuildReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedFor(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: BuildResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
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

