package typingsSlinky.wordpressNux.mod

import typingsSlinky.wordpressNux.TypeofimportedActions
import typingsSlinky.wordpressNux.TypeofimportedSelectors
import typingsSlinky.wordpressNux.wordpressNuxStrings.coreSlashnux
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_corenux(key: coreSlashnux): TypeofimportedActions = js.native
  @JSName("select")
  def select_corenux(key: coreSlashnux): TypeofimportedSelectors = js.native
}

