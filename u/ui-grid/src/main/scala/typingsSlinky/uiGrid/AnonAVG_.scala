package typingsSlinky.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAVG_ extends js.Object {
  var AVG: String = js.native
  var COUNT: String = js.native
  var MAX: String = js.native
  var MIN: String = js.native
  var SUM: String = js.native
}

object AnonAVG_ {
  @scala.inline
  def apply(AVG: String, COUNT: String, MAX: String, MIN: String, SUM: String): AnonAVG_ = {
    val __obj = js.Dynamic.literal(AVG = AVG.asInstanceOf[js.Any], COUNT = COUNT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any], SUM = SUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAVG_]
  }
  @scala.inline
  implicit class AnonAVG_Ops[Self <: AnonAVG_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAVG(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AVG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOUNT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COUNT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

