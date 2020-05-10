package typingsSlinky.zapierPlatformCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseHttpResponse extends js.Object {
  var headers: StringDictionary[String] = js.native
  var request: HttpRequestOptions = js.native
  var status: Double = js.native
  def getHeader(key: String): js.UndefOr[String] = js.native
  def throwForStatus(): Unit = js.native
}

object BaseHttpResponse {
  @scala.inline
  def apply(
    getHeader: String => js.UndefOr[String],
    headers: StringDictionary[String],
    request: HttpRequestOptions,
    status: Double,
    throwForStatus: () => Unit
  ): BaseHttpResponse = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
    __obj.asInstanceOf[BaseHttpResponse]
  }
  @scala.inline
  implicit class BaseHttpResponseOps[Self <: BaseHttpResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetHeader(value: String => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: HttpRequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrowForStatus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwForStatus")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

