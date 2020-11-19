package typingsSlinky.urqlCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkError extends js.Object {
  
  var graphQLErrors: js.UndefOr[js.Array[String | PartialGraphQLError | js.Error]] = js.native
  
  var networkError: js.UndefOr[js.Error] = js.native
  
  var response: js.UndefOr[js.Any] = js.native
}
object NetworkError {
  
  @scala.inline
  def apply(): NetworkError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkError]
  }
  
  @scala.inline
  implicit class NetworkErrorOps[Self <: NetworkError] (val x: Self) extends AnyVal {
    
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
    def setGraphQLErrorsVarargs(value: (String | PartialGraphQLError | js.Error)*): Self = this.set("graphQLErrors", js.Array(value :_*))
    
    @scala.inline
    def setGraphQLErrors(value: js.Array[String | PartialGraphQLError | js.Error]): Self = this.set("graphQLErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphQLErrors: Self = this.set("graphQLErrors", js.undefined)
    
    @scala.inline
    def setNetworkError(value: js.Error): Self = this.set("networkError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkError: Self = this.set("networkError", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
