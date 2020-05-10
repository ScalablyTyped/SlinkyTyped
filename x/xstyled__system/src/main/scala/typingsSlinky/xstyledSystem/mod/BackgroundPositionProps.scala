package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BackgroundPositionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundPositionProps[TLength] extends js.Object {
  val backgroundPosition: js.UndefOr[ResponsiveValue[BackgroundPositionProperty[TLength]]] = js.native
}

object BackgroundPositionProps {
  @scala.inline
  def apply[TLength](): BackgroundPositionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPositionProps[TLength]]
  }
  @scala.inline
  implicit class BackgroundPositionPropsOps[Self[tlength] <: BackgroundPositionProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBackgroundPosition(value: ResponsiveValue[BackgroundPositionProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundPosition: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPosition")(js.undefined)
        ret
    }
  }
  
}

