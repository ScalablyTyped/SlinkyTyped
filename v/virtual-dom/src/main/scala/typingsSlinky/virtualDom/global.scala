package typingsSlinky.virtualDom

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.virtualDom.VirtualDOM.Thunk
import typingsSlinky.virtualDom.VirtualDOM.VChild
import typingsSlinky.virtualDom.VirtualDOM.VNode
import typingsSlinky.virtualDom.VirtualDOM.VPatch
import typingsSlinky.virtualDom.VirtualDOM.VPatchOptions
import typingsSlinky.virtualDom.VirtualDOM.VText
import typingsSlinky.virtualDom.VirtualDOM.VTree
import typingsSlinky.virtualDom.VirtualDOM.Widget
import typingsSlinky.virtualDom.VirtualDOM.createProperties
import typingsSlinky.virtualDom.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object VirtualDOM extends js.Object {
    
    def create(vnode: Thunk): Element = js.native
    def create(vnode: Thunk, opts: Document): Element = js.native
    def create(vnode: VNode): Element = js.native
    def create(vnode: VNode, opts: Document): Element = js.native
    /**
      create() calls either document.createElement() or document.createElementNS(),
      for which the common denominator is Element (not HTMLElement).
      */
    def create(vnode: VText): Text = js.native
    def create(vnode: VText, opts: Document): Text = js.native
    def create(vnode: Widget): Element = js.native
    def create(vnode: Widget, opts: Document): Element = js.native
    
    def diff(left: VTree, right: VTree): js.Array[VPatch] = js.native
    
    def h(tagName: String, children: String): VNode = js.native
    def h(tagName: String, children: js.Array[VChild]): VNode = js.native
    def h(tagName: String, properties: createProperties, children: String): VNode = js.native
    def h(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = js.native
    
    def isThunk(vTree: VTree): /* is virtual-dom.VirtualDOM.Thunk */ Boolean = js.native
    
    def isVNode(vTree: VTree): /* is virtual-dom.VirtualDOM.VNode */ Boolean = js.native
    
    def isVText(vTree: VTree): /* is virtual-dom.VirtualDOM.VText */ Boolean = js.native
    
    def isWidget(vTree: VTree): /* is virtual-dom.VirtualDOM.Widget */ Boolean = js.native
    
    /**
      patch() usually just returns rootNode after doing stuff to it, so we want
      to preserve that type (though it will usually be just Element).
      */
    def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch]): T = js.native
    def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch], renderOptions: VPatchOptions[T]): T = js.native
  }
}
