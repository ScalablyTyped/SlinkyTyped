package typingsSlinky.tscWatch

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.tscWatch.tscWatchStrings.compile_errors
import typingsSlinky.tscWatch.tscWatchStrings.first_success
import typingsSlinky.tscWatch.tscWatchStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientMod {
  
  @JSImport("tsc-watch/lib/client", JSImport.Namespace)
  @js.native
  class ^ () extends TscWatchClient
  
  @js.native
  trait TscWatchClient extends EventEmitter {
    
    def kill(): Unit = js.native
    
    /**
      * Emitted upon every failing compilation
      */
    @JSName("on")
    def on_compileerrors(event: compile_errors, cb: js.Function0[_]): this.type = js.native
    // tslint:disable:unified-signatures
    /**
      * Emitted upon first successful compilation
      */
    @JSName("on")
    def on_firstsuccess(event: first_success, cb: js.Function0[_]): this.type = js.native
    /**
      * Emitted upon first successful compilation
      */
    @JSName("on")
    def on_success(event: success, cb: js.Function0[_]): this.type = js.native
    
    def start(args: js.Any*): Unit = js.native
  }
}
