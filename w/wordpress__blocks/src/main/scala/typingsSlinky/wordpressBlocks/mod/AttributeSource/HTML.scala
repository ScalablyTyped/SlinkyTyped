package typingsSlinky.wordpressBlocks.mod.AttributeSource

import typingsSlinky.wordpressBlocks.mod._BlockAttribute
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.li
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.p
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML
  extends _BlockAttribute[js.Any] {
  var default: js.UndefOr[String] = js.undefined
  var multiline: js.UndefOr[li | p] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var source: html
  var `type`: string
}

object HTML {
  @scala.inline
  def apply(
    source: html,
    `type`: string,
    default: String = null,
    multiline: li | p = null,
    selector: String = null
  ): HTML = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
}

