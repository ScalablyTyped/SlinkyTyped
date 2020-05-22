package typingsSlinky.typescriptServices.mod.Services

import typingsSlinky.typescriptServices.TypeScript.Services.CompletionEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CompletionInfo")
@js.native
class CompletionInfo ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.CompletionInfo {
  /* CompleteClass */
  override var entries: js.Array[CompletionEntry] = js.native
  /* CompleteClass */
  override var isMemberCompletion: Boolean = js.native
  /* CompleteClass */
  override var maybeInaccurate: Boolean = js.native
}

