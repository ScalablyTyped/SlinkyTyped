package typingsSlinky.semanticDashUiDashForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.field
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.group
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.input
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.message
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.prompt
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.submit
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, message | field | group | input | prompt | submit]) with (Partial[Pick[_Impl, message | field | group | input | prompt | submit]])
}
