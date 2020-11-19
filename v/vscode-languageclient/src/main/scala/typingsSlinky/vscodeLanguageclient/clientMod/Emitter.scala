package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeJsonrpc.eventsMod.EmitterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "Emitter")
@js.native
class Emitter[T] ()
  extends typingsSlinky.vscodeLanguageserverProtocol.mod.Emitter[T] {
  def this(_options: EmitterOptions) = this()
}
/* static members */
@JSImport("vscode-languageclient/lib/client", "Emitter")
@js.native
object Emitter extends js.Object {
  
  var _noop: js.Any = js.native
}
