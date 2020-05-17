package typingsSlinky.wordpressRichText.mod

import typingsSlinky.wordpressRichText.anon.TypeofimportedActions
import typingsSlinky.wordpressRichText.anon.TypeofimportedSelectors
import typingsSlinky.wordpressRichText.wordpressRichTextStrings.`coreSlashrich-text`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_corerichtext(key: `coreSlashrich-text`): TypeofimportedActions = js.native
  @JSName("select")
  def select_corerichtext(key: `coreSlashrich-text`): TypeofimportedSelectors = js.native
}

