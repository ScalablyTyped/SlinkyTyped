package typingsSlinky.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReasonsUnreliable extends js.Object {
  var reasons: js.Array[String] = js.native
  var unreliable: Boolean = js.native
}

object ReasonsUnreliable {
  @scala.inline
  def apply(reasons: js.Array[String], unreliable: Boolean): ReasonsUnreliable = {
    val __obj = js.Dynamic.literal(reasons = reasons.asInstanceOf[js.Any], unreliable = unreliable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReasonsUnreliable]
  }
  @scala.inline
  implicit class ReasonsUnreliableOps[Self <: ReasonsUnreliable] (val x: Self) extends AnyVal {
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

