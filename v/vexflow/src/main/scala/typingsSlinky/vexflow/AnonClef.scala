package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClef extends js.Object {
  var auto_stem: js.UndefOr[Boolean] = js.native
  var clef: js.UndefOr[String] = js.native
  var dots: js.UndefOr[Double] = js.native
  var duration: String = js.native
  var keys: js.Array[String] = js.native
  var octave_shift: js.UndefOr[Double] = js.native
  var stem_direction: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonClef {
  @scala.inline
  def apply(duration: String, keys: js.Array[String]): AnonClef = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClef]
  }
  @scala.inline
  implicit class AnonClefOps[Self <: AnonClef] (val x: Self) extends AnyVal {
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
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuto_stem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_stem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_stem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_stem")(js.undefined)
        ret
    }
    @scala.inline
    def withClef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clef")(js.undefined)
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

