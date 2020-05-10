package typingsSlinky.tabtab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabtabEnv extends js.Object {
  /**
    * A Boolean indicating whether we act in "plumbing mode" or not
    */
  var complete: Boolean = js.native
  /**
    * The last String word of the line
    */
  var last: String = js.native
  /**
    * The last word String of partial
    */
  var lastPartial: String = js.native
  /**
    * The String input line
    */
  var line: String = js.native
  /**
    * The String part of line preceding cursor position
    */
  var partial: String = js.native
  /**
    * A Number indicating cursor position
    */
  var point: Double = js.native
  /**
    * The String word preceding last
    */
  var prev: String = js.native
  /**
    * The Number of words in the completed line
    */
  var words: Double = js.native
}

object TabtabEnv {
  @scala.inline
  def apply(
    complete: Boolean,
    last: String,
    lastPartial: String,
    line: String,
    partial: String,
    point: Double,
    prev: String,
    words: Double
  ): TabtabEnv = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastPartial = lastPartial.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabtabEnv]
  }
  @scala.inline
  implicit class TabtabEnvOps[Self <: TabtabEnv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPartial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPartial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

