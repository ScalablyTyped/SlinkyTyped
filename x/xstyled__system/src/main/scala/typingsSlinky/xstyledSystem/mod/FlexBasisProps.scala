package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.FlexBasisProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexBasisProps[TLength] extends js.Object {
  val flexBasis: js.UndefOr[ResponsiveValue[FlexBasisProperty[TLength]]] = js.native
}

object FlexBasisProps {
  @scala.inline
  def apply[TLength](): FlexBasisProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexBasisProps[TLength]]
  }
  @scala.inline
  implicit class FlexBasisPropsOps[Self[tlength] <: FlexBasisProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withFlexBasis(value: ResponsiveValue[FlexBasisProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexBasis: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(js.undefined)
        ret
    }
  }
  
}

