package typingsSlinky.vueSplitpane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitpaneData extends js.Object {
  var active: Boolean = js.native
  var hasMoved: Boolean = js.native
  var height: js.Any = js.native
   // null number string
  var percent: Double = js.native
  var resizeType: String = js.native
  var `type`: String = js.native
}

object SplitpaneData {
  @scala.inline
  def apply(
    active: Boolean,
    hasMoved: Boolean,
    height: js.Any,
    percent: Double,
    resizeType: String,
    `type`: String
  ): SplitpaneData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hasMoved = hasMoved.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], resizeType = resizeType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneData]
  }
  @scala.inline
  implicit class SplitpaneDataOps[Self <: SplitpaneData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

