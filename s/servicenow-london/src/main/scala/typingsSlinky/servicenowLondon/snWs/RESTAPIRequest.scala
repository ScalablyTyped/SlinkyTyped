package typingsSlinky.servicenowLondon.snWs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RESTAPIRequest extends js.Object {
  val body: RESTAPIRequestBody = js.native
  val headers: StringDictionary[String] = js.native
  val pathParams: StringDictionary[String] = js.native
  val queryParams: StringDictionary[js.Array[String]] = js.native
  val queryString: String = js.native
  val uri: String = js.native
  val url: String = js.native
  def getHeader(header: String): String = js.native
  def getSupportedResponseContentTypes(): js.Array[String] = js.native
}

object RESTAPIRequest {
  @scala.inline
  def apply(
    body: RESTAPIRequestBody,
    getHeader: String => String,
    getSupportedResponseContentTypes: () => js.Array[String],
    headers: StringDictionary[String],
    pathParams: StringDictionary[String],
    queryParams: StringDictionary[js.Array[String]],
    queryString: String,
    uri: String,
    url: String
  ): RESTAPIRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getSupportedResponseContentTypes = js.Any.fromFunction0(getSupportedResponseContentTypes), headers = headers.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RESTAPIRequest]
  }
  @scala.inline
  implicit class RESTAPIRequestOps[Self <: RESTAPIRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: RESTAPIRequestBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHeader(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSupportedResponseContentTypes(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedResponseContentTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryParams(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

