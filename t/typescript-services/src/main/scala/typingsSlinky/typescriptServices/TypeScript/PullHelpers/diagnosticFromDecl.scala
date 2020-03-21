package typingsSlinky.typescriptServices.TypeScript.PullHelpers

import typingsSlinky.typescriptServices.TypeScript.Diagnostic
import typingsSlinky.typescriptServices.TypeScript.Location
import typingsSlinky.typescriptServices.TypeScript.PullDecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
@js.native
object diagnosticFromDecl extends js.Object {
  def apply(decl: PullDecl, diagnosticKey: String): Diagnostic = js.native
  def apply(decl: PullDecl, diagnosticKey: String, _arguments: js.Array[_]): Diagnostic = js.native
  def apply(
    decl: PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[Location]
  ): Diagnostic = js.native
}

