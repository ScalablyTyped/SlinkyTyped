package typingsSlinky.semanticDashUiDashApi.SemanticUI.Api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.disabled
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.form
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, disabled | form]) with (Partial[Pick[_Impl, disabled | form]])
}
