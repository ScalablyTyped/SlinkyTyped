package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typingsSlinky.typescriptDashServices.FormattingOptions
import typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptDashServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Formatter")
@js.native
class Formatter protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Formatter {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    indentFirstToken: Boolean,
    options: FormattingOptions,
    snapshot: ITextSnapshot,
    rulesProvider: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.FormattingRequestKind
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Services.Formatting.Formatter")
@js.native
object Formatter extends js.Object {
  def getEdits(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    options: FormattingOptions,
    indentFirstToken: Boolean,
    snapshot: ITextSnapshot,
    rulesProvider: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.FormattingRequestKind
  ): js.Array[typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
}

