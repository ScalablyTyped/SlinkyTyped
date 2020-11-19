package typingsSlinky.thenEos

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("then-eos", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(stream: Stream): js.Promise[Unit] = js.native
  
  type Stream = ReadableStream | WritableStream
}
