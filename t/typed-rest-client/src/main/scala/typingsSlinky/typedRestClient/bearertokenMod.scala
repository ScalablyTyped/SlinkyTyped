package typingsSlinky.typedRestClient

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.typedRestClient.interfacesMod.IHttpClient
import typingsSlinky.typedRestClient.interfacesMod.IHttpClientResponse
import typingsSlinky.typedRestClient.interfacesMod.IRequestHandler
import typingsSlinky.typedRestClient.interfacesMod.IRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/bearertoken", JSImport.Namespace)
@js.native
object bearertokenMod extends js.Object {
  @js.native
  class BearerCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    var token: String = js.native
    /* CompleteClass */
    override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    /* CompleteClass */
    override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
    def prepareRequest(options: js.Any): Unit = js.native
    /* CompleteClass */
    override def prepareRequest(options: RequestOptions): Unit = js.native
  }
  
}

