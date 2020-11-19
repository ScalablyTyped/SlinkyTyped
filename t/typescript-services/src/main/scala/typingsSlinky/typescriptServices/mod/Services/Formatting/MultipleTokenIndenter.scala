package typingsSlinky.typescriptServices.mod.Services.Formatting

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.Formatting.MultipleTokenIndenter")
@js.native
class MultipleTokenIndenter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.MultipleTokenIndenter {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
}
