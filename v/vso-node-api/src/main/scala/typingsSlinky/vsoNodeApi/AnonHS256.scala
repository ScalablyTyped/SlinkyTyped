package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHS256 extends js.Object {
  var hS256: Double = js.native
  var none: Double = js.native
  var rS256: Double = js.native
}

object AnonHS256 {
  @scala.inline
  def apply(hS256: Double, none: Double, rS256: Double): AnonHS256 = {
    val __obj = js.Dynamic.literal(hS256 = hS256.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rS256 = rS256.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHS256]
  }
  @scala.inline
  implicit class AnonHS256Ops[Self <: AnonHS256] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHS256(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hS256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRS256(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rS256")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

