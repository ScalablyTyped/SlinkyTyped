package typingsSlinky.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  def atEnd(): Boolean = js.native
  def close(): Unit = js.native
  def flush(): Unit = js.native
  def read(): String = js.native
  def readLine(): String = js.native
  def seek(position: Double): Unit = js.native
  def write(data: String): Unit = js.native
  def writeLine(data: String): Unit = js.native
}

object Stream {
  @scala.inline
  def apply(
    atEnd: () => Boolean,
    close: () => Unit,
    flush: () => Unit,
    read: () => String,
    readLine: () => String,
    seek: Double => Unit,
    write: String => Unit,
    writeLine: String => Unit
  ): Stream = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), read = js.Any.fromFunction0(read), readLine = js.Any.fromFunction0(readLine), seek = js.Any.fromFunction1(seek), write = js.Any.fromFunction1(write), writeLine = js.Any.fromFunction1(writeLine))
    __obj.asInstanceOf[Stream]
  }
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtEnd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRead(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadLine(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeek(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteLine(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeLine")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

