package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.ReadableStreamReadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReadableStreamReader")
@js.native
class ReadableStreamReader ()
  extends typingsSlinky.std.ReadableStreamReader[js.Any] {
  /* CompleteClass */
  override def cancel(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def read(): js.Promise[ReadableStreamReadResult[js.Any]] = js.native
  /* CompleteClass */
  override def releaseLock(): Unit = js.native
}

@JSGlobal("ReadableStreamReader")
@js.native
object ReadableStreamReader
  extends Instantiable0[org.scalajs.dom.experimental.ReadableStreamReader[js.Any]]

