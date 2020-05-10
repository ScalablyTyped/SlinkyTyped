package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.VerticalAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerticalAlignProps[TLength] extends js.Object {
  val verticalAlign: js.UndefOr[ResponsiveValue[VerticalAlignProperty[TLength]]] = js.native
}

object VerticalAlignProps {
  @scala.inline
  def apply[TLength](): VerticalAlignProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalAlignProps[TLength]]
  }
  @scala.inline
  implicit class VerticalAlignPropsOps[Self[tlength] <: VerticalAlignProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withVerticalAlign(value: ResponsiveValue[VerticalAlignProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
  }
  
}

