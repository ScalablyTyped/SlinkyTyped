package typingsSlinky.stylableRuntime

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.stylableRuntime.typesMod.NodeRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/runtime/cjs/keyed-list-renderer", JSImport.Namespace)
@js.native
object keyedListRendererMod extends js.Object {
  
  def createDOMListRenderer[I, O /* <: Element */, C /* <: Element */](nodeRenderer: NodeRenderer[I, O]): DOMListRenderer[I, O, C] = js.native
  
  @js.native
  trait DOMListRenderer[I, O /* <: Element */, C /* <: Element */] extends js.Object {
    
    var nodes: StringDictionary[O] = js.native
    
    def render(container: C): Unit = js.native
    def render(container: C, data: js.Array[I]): Unit = js.native
  }
}
