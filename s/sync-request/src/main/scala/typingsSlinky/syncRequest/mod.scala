package typingsSlinky.syncRequest

import typingsSlinky.httpBasic.httpVerbMod.HttpVerb
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.syncRequest.optionsMod.Options
import typingsSlinky.thenRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sync-request", JSImport.Default)
  @js.native
  def default(method: HttpVerb, url: String): Response = js.native
  @JSImport("sync-request", JSImport.Default)
  @js.native
  def default(method: HttpVerb, url: String, options: Options): Response = js.native
  @JSImport("sync-request", JSImport.Default)
  @js.native
  def default(method: HttpVerb, url: URL_): Response = js.native
  @JSImport("sync-request", JSImport.Default)
  @js.native
  def default(method: HttpVerb, url: URL_, options: Options): Response = js.native
  
  @JSImport("sync-request", "FormData")
  @js.native
  class FormData ()
    extends typingsSlinky.syncRequest.formDataMod.FormData
}
