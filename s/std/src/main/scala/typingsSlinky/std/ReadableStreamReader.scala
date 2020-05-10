package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamReader[R] extends js.Object {
  def cancel(): js.Promise[Unit] = js.native
  def read(): js.Promise[ReadableStreamReadResult[R]] = js.native
  def releaseLock(): Unit = js.native
}

@JSGlobal("ReadableStreamReader")
@js.native
object ReadableStreamReader
  extends Instantiable0[org.scalajs.dom.experimental.ReadableStreamReader[js.Any]]

