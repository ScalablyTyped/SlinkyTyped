package typingsSlinky.tinyEmitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tiny-emitter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class TinyEmitter () extends js.Object {
    
    def emit(event: String, args: js.Any*): this.type = js.native
    
    def off(event: String): this.type = js.native
    def off(event: String, callback: js.Function): this.type = js.native
    
    def on(event: String, callback: js.Function): this.type = js.native
    def on(event: String, callback: js.Function, ctx: js.Any): this.type = js.native
    
    def once(event: String, callback: js.Function): this.type = js.native
    def once(event: String, callback: js.Function, ctx: js.Any): this.type = js.native
  }
}
