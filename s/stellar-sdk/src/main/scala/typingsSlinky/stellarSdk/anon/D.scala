package typingsSlinky.stellarSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D extends js.Object {
  var d: Double = js.native
  var n: Double = js.native
}

object D {
  @scala.inline
  def apply(d: Double, n: Double): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  @scala.inline
  implicit class DOps[Self <: D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

