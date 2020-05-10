package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MaxHeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxHeightProps[TLength] extends js.Object {
  val maxHeight: js.UndefOr[ResponsiveValue[MaxHeightProperty[TLength]]] = js.native
}

object MaxHeightProps {
  @scala.inline
  def apply[TLength](): MaxHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeightProps[TLength]]
  }
  @scala.inline
  implicit class MaxHeightPropsOps[Self[tlength] <: MaxHeightProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMaxHeight(value: ResponsiveValue[MaxHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
  }
  
}

