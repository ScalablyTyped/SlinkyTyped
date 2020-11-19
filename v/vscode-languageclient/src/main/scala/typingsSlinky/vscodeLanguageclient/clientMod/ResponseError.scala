package typingsSlinky.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends typingsSlinky.vscodeLanguageserverProtocol.mod.ResponseError[D] {
  def this(code: Double, message: String) = this()
  def this(code: Double, message: String, data: D) = this()
}
