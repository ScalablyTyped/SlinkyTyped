package typingsSlinky.wordpressBlockEditor.richTextMod.RichTextShortcut

import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.access
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.alt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ctrl
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ctrlShift
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.primary
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.primaryAlt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.primaryShift
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.secondary
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.shift
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.shiftAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var character: String
  var `type`: /* keyof @wordpress/block-editor.anon.Access */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
  def onUse(): Unit
}

object Props {
  @scala.inline
  def apply(
    character: String,
    onUse: () => Unit,
    `type`: /* keyof @wordpress/block-editor.anon.Access */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
  ): Props = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], onUse = js.Any.fromFunction0(onUse))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

