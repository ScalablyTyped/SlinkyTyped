package typingsSlinky.virtualDashDom

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.virtualDashDom.VirtualDOM.Thunk
import typingsSlinky.virtualDashDom.VirtualDOM.VNode
import typingsSlinky.virtualDashDom.VirtualDOM.VText
import typingsSlinky.virtualDashDom.VirtualDOM.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/create-element", JSImport.Namespace)
@js.native
object createDashElementMod extends js.Object {
  def apply(vnode: Thunk): Element = js.native
  def apply(vnode: Thunk, opts: Anon_Document): Element = js.native
  def apply(vnode: VNode): Element = js.native
  def apply(vnode: VNode, opts: Anon_Document): Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  def apply(vnode: VText): Text = js.native
  def apply(vnode: VText, opts: Anon_Document): Text = js.native
  def apply(vnode: Widget): Element = js.native
  def apply(vnode: Widget, opts: Anon_Document): Element = js.native
}

