package typingsSlinky.watchify.mod

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.watchify.watchifyStrings.bytes
import typingsSlinky.watchify.watchifyStrings.log
import typingsSlinky.watchify.watchifyStrings.time
import typingsSlinky.watchify.watchifyStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("browserify", JSImport.Namespace)
@js.native
object browserifyAugmentingMod extends js.Object {
  
  @js.native
  trait BrowserifyObject extends EventEmitter {
    
    /**
      * When a bundle is generated, this event fires with the number of bytes
      */
    @JSName("on")
    def on_bytes(event: bytes, listener: js.Function1[/* bytes */ Double, _]): this.type = js.native
    /**
      * This event fires after a bundle was created with messages of the form:
      * ```text
      * X bytes written (Y seconds)
      * ```
      * with the number of bytes in the bundle X and the time in seconds Y.
      */
    @JSName("on")
    def on_log(event: log, listener: js.Function1[/* msg */ String, _]): this.type = js.native
    /**
      * When a bundle is generated, this event fires with the time it took to create the bundle in milliseconds.
      */
    @JSName("on")
    def on_time(event: time, listener: js.Function1[/* time */ Double, _]): this.type = js.native
    /**
      * When the bundle changes, emit the array of bundle ids that changed.
      */
    @JSName("on")
    def on_update(event: update, listener: js.Function1[/* ids */ js.Array[String], _]): this.type = js.native
  }
}
