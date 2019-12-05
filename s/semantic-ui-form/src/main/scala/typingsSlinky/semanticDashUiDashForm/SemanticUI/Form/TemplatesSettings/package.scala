package typingsSlinky.semanticDashUiDashForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TemplatesSettings {
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.error
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.prompt
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, error | prompt]) with (Partial[Pick[_Impl, String]])
}
