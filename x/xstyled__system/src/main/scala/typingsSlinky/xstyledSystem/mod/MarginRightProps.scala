package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MarginRightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginRightProps[TLength] extends js.Object {
  val marginRight: js.UndefOr[ResponsiveValue[MarginRightProperty[TLength]]] = js.native
  val mr: js.UndefOr[ResponsiveValue[MarginRightProperty[TLength]]] = js.native
}

object MarginRightProps {
  @scala.inline
  def apply[TLength](): MarginRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginRightProps[TLength]]
  }
  @scala.inline
  implicit class MarginRightPropsOps[Self[tlength] <: MarginRightProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMarginRight(value: ResponsiveValue[MarginRightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMr(value: ResponsiveValue[MarginRightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMr: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(js.undefined)
        ret
    }
  }
  
}

