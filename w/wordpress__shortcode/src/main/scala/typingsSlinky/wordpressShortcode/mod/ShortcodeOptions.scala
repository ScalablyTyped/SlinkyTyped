package typingsSlinky.wordpressShortcode.mod

import typingsSlinky.wordpressShortcode.anon.PartialShortcodeAttrs
import typingsSlinky.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typingsSlinky.wordpressShortcode.wordpressShortcodeStrings.closed
import typingsSlinky.wordpressShortcode.wordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortcodeOptions extends js.Object {
  var attrs: js.UndefOr[PartialShortcodeAttrs | String] = js.native
  var content: js.UndefOr[String] = js.native
  var tag: String = js.native
  var `type`: js.UndefOr[closed | `self-closing` | single] = js.native
}

object ShortcodeOptions {
  @scala.inline
  def apply(tag: String): ShortcodeOptions = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcodeOptions]
  }
  @scala.inline
  implicit class ShortcodeOptionsOps[Self <: ShortcodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrs(value: PartialShortcodeAttrs | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: closed | `self-closing` | single): Self = {
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

