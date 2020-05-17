package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Positions extends js.Object {
  var dots: js.UndefOr[Double] = js.native
  var duration: String = js.native
  var positions: js.Array[Fret] = js.native
  var stem_direction: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Positions {
  @scala.inline
  def apply(duration: String, positions: js.Array[Fret]): Positions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positions]
  }
  @scala.inline
  implicit class PositionsOps[Self <: Positions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositions(value: js.Array[Fret]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDots(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withStem_direction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStem_direction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_direction")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

