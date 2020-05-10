package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MarginLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginLeftProps[TLength] extends js.Object {
  val marginLeft: js.UndefOr[ResponsiveValue[MarginLeftProperty[TLength]]] = js.native
  val ml: js.UndefOr[ResponsiveValue[MarginLeftProperty[TLength]]] = js.native
}

object MarginLeftProps {
  @scala.inline
  def apply[TLength](): MarginLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginLeftProps[TLength]]
  }
  @scala.inline
  implicit class MarginLeftPropsOps[Self[tlength] <: MarginLeftProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMarginLeft(value: ResponsiveValue[MarginLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMl(value: ResponsiveValue[MarginLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMl: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(js.undefined)
        ret
    }
  }
  
}

