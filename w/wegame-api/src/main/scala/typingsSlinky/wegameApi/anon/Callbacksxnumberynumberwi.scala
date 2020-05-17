package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.wegameApiStrings.auto
import typingsSlinky.wegameApi.wegameApiStrings.back
import typingsSlinky.wegameApi.wegameApiStrings.front
import typingsSlinky.wegameApi.wegameApiStrings.large
import typingsSlinky.wegameApi.wegameApiStrings.medium
import typingsSlinky.wegameApi.wegameApiStrings.off
import typingsSlinky.wegameApi.wegameApiStrings.on
import typingsSlinky.wegameApi.wegameApiStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wegame-api.wx.types.Callbacks & {  x ? :number,   y ? :number,   width ? :number,   height ? :number,   devicePosition ? :'front' | 'back',   flash ? :'auto' | 'on' | 'off',   size ? :'small' | 'medium' | 'large'} */
@js.native
trait Callbacksxnumberynumberwi extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 摄像头朝向，值为 front, back，默认值back
    */
  var devicePosition: js.UndefOr[front | back] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 闪光灯，值为 auto, on, off，默认值auto
    */
  var flash: js.UndefOr[auto | on | off] = js.native
  /**
    * 相机的高度，默认值150
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * 帧数据图像尺寸，值为 small, medium, large，默认值small
    */
  var size: js.UndefOr[small | medium | large] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 相机的宽度，默认值300
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * 相机的左上角横坐标，默认值0
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * 相机的左上角纵坐标，默认值0
    */
  var y: js.UndefOr[Double] = js.native
}

object Callbacksxnumberynumberwi {
  @scala.inline
  def apply(): Callbacksxnumberynumberwi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacksxnumberynumberwi]
  }
  @scala.inline
  implicit class CallbacksxnumberynumberwiOps[Self <: Callbacksxnumberynumberwi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDevicePosition(value: front | back): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePosition")(js.undefined)
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
    def withFlash(value: auto | on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(js.undefined)
        ret
    }
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
    @scala.inline
    def withSize(value: small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

