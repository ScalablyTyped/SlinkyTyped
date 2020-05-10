package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.PaddingLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingLeftProps[TLength] extends js.Object {
  val paddingLeft: js.UndefOr[ResponsiveValue[PaddingLeftProperty[TLength]]] = js.native
  val pl: js.UndefOr[ResponsiveValue[PaddingLeftProperty[TLength]]] = js.native
}

object PaddingLeftProps {
  @scala.inline
  def apply[TLength](): PaddingLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingLeftProps[TLength]]
  }
  @scala.inline
  implicit class PaddingLeftPropsOps[Self[tlength] <: PaddingLeftProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withPaddingLeft(value: ResponsiveValue[PaddingLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeft: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPl(value: ResponsiveValue[PaddingLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPl: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(js.undefined)
        ret
    }
  }
  
}

