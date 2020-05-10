package typingsSlinky.wordpressShortcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortcodeMatch extends js.Object {
  var content: String = js.native
  var index: Double = js.native
  var shortcode: Shortcode_ = js.native
}

object ShortcodeMatch {
  @scala.inline
  def apply(content: String, index: Double, shortcode: Shortcode_): ShortcodeMatch = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], shortcode = shortcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcodeMatch]
  }
  @scala.inline
  implicit class ShortcodeMatchOps[Self <: ShortcodeMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcode(value: Shortcode_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

