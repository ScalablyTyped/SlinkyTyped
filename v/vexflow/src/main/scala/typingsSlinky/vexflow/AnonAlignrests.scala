package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlignrests extends js.Object {
  var align_rests: Boolean = js.native
  var auto_beam: Boolean = js.native
}

object AnonAlignrests {
  @scala.inline
  def apply(align_rests: Boolean, auto_beam: Boolean): AnonAlignrests = {
    val __obj = js.Dynamic.literal(align_rests = align_rests.asInstanceOf[js.Any], auto_beam = auto_beam.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignrests]
  }
  @scala.inline
  implicit class AnonAlignrestsOps[Self <: AnonAlignrests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign_rests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align_rests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuto_beam(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_beam")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

