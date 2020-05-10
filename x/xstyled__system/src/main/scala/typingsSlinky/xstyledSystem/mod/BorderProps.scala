package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderProps[TLength] extends js.Object {
  val border: js.UndefOr[ResponsiveValue[BorderProperty[TLength]]] = js.native
}

object BorderProps {
  @scala.inline
  def apply[TLength](): BorderProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps[TLength]]
  }
  @scala.inline
  implicit class BorderPropsOps[Self[tlength] <: BorderProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBorder(value: ResponsiveValue[BorderProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
  }
  
}

