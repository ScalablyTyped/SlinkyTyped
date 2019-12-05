package typingsSlinky.semanticDashUiDashEmbed.SemanticUI.Embed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.icon
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.id
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.placeholder
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.source
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.url
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, id | icon | placeholder | source | url]) with (Partial[Pick[_Impl, id | icon | placeholder | source | url]])
}
