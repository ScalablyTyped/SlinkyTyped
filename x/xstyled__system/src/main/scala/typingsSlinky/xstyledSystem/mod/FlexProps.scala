package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.FlexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexProps[TLength] extends js.Object {
  val flex: js.UndefOr[ResponsiveValue[FlexProperty[TLength]]] = js.native
}

object FlexProps {
  @scala.inline
  def apply[TLength](): FlexProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps[TLength]]
  }
  @scala.inline
  implicit class FlexPropsOps[Self[tlength] <: FlexProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withFlex(value: ResponsiveValue[FlexProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
        ret
    }
  }
  
}

