package typingsSlinky.wordpressBlocks.mod

import typingsSlinky.wordpressBlocks.anon.TypeofimportedActions
import typingsSlinky.wordpressBlocks.anon.TypeofimportedSelectors
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.coreSlashblocks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_coreblocks(key: coreSlashblocks): TypeofimportedActions = js.native
  @JSName("select")
  def select_coreblocks(key: coreSlashblocks): TypeofimportedSelectors = js.native
}

