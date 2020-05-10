package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.AlignContentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignContentProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS align-content property sets how the browser distributes space between and around content items
    * along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-content)
    */
  var alignContent: js.UndefOr[ResponsiveValue[AlignContentProperty, ThemeType]] = js.native
}

object AlignContentProps {
  @scala.inline
  def apply[ThemeType](): AlignContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignContentProps[ThemeType]]
  }
  @scala.inline
  implicit class AlignContentPropsOps[Self[themetype] <: AlignContentProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withAlignContent(value: ResponsiveValue[AlignContentProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignContent: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignContentNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(null)
        ret
    }
  }
  
}

