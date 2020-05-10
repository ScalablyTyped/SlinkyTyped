package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidthProps[TLength] extends js.Object {
  val width: js.UndefOr[ResponsiveValue[WidthProperty[TLength]]] = js.native
}

object WidthProps {
  @scala.inline
  def apply[TLength](): WidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthProps[TLength]]
  }
  @scala.inline
  implicit class WidthPropsOps[Self[tlength] <: WidthProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withWidth(value: ResponsiveValue[WidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

