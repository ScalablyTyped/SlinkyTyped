package typingsSlinky.syncRequest

import typingsSlinky.httpBasic.httpVerbMod.HttpVerb
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.syncRequest.optionsMod.Options
import typingsSlinky.thenRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sync-request", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(method: HttpVerb, url: String): Response = js.native
  def default(method: HttpVerb, url: String, options: Options): Response = js.native
  def default(method: HttpVerb, url: URL_): Response = js.native
  def default(method: HttpVerb, url: URL_, options: Options): Response = js.native
  
  @js.native
  class FormData ()
    extends typingsSlinky.syncRequest.formDataMod.FormData
}
