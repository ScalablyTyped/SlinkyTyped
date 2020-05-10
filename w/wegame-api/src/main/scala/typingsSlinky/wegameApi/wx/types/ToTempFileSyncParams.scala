package typingsSlinky.wegameApi.wx.types

import typingsSlinky.wegameApi.wegameApiStrings.jpg
import typingsSlinky.wegameApi.wegameApiStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToTempFileSyncParams extends js.Object {
  /**
    * 目标文件的高度，会将截取的部分拉伸或压缩至该数值
    */
  var destHeight: js.UndefOr[Double] = js.native
  /**
    * 目标文件的宽度，会将截取的部分拉伸或压缩至该数值
    */
  var destWidth: js.UndefOr[Double] = js.native
  /**
    * 目标文件的类型
    */
  var fileType: js.UndefOr[jpg | png] = js.native
  /**
    * 截取 canvas 的高度
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * jpg图片的质量，仅当 fileType 为 jpg 时有效。取值范围为 0.0（最低）- 1.0（最高），不含 0。不在范围内时当作 1.0
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * 截取 canvas 的宽度
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * 截取 canvas 的左上角横坐标
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * 截取 canvas 的左上角纵坐标
    */
  var y: js.UndefOr[Double] = js.native
}

object ToTempFileSyncParams {
  @scala.inline
  def apply(): ToTempFileSyncParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToTempFileSyncParams]
  }
  @scala.inline
  implicit class ToTempFileSyncParamsOps[Self <: ToTempFileSyncParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDestWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: jpg | png): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
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
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
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

