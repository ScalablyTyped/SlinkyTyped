package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowActionSheetRes extends js.Object {
  /**
    * 用户点击的按钮，从上到下的顺序，从0开始
    */
  var tapIndex: js.UndefOr[Double] = js.native
}

object ShowActionSheetRes {
  @scala.inline
  def apply(): ShowActionSheetRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowActionSheetRes]
  }
  @scala.inline
  implicit class ShowActionSheetResOps[Self <: ShowActionSheetRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTapIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapIndex")(js.undefined)
        ret
    }
  }
  
}

