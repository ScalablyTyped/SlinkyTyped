package typingsSlinky.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleColumnMenuResponse extends js.Object {
  var canceled: Boolean = js.native
  var selectedIndex: Double = js.native
  var selectedText: String = js.native
  var submitted: Boolean = js.native
  var unexpectedKey: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SingleColumnMenuResponse {
  @scala.inline
  def apply(
    canceled: Boolean,
    selectedIndex: Double,
    selectedText: String,
    submitted: Boolean,
    unexpectedKey: String,
    x: Double,
    y: Double
  ): SingleColumnMenuResponse = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedText = selectedText.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], unexpectedKey = unexpectedKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleColumnMenuResponse]
  }
  @scala.inline
  implicit class SingleColumnMenuResponseOps[Self <: SingleColumnMenuResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanceled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnexpectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unexpectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

