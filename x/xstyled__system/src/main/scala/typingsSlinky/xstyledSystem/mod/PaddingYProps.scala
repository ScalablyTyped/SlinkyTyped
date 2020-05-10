package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.PaddingTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingYProps[TLength] extends js.Object {
  val py: js.UndefOr[ResponsiveValue[PaddingTopProperty[TLength]]] = js.native
}

object PaddingYProps {
  @scala.inline
  def apply[TLength](): PaddingYProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingYProps[TLength]]
  }
  @scala.inline
  implicit class PaddingYPropsOps[Self[tlength] <: PaddingYProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withPy(value: ResponsiveValue[PaddingTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("py")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPy: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("py")(js.undefined)
        ret
    }
  }
  
}

