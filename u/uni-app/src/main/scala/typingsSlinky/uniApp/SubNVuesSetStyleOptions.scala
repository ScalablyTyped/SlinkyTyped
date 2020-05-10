package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.absolute
import typingsSlinky.uniApp.uniAppStrings.bottom
import typingsSlinky.uniApp.uniAppStrings.dock
import typingsSlinky.uniApp.uniAppStrings.left
import typingsSlinky.uniApp.uniAppStrings.navigationBar
import typingsSlinky.uniApp.uniAppStrings.popup
import typingsSlinky.uniApp.uniAppStrings.right
import typingsSlinky.uniApp.uniAppStrings.static
import typingsSlinky.uniApp.uniAppStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubNVuesSetStyleOptions extends js.Object {
  /**
    * 原生子窗体垂直向上的偏移量
    */
  var bottom: js.UndefOr[String] = js.native
  /**
    * 原生子窗体的停靠方式,仅当原生子窗体 "position" 属性值设置为 "dock" 时才生效
    * - top: 原生子窗体停靠则页面顶部
    * - bottom: 原生子窗体停靠在页面底部
    * - left: 原生子窗体停靠在页面左侧
    * - right: 原生子窗体停靠在页面右侧
    */
  var dock: js.UndefOr[top | bottom | left | right] = js.native
  /**
    * 原生子窗体的高度
    */
  var height: js.UndefOr[String] = js.native
  /**
    * 原生子窗体水平向左的偏移量
    */
  var left: js.UndefOr[String] = js.native
  /**
    * 原生子窗体的边距
    */
  var margin: js.UndefOr[String] = js.native
  /**
    * 原生子窗体的遮罩层,仅当原生子窗体 "type" 属性值设置为 "popup" 时才生效
    * - popup: 弹出层
    * - navigationBar: 导航栏
    */
  var mask: js.UndefOr[popup | navigationBar] = js.native
  /**
    * 原生子窗体的排版位置
    * - static: 原生子窗体在页面中正常定位
    * - absolute: 原生子窗体在页面中绝对定位
    * - dock: 原生子窗体在页面中停靠
    */
  var position: js.UndefOr[static | absolute | dock] = js.native
  /**
    * 原生子窗体水平向右的偏移量
    */
  var right: js.UndefOr[String] = js.native
  /**
    * 原生子窗体垂直向下的偏移量
    */
  var top: js.UndefOr[String] = js.native
  /**
    * 原生子窗体的内置样式
    * - popup: 弹出层
    * - navigationBar: 导航栏
    */
  var `type`: js.UndefOr[popup | navigationBar] = js.native
  /**
    * 原生子窗体的宽度
    */
  var width: js.UndefOr[String] = js.native
}

object SubNVuesSetStyleOptions {
  @scala.inline
  def apply(): SubNVuesSetStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubNVuesSetStyleOptions]
  }
  @scala.inline
  implicit class SubNVuesSetStyleOptionsOps[Self <: SubNVuesSetStyleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withDock(value: top | bottom | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
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
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: popup | navigationBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: static | absolute | dock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: popup | navigationBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
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
  }
  
}

