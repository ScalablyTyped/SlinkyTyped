package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accidental extends js.Object {
  var accidental: String = js.native
  var code: Double = js.native
  var displaced: Boolean = js.native
  var int_value: Double = js.native
  var key: String = js.native
  var line: Double = js.native
  var octave: Double = js.native
  var shift_right: Double = js.native
  var stroke: Double = js.native
}

object Accidental {
  @scala.inline
  def apply(
    accidental: String,
    code: Double,
    displaced: Boolean,
    int_value: Double,
    key: String,
    line: Double,
    octave: Double,
    shift_right: Double,
    stroke: Double
  ): Accidental = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], displaced = displaced.asInstanceOf[js.Any], int_value = int_value.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], octave = octave.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accidental]
  }
  @scala.inline
  implicit class AccidentalOps[Self <: Accidental] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccidental(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accidental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplaced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOctave(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("octave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift_right(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift_right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStroke(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

