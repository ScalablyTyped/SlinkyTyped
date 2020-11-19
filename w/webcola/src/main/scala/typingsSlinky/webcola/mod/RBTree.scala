package typingsSlinky.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "RBTree")
@js.native
class RBTree[T] protected ()
  extends typingsSlinky.webcola.rbtreeMod.RBTree[T] {
  def this(comparator: js.Function2[/* a */ T, /* b */ T, Double]) = this()
}
/* static members */
@JSImport("webcola", "RBTree")
@js.native
object RBTree extends js.Object {
  
  def double_rotate(root: js.Any, dir: js.Any): js.Any = js.native
  
  def is_red(node: js.Any): js.Any = js.native
  
  def single_rotate(root: js.Any, dir: js.Any): js.Any = js.native
}
