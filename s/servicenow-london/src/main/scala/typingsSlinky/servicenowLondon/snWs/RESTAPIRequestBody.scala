package typingsSlinky.servicenowLondon.snWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RESTAPIRequestBody extends js.Object {
  val data: js.Any = js.native
  val dataStream: js.Object = js.native
  val dataString: String = js.native
  def hasNext(): Boolean = js.native
  def nextEntry(): js.Any = js.native
}

object RESTAPIRequestBody {
  @scala.inline
  def apply(
    data: js.Any,
    dataStream: js.Object,
    dataString: String,
    hasNext: () => Boolean,
    nextEntry: () => js.Any
  ): RESTAPIRequestBody = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataStream = dataStream.asInstanceOf[js.Any], dataString = dataString.asInstanceOf[js.Any], hasNext = js.Any.fromFunction0(hasNext), nextEntry = js.Any.fromFunction0(nextEntry))
    __obj.asInstanceOf[RESTAPIRequestBody]
  }
  @scala.inline
  implicit class RESTAPIRequestBodyOps[Self <: RESTAPIRequestBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataStream(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNext(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextEntry(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEntry")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

