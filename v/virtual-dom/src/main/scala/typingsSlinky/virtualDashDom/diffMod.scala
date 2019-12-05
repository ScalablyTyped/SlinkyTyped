package typingsSlinky.virtualDashDom

import typingsSlinky.virtualDashDom.VirtualDOM.VPatch
import typingsSlinky.virtualDashDom.VirtualDOM.VTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/diff", JSImport.Namespace)
@js.native
object diffMod extends js.Object {
  def apply(left: VTree, right: VTree): js.Array[VPatch] = js.native
}

