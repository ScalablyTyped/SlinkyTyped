package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.HeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeightProps[TLength] extends js.Object {
  val height: js.UndefOr[ResponsiveValue[HeightProperty[TLength]]] = js.native
}

object HeightProps {
  @scala.inline
  def apply[TLength](): HeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightProps[TLength]]
  }
  @scala.inline
  implicit class HeightPropsOps[Self[tlength] <: HeightProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withHeight(value: ResponsiveValue[HeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
  }
  
}

