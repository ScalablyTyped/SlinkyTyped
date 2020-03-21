package typingsSlinky.thrift.mod

import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createServer")
@js.native
object createServer extends js.Object {
  def apply[TProcessor, THandler](processor: TProcessorConstructor[TProcessor, THandler], handler: THandler): Server | typingsSlinky.node.tlsMod.Server = js.native
  def apply[TProcessor, THandler](
    processor: TProcessorConstructor[TProcessor, THandler],
    handler: THandler,
    options: ServerOptions[TProcessor, THandler]
  ): Server | typingsSlinky.node.tlsMod.Server = js.native
}

