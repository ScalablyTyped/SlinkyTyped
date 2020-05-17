package typingsSlinky.snabbdom.hMod

import typingsSlinky.snabbdom.vnodeMod.VNodeData
import typingsSlinky.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/h", "h")
@js.native
object h extends js.Object {
  def apply(sel: String): VNode_ = js.native
  def apply(sel: String, children: VNodeChildren): VNode_ = js.native
  def apply(sel: String, data: VNodeData): VNode_ = js.native
  def apply(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = js.native
}

