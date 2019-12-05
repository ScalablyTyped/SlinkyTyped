package typingsSlinky.semanticDashUiDashForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextSettings {
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.unspecifiedField
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.unspecifiedRule
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, unspecifiedRule | unspecifiedField]) with (Partial[Pick[_Impl, unspecifiedRule | unspecifiedField]])
}
