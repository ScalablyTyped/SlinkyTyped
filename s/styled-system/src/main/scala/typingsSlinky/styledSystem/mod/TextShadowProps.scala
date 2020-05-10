package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.TextShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The `text-shadow` CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied
    * to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from
    * the element, blur radius, and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-shadow)
    */
  var textShadow: js.UndefOr[ResponsiveValue[TextShadowProperty | Double, ThemeType]] = js.native
}

object TextShadowProps {
  @scala.inline
  def apply[ThemeType](): TextShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowProps[ThemeType]]
  }
  @scala.inline
  implicit class TextShadowPropsOps[Self[themetype] <: TextShadowProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withTextShadow(value: ResponsiveValue[TextShadowProperty | Double, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadow: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadow")(null)
        ret
    }
  }
  
}

