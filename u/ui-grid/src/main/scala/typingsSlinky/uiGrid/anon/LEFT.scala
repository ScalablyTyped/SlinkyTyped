package typingsSlinky.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LEFT extends js.Object {
  var DOWN: Double = js.native
  var LEFT: Double = js.native
  var PG_DOWN: Double = js.native
  var PG_UP: Double = js.native
  var RIGHT: Double = js.native
  var UP: Double = js.native
}

object LEFT {
  @scala.inline
  def apply(DOWN: Double, LEFT: Double, PG_DOWN: Double, PG_UP: Double, RIGHT: Double, UP: Double): LEFT = {
    val __obj = js.Dynamic.literal(DOWN = DOWN.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], PG_DOWN = PG_DOWN.asInstanceOf[js.Any], PG_UP = PG_UP.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[LEFT]
  }
  @scala.inline
  implicit class LEFTOps[Self <: LEFT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDOWN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEFT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPG_DOWN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PG_DOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPG_UP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PG_UP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIGHT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

