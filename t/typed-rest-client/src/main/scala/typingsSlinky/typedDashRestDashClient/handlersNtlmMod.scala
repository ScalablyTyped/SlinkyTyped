package typingsSlinky.typedDashRestDashClient

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.typedDashRestDashClient.interfacesMod.IHttpClient
import typingsSlinky.typedDashRestDashClient.interfacesMod.IHttpClientResponse
import typingsSlinky.typedDashRestDashClient.interfacesMod.IRequestHandler
import typingsSlinky.typedDashRestDashClient.interfacesMod.IRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/ntlm", JSImport.Namespace)
@js.native
object handlersNtlmMod extends js.Object {
  @js.native
  class NtlmCredentialHandler protected () extends IRequestHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
    var _ntlmOptions: js.Any = js.native
    var handleAuthenticationPrivate: js.Any = js.native
    var sendType1Message: js.Any = js.native
    var sendType3Message: js.Any = js.native
    /* CompleteClass */
    override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    /* CompleteClass */
    override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
    /* CompleteClass */
    override def prepareRequest(options: RequestOptions): Unit = js.native
  }
  
}

