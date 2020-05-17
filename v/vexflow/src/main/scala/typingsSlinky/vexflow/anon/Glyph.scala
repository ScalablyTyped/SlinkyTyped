package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Glyph extends js.Object {
  var glyph: typingsSlinky.vexflow.Vex.Flow.Glyph = js.native
  var num: Double = js.native
}

object Glyph {
  @scala.inline
  def apply(glyph: typingsSlinky.vexflow.Vex.Flow.Glyph, num: Double): Glyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
  @scala.inline
  implicit class GlyphOps[Self <: Glyph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlyph(value: typingsSlinky.vexflow.Vex.Flow.Glyph): Self = {
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

