package typingsSlinky.wreck.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.wreck.wreckStrings.request
import typingsSlinky.wreck.wreckStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WreckEventEmitter extends EventEmitter {
  
  @JSName("on")
  def on_request(event: request, listener: RequestCallback): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: ResponseCallback): this.type = js.native
}
