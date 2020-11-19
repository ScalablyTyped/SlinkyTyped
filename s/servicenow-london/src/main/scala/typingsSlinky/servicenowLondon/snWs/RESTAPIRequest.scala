package typingsSlinky.servicenowLondon.snWs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RESTAPIRequest extends js.Object {
  
  val body: RESTAPIRequestBody = js.native
  
  def getHeader(header: String): String = js.native
  
  def getSupportedResponseContentTypes(): js.Array[String] = js.native
  
  val headers: StringDictionary[String] = js.native
  
  val pathParams: StringDictionary[String] = js.native
  
  val queryParams: StringDictionary[js.Array[String]] = js.native
  
  val queryString: String = js.native
  
  val uri: String = js.native
  
  val url: String = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: RESTAPIRequestBody): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHeader(value: String => String): Self = this.set("getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSupportedResponseContentTypes(value: () => js.Array[String]): Self = this.set("getSupportedResponseContentTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathParams(value: StringDictionary[String]): Self = this.set("pathParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParams(value: StringDictionary[js.Array[String]]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
