package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.PaddingLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingXProps[TLength] extends js.Object {
  val px: js.UndefOr[ResponsiveValue[PaddingLeftProperty[TLength]]] = js.native
}

object PaddingXProps {
  @scala.inline
  def apply[TLength](): PaddingXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingXProps[TLength]]
  }
  @scala.inline
  implicit class PaddingXPropsOps[Self[tlength] <: PaddingXProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withPx(value: ResponsiveValue[PaddingLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPx: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("px")(js.undefined)
        ret
    }
  }
  
}

