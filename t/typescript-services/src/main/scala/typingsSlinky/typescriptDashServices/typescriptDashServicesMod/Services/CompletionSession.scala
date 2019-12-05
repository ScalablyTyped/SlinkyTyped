package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services

import typingsSlinky.typescriptDashServices.TypeScript.Services.CachedCompletionEntryDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CompletionSession")
@js.native
class CompletionSession protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Services.CompletionSession {
  def this(
    fileName: String,
    position: Double,
    entries: typingsSlinky.typescriptDashServices.TypeScript.IdentiferNameHashTable[CachedCompletionEntryDetails]
  ) = this()
}

