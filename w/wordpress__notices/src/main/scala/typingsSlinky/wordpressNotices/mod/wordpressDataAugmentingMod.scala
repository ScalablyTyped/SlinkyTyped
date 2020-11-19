package typingsSlinky.wordpressNotices.mod

import typingsSlinky.wordpressNotices.anon.TypeofimportedActions
import typingsSlinky.wordpressNotices.anon.TypeofimportedSelectors
import typingsSlinky.wordpressNotices.wordpressNoticesStrings.coreSlashnotices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  
  @JSName("dispatch")
  def dispatch_corenotices(key: coreSlashnotices): TypeofimportedActions = js.native
  
  @JSName("select")
  def select_corenotices(key: coreSlashnotices): TypeofimportedSelectors = js.native
}
