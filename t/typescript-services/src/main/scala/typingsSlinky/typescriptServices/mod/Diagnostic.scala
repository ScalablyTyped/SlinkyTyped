package typingsSlinky.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Diagnostic")
@js.native
class Diagnostic protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Diagnostic {
  def this(
    fileName: String,
    lineMap: typingsSlinky.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String
  ) = this()
  def this(
    fileName: String,
    lineMap: typingsSlinky.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ) = this()
  def this(
    fileName: String,
    lineMap: typingsSlinky.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.UndefOr[scala.Nothing],
    additionalLocations: js.Array[typingsSlinky.typescriptServices.TypeScript.Location]
  ) = this()
  def this(
    fileName: String,
    lineMap: typingsSlinky.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typingsSlinky.typescriptServices.TypeScript.Location]
  ) = this()
}
object Diagnostic {
  
  /* static member */
  @JSImport("typescript-services", "Diagnostic.equals")
  @js.native
  def equals_(
    diagnostic1: typingsSlinky.typescriptServices.TypeScript.Diagnostic,
    diagnostic2: typingsSlinky.typescriptServices.TypeScript.Diagnostic
  ): Boolean = js.native
}
