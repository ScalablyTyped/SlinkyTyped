package typingsSlinky.vexflow

import typingsSlinky.vexflow.Vex.Flow.Glyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlyph extends js.Object {
  var glyph: Glyph = js.native
  var num: Double = js.native
}

object AnonGlyph {
  @scala.inline
  def apply(glyph: Glyph, num: Double): AnonGlyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlyph]
  }
  @scala.inline
  implicit class AnonGlyphOps[Self <: AnonGlyph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlyph(value: Glyph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

