package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorProps[TLength] extends js.Object {
  val backgroundColor: js.UndefOr[ResponsiveValue[BackgroundProperty[TLength]]] = js.native
}

object BackgroundColorProps {
  @scala.inline
  def apply[TLength](): BackgroundColorProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorProps[TLength]]
  }
  @scala.inline
  implicit class BackgroundColorPropsOps[Self[tlength] <: BackgroundColorProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBackgroundColor(value: ResponsiveValue[BackgroundProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
  }
  
}

