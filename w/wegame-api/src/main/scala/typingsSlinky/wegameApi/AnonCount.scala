package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCount extends js.Object {
  /**
    * 推荐单元 id
    */
  var adUnitId: String = js.native
  /**
    * 游戏icon的数量，请注意，正式版下面渲染出来的icon数量会小于等于count，请注册做好样式兼容
    */
  var count: Double = js.native
  /**
    * 数组的每一项可以针对对应的icon设置位置和样式等信息，style的每一项称为styleItem
    */
  var style: js.Array[AnonAppNameHidden] = js.native
}

object AnonCount {
  @scala.inline
  def apply(adUnitId: String, count: Double, style: js.Array[AnonAppNameHidden]): AnonCount = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
  @scala.inline
  implicit class AnonCountOps[Self <: AnonCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdUnitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adUnitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: js.Array[AnonAppNameHidden]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

