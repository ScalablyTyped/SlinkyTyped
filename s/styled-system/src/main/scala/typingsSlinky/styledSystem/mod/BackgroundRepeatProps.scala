package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.BackgroundRepeatProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundRepeatProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The background-repeat CSS property sets how background images are repeated. A background
    * image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat)
    */
  var backgroundRepeat: js.UndefOr[ResponsiveValue[BackgroundRepeatProperty, ThemeType]] = js.native
}

object BackgroundRepeatProps {
  @scala.inline
  def apply[ThemeType](): BackgroundRepeatProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundRepeatProps[ThemeType]]
  }
  @scala.inline
  implicit class BackgroundRepeatPropsOps[Self[themetype] <: BackgroundRepeatProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withBackgroundRepeat(value: ResponsiveValue[BackgroundRepeatProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundRepeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundRepeat: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundRepeat")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundRepeatNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundRepeat")(null)
        ret
    }
  }
  
}

