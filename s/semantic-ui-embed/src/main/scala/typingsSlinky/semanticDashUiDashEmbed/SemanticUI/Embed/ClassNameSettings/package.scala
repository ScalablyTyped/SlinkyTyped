package typingsSlinky.semanticDashUiDashEmbed.SemanticUI.Embed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.active
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.embed
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, active | embed]) with (Partial[Pick[_Impl, active | embed]])
}
