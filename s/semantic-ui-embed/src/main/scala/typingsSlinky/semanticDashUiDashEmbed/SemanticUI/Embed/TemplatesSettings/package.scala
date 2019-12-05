package typingsSlinky.semanticDashUiDashEmbed.SemanticUI.Embed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TemplatesSettings {
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.iframe
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.placeholder
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, iframe | placeholder]) with (Partial[Pick[_Impl, String]])
}
