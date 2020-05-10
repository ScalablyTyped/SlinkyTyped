package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.BoxShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The box-shadow CSS property adds shadow effects around an element's frame. You can set multiple effects separated
    * by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow)
    */
  var boxShadow: js.UndefOr[ResponsiveValue[BoxShadowProperty | Double, ThemeType]] = js.native
}

object BoxShadowProps {
  @scala.inline
  def apply[ThemeType](): BoxShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxShadowProps[ThemeType]]
  }
  @scala.inline
  implicit class BoxShadowPropsOps[Self[themetype] <: BoxShadowProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withBoxShadow(value: ResponsiveValue[BoxShadowProperty | Double, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadow: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadowNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadow")(null)
        ret
    }
  }
  
}

