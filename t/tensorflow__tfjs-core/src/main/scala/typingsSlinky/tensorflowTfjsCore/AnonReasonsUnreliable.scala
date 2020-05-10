package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReasonsUnreliable extends js.Object {
  var reasons: js.Array[String] = js.native
  var unreliable: Boolean = js.native
}

object AnonReasonsUnreliable {
  @scala.inline
  def apply(reasons: js.Array[String], unreliable: Boolean): AnonReasonsUnreliable = {
    val __obj = js.Dynamic.literal(reasons = reasons.asInstanceOf[js.Any], unreliable = unreliable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReasonsUnreliable]
  }
  @scala.inline
  implicit class AnonReasonsUnreliableOps[Self <: AnonReasonsUnreliable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnreliable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreliable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

