package typingsSlinky.yaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVerbatim extends js.Object {
  var verbatim: String = js.native
}

object AnonVerbatim {
  @scala.inline
  def apply(verbatim: String): AnonVerbatim = {
    val __obj = js.Dynamic.literal(verbatim = verbatim.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVerbatim]
  }
  @scala.inline
  implicit class AnonVerbatimOps[Self <: AnonVerbatim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerbatim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbatim")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

