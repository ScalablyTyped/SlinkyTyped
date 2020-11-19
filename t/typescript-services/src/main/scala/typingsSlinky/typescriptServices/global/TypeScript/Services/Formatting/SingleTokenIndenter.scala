package typingsSlinky.typescriptServices.global.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
@js.native
class SingleTokenIndenter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.SingleTokenIndenter {
  def this(
    indentationPosition: Double,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
@js.native
object SingleTokenIndenter extends js.Object {
  
  def getIndentationAmount(
    position: Double,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    options: FormattingOptions
  ): Double = js.native
}
