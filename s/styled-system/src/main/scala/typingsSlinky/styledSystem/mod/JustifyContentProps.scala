package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.JustifyContentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifyContentProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS justify-content property defines how the browser distributes space between and around content items
    * along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content)
    */
  var justifyContent: js.UndefOr[ResponsiveValue[JustifyContentProperty, ThemeType]] = js.native
}

object JustifyContentProps {
  @scala.inline
  def apply[ThemeType](): JustifyContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyContentProps[ThemeType]]
  }
  @scala.inline
  implicit class JustifyContentPropsOps[Self[themetype] <: JustifyContentProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withJustifyContent(value: ResponsiveValue[JustifyContentProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyContent: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifyContentNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(null)
        ret
    }
  }
  
}

