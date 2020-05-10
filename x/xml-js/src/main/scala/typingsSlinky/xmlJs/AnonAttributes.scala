package typingsSlinky.xmlJs

import typingsSlinky.xmlJs.mod.DeclarationAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributes extends js.Object {
  var _attributes: js.UndefOr[DeclarationAttributes] = js.native
}

object AnonAttributes {
  @scala.inline
  def apply(): AnonAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAttributes]
  }
  @scala.inline
  implicit class AnonAttributesOps[Self <: AnonAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_attributes(value: DeclarationAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attributes")(js.undefined)
        ret
    }
  }
  
}

