package typingsSlinky.virtualDom

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.virtualDom.VirtualDOM.VNode
import typingsSlinky.virtualDom.VirtualDOM.VNodeConstructor
import typingsSlinky.virtualDom.VirtualDOM.VProperties
import typingsSlinky.virtualDom.VirtualDOM.VTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vnodeMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
  @js.native
  class ^ protected () extends VNode {
    def this(tagName: String, properties: VProperties, children: js.Array[VTree]) = this()
    def this(tagName: String, properties: VProperties, children: js.Array[VTree], key: String) = this()
    def this(
      tagName: String,
      properties: VProperties,
      children: js.Array[VTree],
      key: js.UndefOr[scala.Nothing],
      namespace: String
    ) = this()
    def this(
      tagName: String,
      properties: VProperties,
      children: js.Array[VTree],
      key: String,
      namespace: String
    ) = this()
  }
  @JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
  @js.native
  val ^ : VNodeConstructor = js.native
  
  type _To = VNodeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `vnodeMod.foo` */
  override def _to: VNodeConstructor = ^
}
