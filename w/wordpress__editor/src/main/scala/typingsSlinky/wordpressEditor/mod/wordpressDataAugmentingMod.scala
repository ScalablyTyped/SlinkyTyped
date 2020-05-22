package typingsSlinky.wordpressEditor.mod

import typingsSlinky.wordpressEditor.anon.TypeofimportedActions
import typingsSlinky.wordpressEditor.anon.TypeofimportedSelectors
import typingsSlinky.wordpressEditor.wordpressEditorStrings.coreSlasheditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_coreeditor(key: coreSlasheditor): TypeofimportedActions = js.native
  @JSName("select")
  def select_coreeditor(key: coreSlasheditor): TypeofimportedSelectors = js.native
}

