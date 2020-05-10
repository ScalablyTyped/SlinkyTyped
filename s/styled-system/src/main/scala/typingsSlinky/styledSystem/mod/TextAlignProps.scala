package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.TextAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAlignProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The text-align CSS property specifies the horizontal alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-align)
    */
  var textAlign: js.UndefOr[ResponsiveValue[TextAlignProperty, ThemeType]] = js.native
}

object TextAlignProps {
  @scala.inline
  def apply[ThemeType](): TextAlignProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAlignProps[ThemeType]]
  }
  @scala.inline
  implicit class TextAlignPropsOps[Self[themetype] <: TextAlignProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withTextAlign(value: ResponsiveValue[TextAlignProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlignNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(null)
        ret
    }
  }
  
}

