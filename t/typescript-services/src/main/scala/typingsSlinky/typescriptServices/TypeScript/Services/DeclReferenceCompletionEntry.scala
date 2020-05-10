package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.PullDecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.DeclReferenceCompletionEntry")
@js.native
class DeclReferenceCompletionEntry protected () extends CachedCompletionEntryDetails {
  def this(name: String, kind: String, kindModifiers: String, decl: PullDecl) = this()
  var decl: PullDecl = js.native
  var hasBeenResolved: js.Any = js.native
  def resolve(`type`: String, fullSymbolName: String, docComments: String): Unit = js.native
}

