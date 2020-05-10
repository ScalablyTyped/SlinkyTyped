package typingsSlinky.wordpressNux.selectorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuideInfo extends js.Object {
  /**
    * The guide's currently showing tip.
    */
  var currentTipId: js.UndefOr[String] = js.native
  /**
    * The guide's next tip to show.
    */
  var nextTipId: js.UndefOr[String] = js.native
  /**
    * Which tips the guide contains.
    */
  var tipIds: js.Array[String] = js.native
}

object GuideInfo {
  @scala.inline
  def apply(tipIds: js.Array[String]): GuideInfo = {
    val __obj = js.Dynamic.literal(tipIds = tipIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuideInfo]
  }
  @scala.inline
  implicit class GuideInfoOps[Self <: GuideInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTipIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTipId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTipId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTipId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTipId")(js.undefined)
        ret
    }
    @scala.inline
    def withNextTipId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTipId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextTipId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTipId")(js.undefined)
        ret
    }
  }
  
}

