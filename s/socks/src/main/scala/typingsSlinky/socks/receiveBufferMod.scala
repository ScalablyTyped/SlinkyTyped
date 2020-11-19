package typingsSlinky.socks

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socks/typings/common/receiveBuffer", JSImport.Namespace)
@js.native
object receiveBufferMod extends js.Object {
  
  @js.native
  class ReceiveBuffer () extends js.Object {
    def this(size: Double) = this()
    
    var _buffer: js.Any = js.native
    
    var _offset: js.Any = js.native
    
    var _originalSize: js.Any = js.native
    
    def append(data: Buffer): Double = js.native
    
    def get(length: Double): Buffer = js.native
    
    def length: Double = js.native
    
    def peek(length: Double): Buffer = js.native
  }
}
