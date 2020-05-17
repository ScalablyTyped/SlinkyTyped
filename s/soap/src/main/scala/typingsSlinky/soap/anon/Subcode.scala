package typingsSlinky.soap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subcode extends js.Object {
  var Subcode: js.UndefOr[Value] = js.native
  var Value: String = js.native
}

object Subcode {
  @scala.inline
  def apply(Value: String): Subcode = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subcode]
  }
  @scala.inline
  implicit class SubcodeOps[Self <: Subcode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubcode(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subcode")(js.undefined)
        ret
    }
  }
  
}

