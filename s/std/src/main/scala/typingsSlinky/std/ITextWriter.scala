package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextWriter extends js.Object {
  def Close(): Unit = js.native
  def Write(s: java.lang.String): Unit = js.native
  def WriteLine(s: java.lang.String): Unit = js.native
}

object ITextWriter {
  @scala.inline
  def apply(Close: () => Unit, Write: java.lang.String => Unit, WriteLine: java.lang.String => Unit): ITextWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Write = js.Any.fromFunction1(Write), WriteLine = js.Any.fromFunction1(WriteLine))
    __obj.asInstanceOf[ITextWriter]
  }
  @scala.inline
  implicit class ITextWriterOps[Self <: ITextWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrite(value: java.lang.String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteLine(value: java.lang.String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteLine")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

