package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectWrapper extends js.Object {
  var control: String = js.native
  var onError: String = js.native
  var other: String = js.native
  var root: String = js.native
  var selectWrapper: String = js.native
  var small: String = js.native
}

object SelectWrapper {
  @scala.inline
  def apply(
    control: String,
    onError: String,
    other: String,
    root: String,
    selectWrapper: String,
    small: String
  ): SelectWrapper = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectWrapper]
  }
  @scala.inline
  implicit class SelectWrapperOps[Self <: SelectWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

