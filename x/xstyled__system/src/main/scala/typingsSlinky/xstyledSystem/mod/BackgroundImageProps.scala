package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BackgroundImageProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundImageProps extends js.Object {
  val backgroundImage: js.UndefOr[ResponsiveValue[BackgroundImageProperty]] = js.native
}

object BackgroundImageProps {
  @scala.inline
  def apply(): BackgroundImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageProps]
  }
  @scala.inline
  implicit class BackgroundImagePropsOps[Self <: BackgroundImageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundImage(value: ResponsiveValue[BackgroundImageProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(js.undefined)
        ret
    }
  }
  
}

