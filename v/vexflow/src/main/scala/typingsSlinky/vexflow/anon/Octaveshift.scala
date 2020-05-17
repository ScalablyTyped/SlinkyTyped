package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Octaveshift extends js.Object {
  var octave_shift: js.UndefOr[Double] = js.native
}

object Octaveshift {
  @scala.inline
  def apply(): Octaveshift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Octaveshift]
  }
  @scala.inline
  implicit class OctaveshiftOps[Self <: Octaveshift] (val x: Self) extends AnyVal {
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

