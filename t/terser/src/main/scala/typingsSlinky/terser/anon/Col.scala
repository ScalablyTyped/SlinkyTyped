package typingsSlinky.terser.anon

import typingsSlinky.terser.terserStrings.comment1
import typingsSlinky.terser.terserStrings.comment2
import typingsSlinky.terser.terserStrings.comment3
import typingsSlinky.terser.terserStrings.comment4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Col extends js.Object {
  var col: Double = js.native
  var line: Double = js.native
  var pos: Double = js.native
  var `type`: comment1 | comment2 | comment3 | comment4 = js.native
  var value: String = js.native
}

object Col {
  @scala.inline
  def apply(
    col: Double,
    line: Double,
    pos: Double,
    `type`: comment1 | comment2 | comment3 | comment4,
    value: String
  ): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
  @scala.inline
  implicit class ColOps[Self <: Col] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: comment1 | comment2 | comment3 | comment4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

