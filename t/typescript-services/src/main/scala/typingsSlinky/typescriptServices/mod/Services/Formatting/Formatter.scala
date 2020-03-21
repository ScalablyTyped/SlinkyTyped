package typingsSlinky.typescriptServices.mod.Services.Formatting

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Formatter")
@js.native
class Formatter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Formatter {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    indentFirstToken: Boolean,
    options: FormattingOptions,
    snapshot: ITextSnapshot,
    rulesProvider: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
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
    rulesProvider: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
}

