package typingsSlinky.snabbdom

import typingsSlinky.snabbdom.anon.PartialModule
import typingsSlinky.snabbdom.attributesMod.global.Element
import typingsSlinky.snabbdom.hMod.VNodeChildren
import typingsSlinky.snabbdom.htmldomapiMod.DOMAPI
import typingsSlinky.snabbdom.thunkMod.ThunkFn
import typingsSlinky.snabbdom.vnodeMod.VNodeData
import typingsSlinky.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val thunk: ThunkFn = js.native
  def h(sel: String): VNode_ = js.native
  def h(sel: String, children: VNodeChildren): VNode_ = js.native
  def h(sel: String, data: VNodeData): VNode_ = js.native
  def h(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = js.native
  def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ Element | VNode_, /* vnode */ VNode_, VNode_] = js.native
  def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ Element | VNode_, /* vnode */ VNode_, VNode_] = js.native
}

