package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MarginLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginXProps[TLength] extends js.Object {
  val mx: js.UndefOr[ResponsiveValue[MarginLeftProperty[TLength]]] = js.native
}

object MarginXProps {
  @scala.inline
  def apply[TLength](): MarginXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginXProps[TLength]]
  }
  @scala.inline
  implicit class MarginXPropsOps[Self[tlength] <: MarginXProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMx(value: ResponsiveValue[MarginLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMx: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mx")(js.undefined)
        ret
    }
  }
  
}

