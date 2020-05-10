package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MinHeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinHeightProps[TLength] extends js.Object {
  val minHeight: js.UndefOr[ResponsiveValue[MinHeightProperty[TLength]]] = js.native
}

object MinHeightProps {
  @scala.inline
  def apply[TLength](): MinHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinHeightProps[TLength]]
  }
  @scala.inline
  implicit class MinHeightPropsOps[Self[tlength] <: MinHeightProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMinHeight(value: ResponsiveValue[MinHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
  }
  
}

