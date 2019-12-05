package typingsSlinky.atWordpressShortcode.atWordpressShortcodeMod

import typingsSlinky.atWordpressShortcode.atWordpressShortcodeStrings.`self-closing`
import typingsSlinky.atWordpressShortcode.atWordpressShortcodeStrings.closed
import typingsSlinky.atWordpressShortcode.atWordpressShortcodeStrings.single
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcodeOptions extends js.Object {
  var attrs: js.UndefOr[Partial[ShortcodeAttrs] | String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var tag: String
  var `type`: js.UndefOr[closed | `self-closing` | single] = js.undefined
}

object ShortcodeOptions {
  @scala.inline
  def apply(
    tag: String,
    attrs: Partial[ShortcodeAttrs] | String = null,
    content: String = null,
    `type`: closed | `self-closing` | single = null
  ): ShortcodeOptions = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcodeOptions]
  }
}

