package typingsSlinky.uuidv4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonV4 extends js.Object {
  var v4: js.RegExp = js.native
  var v5: js.RegExp = js.native
}

object AnonV4 {
  @scala.inline
  def apply(v4: js.RegExp, v5: js.RegExp): AnonV4 = {
    val __obj = js.Dynamic.literal(v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonV4]
  }
  @scala.inline
  implicit class AnonV4Ops[Self <: AnonV4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withV4(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV5(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v5")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

