package typingsSlinky.serverless

import typingsSlinky.serverless.anon.Authorizer
import typingsSlinky.serverless.anon.Http
import typingsSlinky.serverless.anon.Method
import typingsSlinky.serverless.anon.MethodString
import typingsSlinky.serverless.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("serverless/plugins/aws/package/compile/events/apiGateway/lib/validate", "getHttp")
  @js.native
  def getHttp[T /* <: js.Object */](event: Http[T], functionName: String): Method | T = js.native
  
  @JSImport("serverless/plugins/aws/package/compile/events/apiGateway/lib/validate", "getHttpMethod")
  @js.native
  def getHttpMethod(http: MethodString, functionName: String): HttpMethod = js.native
  
  @JSImport("serverless/plugins/aws/package/compile/events/apiGateway/lib/validate", "getHttpPath")
  @js.native
  def getHttpPath(http: Path, functionName: String): String = js.native
  
  @js.native
  trait ApiGatewayEvent extends StObject {
    
    var http: String | Authorizer = js.native
  }
  object ApiGatewayEvent {
    
    @scala.inline
    def apply(http: String | Authorizer): ApiGatewayEvent = {
      val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiGatewayEvent]
    }
    
    @scala.inline
    implicit class ApiGatewayEventMutableBuilder[Self <: ApiGatewayEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttp(value: String | Authorizer): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.serverless.serverlessStrings.get
    - typingsSlinky.serverless.serverlessStrings.post
    - typingsSlinky.serverless.serverlessStrings.put
    - typingsSlinky.serverless.serverlessStrings.patch
    - typingsSlinky.serverless.serverlessStrings.options
    - typingsSlinky.serverless.serverlessStrings.head
    - typingsSlinky.serverless.serverlessStrings.delete
    - typingsSlinky.serverless.serverlessStrings.any
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def any: typingsSlinky.serverless.serverlessStrings.any = "any".asInstanceOf[typingsSlinky.serverless.serverlessStrings.any]
    
    @scala.inline
    def delete: typingsSlinky.serverless.serverlessStrings.delete = "delete".asInstanceOf[typingsSlinky.serverless.serverlessStrings.delete]
    
    @scala.inline
    def get: typingsSlinky.serverless.serverlessStrings.get = "get".asInstanceOf[typingsSlinky.serverless.serverlessStrings.get]
    
    @scala.inline
    def head: typingsSlinky.serverless.serverlessStrings.head = "head".asInstanceOf[typingsSlinky.serverless.serverlessStrings.head]
    
    @scala.inline
    def options: typingsSlinky.serverless.serverlessStrings.options = "options".asInstanceOf[typingsSlinky.serverless.serverlessStrings.options]
    
    @scala.inline
    def patch: typingsSlinky.serverless.serverlessStrings.patch = "patch".asInstanceOf[typingsSlinky.serverless.serverlessStrings.patch]
    
    @scala.inline
    def post: typingsSlinky.serverless.serverlessStrings.post = "post".asInstanceOf[typingsSlinky.serverless.serverlessStrings.post]
    
    @scala.inline
    def put: typingsSlinky.serverless.serverlessStrings.put = "put".asInstanceOf[typingsSlinky.serverless.serverlessStrings.put]
  }
}
