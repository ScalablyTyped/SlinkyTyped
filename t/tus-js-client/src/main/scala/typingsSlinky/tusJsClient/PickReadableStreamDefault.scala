package typingsSlinky.tusJsClient

import typingsSlinky.std.ReadableStreamReadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.ReadableStreamDefaultReader<any>, 'read'> */
@js.native
trait PickReadableStreamDefault extends js.Object {
  @JSName("read")
  var read_Original: js.Function0[js.Promise[ReadableStreamReadResult[_]]] = js.native
  def read(): js.Promise[ReadableStreamReadResult[_]] = js.native
}

