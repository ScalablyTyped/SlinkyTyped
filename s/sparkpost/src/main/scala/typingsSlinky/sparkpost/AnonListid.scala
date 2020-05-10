package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonListid extends js.Object {
  var list_id: String = js.native
}

object AnonListid {
  @scala.inline
  def apply(list_id: String): AnonListid = {
    val __obj = js.Dynamic.literal(list_id = list_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListid]
  }
  @scala.inline
  implicit class AnonListidOps[Self <: AnonListid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

