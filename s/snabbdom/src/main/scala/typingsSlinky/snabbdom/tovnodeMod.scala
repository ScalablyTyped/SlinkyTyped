package typingsSlinky.snabbdom

import org.scalajs.dom.raw.Node
import typingsSlinky.snabbdom.htmldomapiMod.DOMAPI
import typingsSlinky.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snabbdom/build/package/tovnode", JSImport.Namespace)
@js.native
object tovnodeMod extends js.Object {
  
  def toVNode(node: Node): VNode_ = js.native
  def toVNode(node: Node, domApi: DOMAPI): VNode_ = js.native
}
