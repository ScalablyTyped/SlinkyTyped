package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MarginTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginYProps[TLength] extends js.Object {
  val my: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.native
}

object MarginYProps {
  @scala.inline
  def apply[TLength](): MarginYProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginYProps[TLength]]
  }
  @scala.inline
  implicit class MarginYPropsOps[Self[tlength] <: MarginYProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMy(value: ResponsiveValue[MarginTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMy: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(js.undefined)
        ret
    }
  }
  
}

