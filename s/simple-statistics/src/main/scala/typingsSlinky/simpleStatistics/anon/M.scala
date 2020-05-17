package typingsSlinky.simpleStatistics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait M extends js.Object {
  var b: Double = js.native
  var m: Double = js.native
}

object M {
  @scala.inline
  def apply(b: Double, m: Double): M = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any])
    __obj.asInstanceOf[M]
  }
  @scala.inline
  implicit class MOps[Self <: M] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

