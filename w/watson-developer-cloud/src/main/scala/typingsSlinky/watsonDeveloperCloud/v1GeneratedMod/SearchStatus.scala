package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about the Continuous Relevancy Training for this environment. */
@js.native
trait SearchStatus extends js.Object {
  /** The date stamp of the most recent completed training for this environment. */
  var last_trained: js.UndefOr[String] = js.native
  /** Current scope of the training. Always returned as `environment`. */
  var scope: js.UndefOr[String] = js.native
  /** The current status of Continuous Relevancy Training for this environment. */
  var status: js.UndefOr[String] = js.native
  /** Long description of the current Continuous Relevancy Training status. */
  var status_description: js.UndefOr[String] = js.native
}

object SearchStatus {
  @scala.inline
  def apply(): SearchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchStatus]
  }
  @scala.inline
  implicit class SearchStatusOps[Self <: SearchStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_trained(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_trained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_trained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_trained")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
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
    @scala.inline
    def withStatus_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_description")(js.undefined)
        ret
    }
  }
  
}

