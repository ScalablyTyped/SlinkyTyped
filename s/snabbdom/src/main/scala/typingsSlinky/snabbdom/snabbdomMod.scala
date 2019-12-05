package typingsSlinky.snabbdom

import typingsSlinky.snabbdom.hMod.VNodeChildren
import typingsSlinky.snabbdom.htmldomapiMod.DOMAPI
import typingsSlinky.snabbdom.modulesAttributesMod._Global_.Element
import typingsSlinky.snabbdom.modulesModuleMod.Module
import typingsSlinky.snabbdom.thunkMod.ThunkFn
import typingsSlinky.snabbdom.vnodeMod.VNode
import typingsSlinky.snabbdom.vnodeMod.VNodeData
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom", JSImport.Namespace)
@js.native
object snabbdomMod extends js.Object {
  val thunk: ThunkFn = js.native
  def h(sel: String): VNode = js.native
  def h(sel: String, children: VNodeChildren): VNode = js.native
  def h(sel: String, data: VNodeData): VNode = js.native
  def h(sel: String, data: VNodeData, children: VNodeChildren): VNode = js.native
  def init(modules: js.Array[Partial[Module]]): js.Function2[/* oldVnode */ Element | VNode, /* vnode */ VNode, VNode] = js.native
  def init(modules: js.Array[Partial[Module]], domApi: DOMAPI): js.Function2[/* oldVnode */ Element | VNode, /* vnode */ VNode, VNode] = js.native
}

