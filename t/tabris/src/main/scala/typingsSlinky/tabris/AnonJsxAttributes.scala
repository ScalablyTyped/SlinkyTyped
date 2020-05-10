package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonJsxAttributes extends js.Object {
  var jsxAttributes: js.UndefOr[js.Any] = js.native
  var set: js.UndefOr[js.Any] = js.native
}

object AnonJsxAttributes {
  @scala.inline
  def apply(): AnonJsxAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonJsxAttributes]
  }
  @scala.inline
  implicit class AnonJsxAttributesOps[Self <: AnonJsxAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsxAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsxAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
  }
  
}

