package typingsSlinky.virtualDom

import typingsSlinky.virtualDom.VirtualDOM.VPatch
import typingsSlinky.virtualDom.VirtualDOM.VTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/diff", JSImport.Namespace)
@js.native
object diffMod extends js.Object {
  def apply(left: VTree, right: VTree): js.Array[VPatch] = js.native
}

