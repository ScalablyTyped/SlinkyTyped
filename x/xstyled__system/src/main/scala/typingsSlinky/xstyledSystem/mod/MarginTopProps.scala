package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MarginTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginTopProps[TLength] extends js.Object {
  val marginTop: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.native
  val mt: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.native
}

object MarginTopProps {
  @scala.inline
  def apply[TLength](): MarginTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginTopProps[TLength]]
  }
  @scala.inline
  implicit class MarginTopPropsOps[Self[tlength] <: MarginTopProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMarginTop(value: ResponsiveValue[MarginTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withMt(value: ResponsiveValue[MarginTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMt: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(js.undefined)
        ret
    }
  }
  
}

