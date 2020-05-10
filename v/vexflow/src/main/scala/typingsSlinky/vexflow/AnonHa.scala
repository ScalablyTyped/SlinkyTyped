package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHa extends js.Object {
  var ha: Double = js.native
  var o: js.Array[String] = js.native
  var x_max: Double = js.native
  var x_min: Double = js.native
}

object AnonHa {
  @scala.inline
  def apply(ha: Double, o: js.Array[String], x_max: Double, x_min: Double): AnonHa = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHa]
  }
  @scala.inline
  implicit class AnonHaOps[Self <: AnonHa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHa(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX_max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX_min(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_min")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

