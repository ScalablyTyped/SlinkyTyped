package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppNameHidden extends js.Object {
  /**
    * 游戏名称是否隐藏
    */
  var appNameHidden: Boolean = js.native
  /**
    * 游戏icon的border颜色色值
    */
  var borderColor: String = js.native
  /**
    * 游戏icon的border尺寸
    */
  var borderWidth: Double = js.native
  /**
    * 游戏名称的颜色色值
    */
  var color: String = js.native
  /**
    * 游戏icon的X轴坐标
    */
  var left: Double = js.native
  /**
    * 游戏icon的宽高值
    */
  var size: Double = js.native
  /**
    * 游戏icon的Y轴坐标
    */
  var top: Double = js.native
}

object AnonAppNameHidden {
  @scala.inline
  def apply(
    appNameHidden: Boolean,
    borderColor: String,
    borderWidth: Double,
    color: String,
    left: Double,
    size: Double,
    top: Double
  ): AnonAppNameHidden = {
    val __obj = js.Dynamic.literal(appNameHidden = appNameHidden.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppNameHidden]
  }
  @scala.inline
  implicit class AnonAppNameHiddenOps[Self <: AnonAppNameHidden] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppNameHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appNameHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

