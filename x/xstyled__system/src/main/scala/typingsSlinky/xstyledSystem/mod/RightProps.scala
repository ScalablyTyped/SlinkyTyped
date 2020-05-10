package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.RightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightProps[TLength] extends js.Object {
  val right: js.UndefOr[ResponsiveValue[RightProperty[TLength]]] = js.native
}

object RightProps {
  @scala.inline
  def apply[TLength](): RightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightProps[TLength]]
  }
  @scala.inline
  implicit class RightPropsOps[Self[tlength] <: RightProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withRight(value: ResponsiveValue[RightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
  }
  
}

