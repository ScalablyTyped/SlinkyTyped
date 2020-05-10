package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MarginTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginProps[TLength] extends js.Object {
  val m: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.native
  val margin: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.native
}

object MarginProps {
  @scala.inline
  def apply[TLength](): MarginProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginProps[TLength]]
  }
  @scala.inline
  implicit class MarginPropsOps[Self[tlength] <: MarginProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withM(value: ResponsiveValue[MarginTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: ResponsiveValue[MarginTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
  }
  
}

