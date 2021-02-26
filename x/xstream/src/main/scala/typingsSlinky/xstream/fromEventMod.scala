package typingsSlinky.xstream

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.xstream.mod.InternalProducer
import typingsSlinky.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventMod {
  
  @JSImport("xstream/extra/fromEvent", JSImport.Default)
  @js.native
  def default[T /* <: Event */](element: EventTarget, eventName: String): Stream[T] = js.native
  @JSImport("xstream/extra/fromEvent", JSImport.Default)
  @js.native
  def default[T /* <: Event */](element: EventTarget, eventName: String, useCapture: Boolean): Stream[T] = js.native
  @JSImport("xstream/extra/fromEvent", JSImport.Default)
  @js.native
  def default[T](element: EventEmitter, eventName: String): Stream[T] = js.native
  
  @JSImport("xstream/extra/fromEvent", "DOMEventProducer")
  @js.native
  class DOMEventProducer protected () extends InternalProducer[Event] {
    def this(node: EventTarget, eventType: String, useCapture: Boolean) = this()
    
    var eventType: js.Any = js.native
    
    var listener: js.Any = js.native
    
    var node: js.Any = js.native
    
    var `type`: String = js.native
    
    var useCapture: js.Any = js.native
  }
  
  @JSImport("xstream/extra/fromEvent", "NodeEventProducer")
  @js.native
  class NodeEventProducer protected ()
    extends InternalProducer[js.Any] {
    def this(node: EventEmitter, eventName: String) = this()
    
    var eventName: js.Any = js.native
    
    var listener: js.Any = js.native
    
    var node: js.Any = js.native
    
    var `type`: String = js.native
  }
}
