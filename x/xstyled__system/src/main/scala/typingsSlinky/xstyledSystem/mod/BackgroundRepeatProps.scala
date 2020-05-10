package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BackgroundRepeatProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundRepeatProps extends js.Object {
  val backgroundRepeat: js.UndefOr[ResponsiveValue[BackgroundRepeatProperty]] = js.native
}

object BackgroundRepeatProps {
  @scala.inline
  def apply(): BackgroundRepeatProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundRepeatProps]
  }
  @scala.inline
  implicit class BackgroundRepeatPropsOps[Self <: BackgroundRepeatProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundRepeat(value: ResponsiveValue[BackgroundRepeatProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundRepeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundRepeat")(js.undefined)
        ret
    }
  }
  
}

