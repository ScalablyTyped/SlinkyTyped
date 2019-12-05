package typingsSlinky.semanticDashUiDashEmbed.SemanticUI.Embed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.embed
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.placeholder
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.play
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, embed | placeholder | play]) with (Partial[Pick[_Impl, embed | placeholder | play]])
}
