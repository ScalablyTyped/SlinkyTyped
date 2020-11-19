package typingsSlinky.tweezerJs.mod

import typingsSlinky.tweezerJs.tweezerJsStrings.done
import typingsSlinky.tweezerJs.tweezerJsStrings.tick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tweezer extends js.Object {
  
  def begin(): this.type = js.native
  
  @JSName("on")
  def on_done(name: done, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_tick(name: tick, handler: js.Function1[/* v */ Double, Unit]): this.type = js.native
  
  def stop(): this.type = js.native
}
