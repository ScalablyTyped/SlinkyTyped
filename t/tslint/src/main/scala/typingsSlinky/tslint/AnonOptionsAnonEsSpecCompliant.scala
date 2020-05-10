package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptionsAnonEsSpecCompliant extends js.Object {
  var options: AnonEsSpecCompliant = js.native
}

object AnonOptionsAnonEsSpecCompliant {
  @scala.inline
  def apply(options: AnonEsSpecCompliant): AnonOptionsAnonEsSpecCompliant = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptionsAnonEsSpecCompliant]
  }
  @scala.inline
  implicit class AnonOptionsAnonEsSpecCompliantOps[Self <: AnonOptionsAnonEsSpecCompliant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: AnonEsSpecCompliant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

