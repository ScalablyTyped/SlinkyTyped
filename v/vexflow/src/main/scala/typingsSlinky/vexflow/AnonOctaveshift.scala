package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOctaveshift extends js.Object {
  var octave_shift: js.UndefOr[Double] = js.native
}

object AnonOctaveshift {
  @scala.inline
  def apply(): AnonOctaveshift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOctaveshift]
  }
  @scala.inline
  implicit class AnonOctaveshiftOps[Self <: AnonOctaveshift] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOctave_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("octave_shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOctave_shift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("octave_shift")(js.undefined)
        ret
    }
  }
  
}

