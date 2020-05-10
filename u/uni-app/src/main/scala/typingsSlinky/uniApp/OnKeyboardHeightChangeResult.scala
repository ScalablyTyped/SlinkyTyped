package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnKeyboardHeightChangeResult extends js.Object {
  /**
    * 键盘高度
    */
  var height: js.UndefOr[Double] = js.native
}

object OnKeyboardHeightChangeResult {
  @scala.inline
  def apply(): OnKeyboardHeightChangeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnKeyboardHeightChangeResult]
  }
  @scala.inline
  implicit class OnKeyboardHeightChangeResultOps[Self <: OnKeyboardHeightChangeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
  }
  
}

