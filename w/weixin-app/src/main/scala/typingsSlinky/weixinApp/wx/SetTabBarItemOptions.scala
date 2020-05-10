package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTabBarItemOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片路径, icon 大小限制为40kb
  		 * 建议尺寸为 81px * 81px
  		 * 当 postion 为 top 时，此参数无效，不支持网络图片
  		 */
  var iconPath: js.UndefOr[String] = js.native
  /** tabBar 的哪一项，从左边算起 */
  var index: Double = js.native
  /**
  		 * 选中时的图片路径
  		 * icon 大小限制为40kb，建议尺寸为 81px * 81px
  		 * 当 postion 为 top
  		 */
  var selectedIconPath: js.UndefOr[String] = js.native
  /** tab 上按钮文字 */
  var text: js.UndefOr[String] = js.native
}

object SetTabBarItemOptions {
  @scala.inline
  def apply(index: Double): SetTabBarItemOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarItemOptions]
  }
  @scala.inline
  implicit class SetTabBarItemOptionsOps[Self <: SetTabBarItemOptions] (val x: Self) extends AnyVal {
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
    def withIconPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIconPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIconPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIconPath")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

