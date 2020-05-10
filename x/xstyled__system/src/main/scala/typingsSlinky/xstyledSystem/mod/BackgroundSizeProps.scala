package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BackgroundSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundSizeProps[TLength] extends js.Object {
  val backgroundSize: js.UndefOr[ResponsiveValue[BackgroundSizeProperty[TLength]]] = js.native
}

object BackgroundSizeProps {
  @scala.inline
  def apply[TLength](): BackgroundSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSizeProps[TLength]]
  }
  @scala.inline
  implicit class BackgroundSizePropsOps[Self[tlength] <: BackgroundSizeProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBackgroundSize(value: ResponsiveValue[BackgroundSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundSize: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSize")(js.undefined)
        ret
    }
  }
  
}

