package typingsSlinky.servicenowLondon.snWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RESTAPIResponseStream extends js.Object {
  def writeStream(stream: js.Object): Unit = js.native
  def writeString(data: String): Unit = js.native
}

object RESTAPIResponseStream {
  @scala.inline
  def apply(writeStream: js.Object => Unit, writeString: String => Unit): RESTAPIResponseStream = {
    val __obj = js.Dynamic.literal(writeStream = js.Any.fromFunction1(writeStream), writeString = js.Any.fromFunction1(writeString))
    __obj.asInstanceOf[RESTAPIResponseStream]
  }
  @scala.inline
  implicit class RESTAPIResponseStreamOps[Self <: RESTAPIResponseStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWriteStream(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStream")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

