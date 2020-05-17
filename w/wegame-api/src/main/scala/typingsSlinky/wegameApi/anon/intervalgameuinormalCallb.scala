package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.wegameApiStrings.game
import typingsSlinky.wegameApi.wegameApiStrings.normal
import typingsSlinky.wegameApi.wegameApiStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  interval  :'game' | 'ui' | 'normal'} & wegame-api.wx.types.Callbacks */
@js.native
trait intervalgameuinormalCallb extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 开始监听设备方向的变化。默认值normal，
    * game - 适用于更新游戏的回调频率，在 20ms/次 左右
    * ui - 适用于更新 UI 的回调频率，在 60ms/次 左右
    * normal - 普通的回调频率，在 200ms/次 左右
    */
  var interval: game | ui | normal = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object intervalgameuinormalCallb {
  @scala.inline
  def apply(interval: game | ui | normal): intervalgameuinormalCallb = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[intervalgameuinormalCallb]
  }
  @scala.inline
  implicit class intervalgameuinormalCallbOps[Self <: intervalgameuinormalCallb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: game | ui | normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

