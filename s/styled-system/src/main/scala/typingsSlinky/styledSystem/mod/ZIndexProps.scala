package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZIndexProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The z-index CSS property sets the z-order of a positioned element and its descendants or
    * flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/z-index)
    */
  var zIndex: js.UndefOr[ResponsiveValue[ZIndexProperty, ThemeType]] = js.native
}

object ZIndexProps {
  @scala.inline
  def apply[ThemeType](): ZIndexProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndexProps[ThemeType]]
  }
  @scala.inline
  implicit class ZIndexPropsOps[Self[themetype] <: ZIndexProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withZIndex(value: ResponsiveValue[ZIndexProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(null)
        ret
    }
  }
  
}

