package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.JustifySelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifySelfProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS justify-self property set the way a box is justified inside its alignment container along
    * the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self)
    */
  var justifySelf: js.UndefOr[ResponsiveValue[JustifySelfProperty, ThemeType]] = js.native
}

object JustifySelfProps {
  @scala.inline
  def apply[ThemeType](): JustifySelfProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifySelfProps[ThemeType]]
  }
  @scala.inline
  implicit class JustifySelfPropsOps[Self[themetype] <: JustifySelfProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withJustifySelf(value: ResponsiveValue[JustifySelfProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifySelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifySelf: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifySelf")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifySelfNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifySelf")(null)
        ret
    }
  }
  
}

