package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing source crawl status information. */
@js.native
trait SourceStatus extends js.Object {
  /** Date in UTC format indicating when the last crawl was attempted. If `null`, no crawl was completed. */
  var last_updated: js.UndefOr[String] = js.native
  /** The current status of the source crawl for this collection. This field returns `not_configured` if the default configuration for this source does not have a **source** object defined. -  `running` indicates that a crawl to fetch more documents is in progress. -  `complete` indicates that the crawl has completed with no errors. -  `queued` indicates that the crawl has been paused by the system and will automatically restart when possible. */
  var status: js.UndefOr[String] = js.native
}

object SourceStatus {
  @scala.inline
  def apply(): SourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceStatus]
  }
  @scala.inline
  implicit class SourceStatusOps[Self <: SourceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_updated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_updated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_updated")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

