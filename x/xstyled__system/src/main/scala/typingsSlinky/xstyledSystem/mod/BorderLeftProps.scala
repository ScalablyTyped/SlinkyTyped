package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderLeftProps[TLength] extends js.Object {
  val borderLeft: js.UndefOr[ResponsiveValue[BorderLeftProperty[TLength]]] = js.native
}

object BorderLeftProps {
  @scala.inline
  def apply[TLength](): BorderLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftProps[TLength]]
  }
  @scala.inline
  implicit class BorderLeftPropsOps[Self[tlength] <: BorderLeftProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBorderLeft(value: ResponsiveValue[BorderLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeft: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(js.undefined)
        ret
    }
  }
  
}

