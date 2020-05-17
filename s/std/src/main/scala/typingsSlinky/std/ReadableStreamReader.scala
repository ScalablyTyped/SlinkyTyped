package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamReader[R] extends js.Object {
  def cancel(): js.Promise[Unit] = js.native
  def read(): js.Promise[ReadableStreamReadResult[R]] = js.native
  def releaseLock(): Unit = js.native
}

object ReadableStreamReader {
  @scala.inline
  def apply[R](
    cancel: () => js.Promise[Unit],
    read: () => js.Promise[ReadableStreamReadResult[R]],
    releaseLock: () => Unit
  ): ReadableStreamReader[R] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read), releaseLock = js.Any.fromFunction0(releaseLock))
    __obj.asInstanceOf[ReadableStreamReader[R]]
  }
  @scala.inline
  implicit class ReadableStreamReaderOps[Self[r] <: org.scalajs.dom.experimental.ReadableStreamReader[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withCancel(value: () => js.Promise[Unit]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRead(value: () => js.Promise[ReadableStreamReadResult[R]]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReleaseLock(value: () => Unit): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseLock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

