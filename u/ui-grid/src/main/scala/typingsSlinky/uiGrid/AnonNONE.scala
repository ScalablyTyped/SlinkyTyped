package typingsSlinky.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNONE extends js.Object {
  var LEFT: String = js.native
  var NONE: String = js.native
  var RIGHT: String = js.native
}

object AnonNONE {
  @scala.inline
  def apply(LEFT: String, NONE: String, RIGHT: String): AnonNONE = {
    val __obj = js.Dynamic.literal(LEFT = LEFT.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNONE]
  }
  @scala.inline
  implicit class AnonNONEOps[Self <: AnonNONE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLEFT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNONE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIGHT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

