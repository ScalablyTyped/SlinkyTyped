package typingsSlinky.thrift.thriftMod

import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createWebServer")
@js.native
object createWebServer extends js.Object {
  def apply[TProcessor, THandler](options: WebServerOptions[TProcessor, THandler]): Server | typingsSlinky.node.tlsMod.Server = js.native
}

