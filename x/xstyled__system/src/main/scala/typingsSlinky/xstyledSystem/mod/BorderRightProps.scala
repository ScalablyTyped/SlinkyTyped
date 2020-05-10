package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderRightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderRightProps[TLength] extends js.Object {
  val borderRight: js.UndefOr[ResponsiveValue[BorderRightProperty[TLength]]] = js.native
}

object BorderRightProps {
  @scala.inline
  def apply[TLength](): BorderRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRightProps[TLength]]
  }
  @scala.inline
  implicit class BorderRightPropsOps[Self[tlength] <: BorderRightProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBorderRight(value: ResponsiveValue[BorderRightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(js.undefined)
        ret
    }
  }
  
}

