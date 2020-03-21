package typingsSlinky.uws.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UwsHttp extends js.Object {
  def createServer(): typingsSlinky.node.httpMod.Server = js.native
  def createServer(requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]): typingsSlinky.node.httpMod.Server = js.native
  // any to avoid express definitions
  def getExpressApp(express: js.Any): js.Any = js.native
  def getRequestPrototype(): IncomingMessage = js.native
  def getResponsePrototype(): ServerResponse = js.native
}

