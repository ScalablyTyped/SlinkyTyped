package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.LineHeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineHeightProps[TLength] extends js.Object {
  val lineHeight: js.UndefOr[ResponsiveValue[LineHeightProperty[TLength]]] = js.native
}

object LineHeightProps {
  @scala.inline
  def apply[TLength](): LineHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineHeightProps[TLength]]
  }
  @scala.inline
  implicit class LineHeightPropsOps[Self[tlength] <: LineHeightProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withLineHeight(value: ResponsiveValue[LineHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
  }
  
}

