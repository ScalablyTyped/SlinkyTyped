package typingsSlinky.virtualDom

import typingsSlinky.virtualDom.VirtualDOM.VPatch
import typingsSlinky.virtualDom.VirtualDOM.VTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("virtual-dom/diff", JSImport.Namespace)
@js.native
object diffMod extends js.Object {
  
  def apply(left: VTree, right: VTree): js.Array[VPatch] = js.native
}
