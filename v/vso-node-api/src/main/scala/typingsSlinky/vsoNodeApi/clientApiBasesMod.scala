package typingsSlinky.vsoNodeApi

import typingsSlinky.typedRestClient.httpClientMod.HttpClient
import typingsSlinky.typedRestClient.restClientMod.RestClient
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsSlinky.vsoNodeApi.vsoClientMod.VsoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/ClientApiBases", JSImport.Namespace)
@js.native
object clientApiBasesMod extends js.Object {
  
  @js.native
  class ClientApiBase protected () extends js.Object {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], userAgent: String) = this()
    def this(
      baseUrl: String,
      handlers: js.Array[IRequestHandler],
      userAgent: js.UndefOr[scala.Nothing],
      options: IRequestOptions
    ) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], userAgent: String, options: IRequestOptions) = this()
    
    var baseUrl: String = js.native
    
    def createAcceptHeader(`type`: String): String = js.native
    def createAcceptHeader(`type`: String, apiVersion: String): String = js.native
    
    def createRequestOptions(`type`: String): typingsSlinky.typedRestClient.restClientMod.IRequestOptions = js.native
    def createRequestOptions(`type`: String, apiVersion: String): typingsSlinky.typedRestClient.restClientMod.IRequestOptions = js.native
    
    def formatResponse(data: js.Any, responseTypeMetadata: js.Any, isCollection: Boolean): js.Any = js.native
    
    var http: HttpClient = js.native
    
    var rest: RestClient = js.native
    
    var userAgent: String = js.native
    
    var vsoClient: VsoClient = js.native
  }
}
