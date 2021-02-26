package typingsSlinky.virtualDom

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.virtualDom.VirtualDOM.Thunk
import typingsSlinky.virtualDom.VirtualDOM.VNode
import typingsSlinky.virtualDom.VirtualDOM.VText
import typingsSlinky.virtualDom.VirtualDOM.Widget
import typingsSlinky.virtualDom.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createElementMod {
  
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: Thunk): Element = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: Thunk, opts: Document): Element = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: VNode): Element = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: VNode, opts: Document): Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: VText): Text = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: VText, opts: Document): Text = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: Widget): Element = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: Widget, opts: Document): Element = js.native
}
