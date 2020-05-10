package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongPressActionsSuccessData extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var tapIndex: js.UndefOr[Double] = js.native
}

object LongPressActionsSuccessData {
  @scala.inline
  def apply(): LongPressActionsSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongPressActionsSuccessData]
  }
  @scala.inline
  implicit class LongPressActionsSuccessDataOps[Self <: LongPressActionsSuccessData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
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

