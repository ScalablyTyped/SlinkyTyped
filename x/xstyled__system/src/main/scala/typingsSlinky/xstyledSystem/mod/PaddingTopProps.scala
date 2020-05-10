package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.PaddingTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingTopProps[TLength] extends js.Object {
  val paddingTop: js.UndefOr[ResponsiveValue[PaddingTopProperty[TLength]]] = js.native
  val pt: js.UndefOr[ResponsiveValue[PaddingTopProperty[TLength]]] = js.native
}

object PaddingTopProps {
  @scala.inline
  def apply[TLength](): PaddingTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingTopProps[TLength]]
  }
  @scala.inline
  implicit class PaddingTopPropsOps[Self[tlength] <: PaddingTopProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withPaddingTop(value: ResponsiveValue[PaddingTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTop: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPt(value: ResponsiveValue[PaddingTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPt: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(js.undefined)
        ret
    }
  }
  
}

