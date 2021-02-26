package typingsSlinky.typedRestClient

import typingsSlinky.node.Buffer
import typingsSlinky.typedRestClient.interfacesMod.IHttpClientResponse
import typingsSlinky.typedRestClient.interfacesMod.IRequestQueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("typed-rest-client/Util", "decompressGzippedContent")
  @js.native
  def decompressGzippedContent(buffer: Buffer): js.Promise[String] = js.native
  @JSImport("typed-rest-client/Util", "decompressGzippedContent")
  @js.native
  def decompressGzippedContent(buffer: Buffer, charset: String): js.Promise[String] = js.native
  
  @JSImport("typed-rest-client/Util", "getUrl")
  @js.native
  def getUrl(resource: String): String = js.native
  @JSImport("typed-rest-client/Util", "getUrl")
  @js.native
  def getUrl(resource: String, baseUrl: js.UndefOr[scala.Nothing], queryParams: IRequestQueryParams): String = js.native
  @JSImport("typed-rest-client/Util", "getUrl")
  @js.native
  def getUrl(resource: String, baseUrl: String): String = js.native
  @JSImport("typed-rest-client/Util", "getUrl")
  @js.native
  def getUrl(resource: String, baseUrl: String, queryParams: IRequestQueryParams): String = js.native
  
  @JSImport("typed-rest-client/Util", "obtainContentCharset")
  @js.native
  def obtainContentCharset(response: IHttpClientResponse): String = js.native
}
