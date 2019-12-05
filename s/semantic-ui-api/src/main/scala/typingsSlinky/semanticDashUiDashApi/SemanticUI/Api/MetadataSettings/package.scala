package typingsSlinky.semanticDashUiDashApi.SemanticUI.Api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.action
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.url
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, action | url]) with (Partial[Pick[_Impl, action | url]])
}
