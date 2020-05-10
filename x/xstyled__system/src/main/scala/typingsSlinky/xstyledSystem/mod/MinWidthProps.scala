package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MinWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinWidthProps[TLength] extends js.Object {
  val minWidth: js.UndefOr[ResponsiveValue[MinWidthProperty[TLength]]] = js.native
}

object MinWidthProps {
  @scala.inline
  def apply[TLength](): MinWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinWidthProps[TLength]]
  }
  @scala.inline
  implicit class MinWidthPropsOps[Self[tlength] <: MinWidthProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMinWidth(value: ResponsiveValue[MinWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
  }
  
}

