package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.BackgroundImageProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundImageProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The background-image CSS property sets one or more background images on an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-image)
    */
  var backgroundImage: js.UndefOr[ResponsiveValue[BackgroundImageProperty, ThemeType]] = js.native
}

object BackgroundImageProps {
  @scala.inline
  def apply[ThemeType](): BackgroundImageProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageProps[ThemeType]]
  }
  @scala.inline
  implicit class BackgroundImagePropsOps[Self[themetype] <: BackgroundImageProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withBackgroundImage(value: ResponsiveValue[BackgroundImageProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImage: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(null)
        ret
    }
  }
  
}

