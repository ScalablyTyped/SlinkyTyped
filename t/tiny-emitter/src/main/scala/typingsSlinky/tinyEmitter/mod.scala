package typingsSlinky.tinyEmitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-emitter", "TinyEmitter")
  @js.native
  class TinyEmitter () extends StObject {
    
    def emit(event: String, args: js.Any*): this.type = js.native
    
    def off(event: String): this.type = js.native
    def off(event: String, callback: js.Function): this.type = js.native
    
    def on(event: String, callback: js.Function): this.type = js.native
    def on(event: String, callback: js.Function, ctx: js.Any): this.type = js.native
    
    def once(event: String, callback: js.Function): this.type = js.native
    def once(event: String, callback: js.Function, ctx: js.Any): this.type = js.native
  }
}
