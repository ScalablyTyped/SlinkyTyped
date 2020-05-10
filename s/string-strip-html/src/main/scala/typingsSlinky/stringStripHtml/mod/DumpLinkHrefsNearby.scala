package typingsSlinky.stringStripHtml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DumpLinkHrefsNearby extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var putOnNewLine: js.UndefOr[Boolean] = js.native
  var wrapHeads: js.UndefOr[String] = js.native
  var wrapTails: js.UndefOr[String] = js.native
}

object DumpLinkHrefsNearby {
  @scala.inline
  def apply(): DumpLinkHrefsNearby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DumpLinkHrefsNearby]
  }
  @scala.inline
  implicit class DumpLinkHrefsNearbyOps[Self <: DumpLinkHrefsNearby] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPutOnNewLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putOnNewLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPutOnNewLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putOnNewLine")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapHeads(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapHeads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapHeads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapHeads")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapTails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapTails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapTails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapTails")(js.undefined)
        ret
    }
  }
  
}

