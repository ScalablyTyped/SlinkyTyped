package typingsSlinky.wordpressShortcode.anon

import typingsSlinky.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typingsSlinky.wordpressShortcode.wordpressShortcodeStrings.closed
import typingsSlinky.wordpressShortcode.wordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeOptions> */
@js.native
trait PartialShortcodeOptions extends js.Object {
  var attrs: js.UndefOr[PartialShortcodeAttrs | String] = js.native
  var content: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[closed | `self-closing` | single] = js.native
}

object PartialShortcodeOptions {
  @scala.inline
  def apply(): PartialShortcodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShortcodeOptions]
  }
  @scala.inline
  implicit class PartialShortcodeOptionsOps[Self <: PartialShortcodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
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

