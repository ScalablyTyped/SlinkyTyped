package typingsSlinky.virtualDom

import typingsSlinky.virtualDom.VirtualDOM.VChild
import typingsSlinky.virtualDom.VirtualDOM.VNode
import typingsSlinky.virtualDom.VirtualDOM.createProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hMod {
  
  @JSImport("virtual-dom/h", JSImport.Namespace)
  @js.native
  def apply(tagName: String, children: String): VNode = js.native
  @JSImport("virtual-dom/h", JSImport.Namespace)
  @js.native
  def apply(tagName: String, children: js.Array[VChild]): VNode = js.native
  @JSImport("virtual-dom/h", JSImport.Namespace)
  @js.native
  def apply(tagName: String, properties: createProperties, children: String): VNode = js.native
  @JSImport("virtual-dom/h", JSImport.Namespace)
  @js.native
  def apply(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = js.native
}
