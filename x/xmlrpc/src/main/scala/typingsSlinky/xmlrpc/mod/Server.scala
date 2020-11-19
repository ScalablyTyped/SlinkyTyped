package typingsSlinky.xmlrpc.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.xmlrpc.xmlrpcStrings.NotFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends EventEmitter {
  
  var httpServer: typingsSlinky.node.httpMod.Server | typingsSlinky.node.httpsMod.Server = js.native
  
  def on(eventName: String, callback: ServerFunction): this.type = js.native
  @JSName("on")
  def on_NotFound(eventName: NotFound, callback: ServerNotFoundFunction): this.type = js.native
}
