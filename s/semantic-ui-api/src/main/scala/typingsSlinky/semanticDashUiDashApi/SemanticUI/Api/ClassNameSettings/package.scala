package typingsSlinky.semanticDashUiDashApi.SemanticUI.Api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.error
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.loading
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, loading | error]) with (Partial[Pick[_Impl, loading | error]])
}
