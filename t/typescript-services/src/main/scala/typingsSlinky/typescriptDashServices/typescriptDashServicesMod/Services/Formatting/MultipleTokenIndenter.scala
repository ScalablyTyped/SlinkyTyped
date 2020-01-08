package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typingsSlinky.typescriptDashServices.FormattingOptions
import typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptDashServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.MultipleTokenIndenter")
@js.native
class MultipleTokenIndenter protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.MultipleTokenIndenter {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
}

