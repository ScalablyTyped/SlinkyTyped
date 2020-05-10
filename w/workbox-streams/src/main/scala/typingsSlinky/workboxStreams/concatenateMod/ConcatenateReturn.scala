package typingsSlinky.workboxStreams.concatenateMod

import org.scalajs.dom.experimental.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatenateReturn extends js.Object {
  var done: js.Promise[Unit] = js.native
  var stream: ReadableStream[_] = js.native
}

object ConcatenateReturn {
  @scala.inline
  def apply(done: js.Promise[Unit], stream: ReadableStream[_]): ConcatenateReturn = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatenateReturn]
  }
  @scala.inline
  implicit class ConcatenateReturnOps[Self <: ConcatenateReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream(value: ReadableStream[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

