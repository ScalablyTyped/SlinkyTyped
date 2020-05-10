package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.BackgroundPositionProperty
import typingsSlinky.csstype.mod.BackgroundSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends BackgroundImageProps[ThemeType]
     with BackgroundSizeProps[ThemeType, BackgroundSizeProperty[TLengthStyledSystem]]
     with BackgroundPositionProps[ThemeType, BackgroundPositionProperty[TLengthStyledSystem]]
     with BackgroundRepeatProps[ThemeType] {
  /**
    * The background shorthand CSS property sets all background style properties at once,
    * such as color, image, origin and size, repeat method, and others.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background)
    */
  var background: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BackgroundProps {
  @scala.inline
  def apply[ThemeType, TVal](): BackgroundProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BackgroundPropsOps[Self[themetype, tval] <: BackgroundProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withBackground(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(null)
        ret
    }
  }
  
}

