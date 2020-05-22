package typingsSlinky.wordpressBlockEditor.mod

import typingsSlinky.wordpressBlockEditor.anon.TypeofimportedActions
import typingsSlinky.wordpressBlockEditor.anon.TypeofimportedSelectors
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.`coreSlashblock-editor`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_coreblockeditor(key: `coreSlashblock-editor`): TypeofimportedActions = js.native
  @JSName("select")
  def select_coreblockeditor(key: `coreSlashblock-editor`): TypeofimportedSelectors = js.native
}

