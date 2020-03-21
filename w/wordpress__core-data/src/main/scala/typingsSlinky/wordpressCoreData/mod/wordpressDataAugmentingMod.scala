package typingsSlinky.wordpressCoreData.mod

import typingsSlinky.wordpressCoreData.TypeofimportedActions
import typingsSlinky.wordpressCoreData.TypeofimportedSelectors
import typingsSlinky.wordpressCoreData.wordpressCoreDataStrings.core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_core(key: core): TypeofimportedActions = js.native
  @JSName("select")
  def select_core(key: core): TypeofimportedSelectors = js.native
}

