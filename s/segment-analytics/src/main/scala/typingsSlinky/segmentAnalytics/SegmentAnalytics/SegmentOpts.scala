package typingsSlinky.segmentAnalytics.SegmentAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Generic options object with integrations
@js.native
trait SegmentOpts extends js.Object {
  var anonymousId: js.UndefOr[String] = js.native
  var context: js.UndefOr[js.Object] = js.native
  var integrations: js.UndefOr[js.Any] = js.native
}

object SegmentOpts {
  @scala.inline
  def apply(): SegmentOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentOpts]
  }
  @scala.inline
  implicit class SegmentOptsOps[Self <: SegmentOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymousId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymousId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymousId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymousId")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrations")(js.undefined)
        ret
    }
  }
  
}

