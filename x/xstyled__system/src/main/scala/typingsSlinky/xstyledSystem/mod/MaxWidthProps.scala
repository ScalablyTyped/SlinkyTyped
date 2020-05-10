package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MaxWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxWidthProps[TLength] extends js.Object {
  val maxWidth: js.UndefOr[ResponsiveValue[MaxWidthProperty[TLength]]] = js.native
}

object MaxWidthProps {
  @scala.inline
  def apply[TLength](): MaxWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidthProps[TLength]]
  }
  @scala.inline
  implicit class MaxWidthPropsOps[Self[tlength] <: MaxWidthProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMaxWidth(value: ResponsiveValue[MaxWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
  }
  
}

