package typingsSlinky.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDOWN extends js.Object {
  var DOWN: String = js.native
  var LEFT: String = js.native
  var NONE: String = js.native
  var RIGHT: String = js.native
  var UP: String = js.native
}

object AnonDOWN {
  @scala.inline
  def apply(DOWN: String, LEFT: String, NONE: String, RIGHT: String, UP: String): AnonDOWN = {
    val __obj = js.Dynamic.literal(DOWN = DOWN.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDOWN]
  }
  @scala.inline
  implicit class AnonDOWNOps[Self <: AnonDOWN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDOWN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withUP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

