package typingsSlinky.semanticDashUiDashEmbed.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EmbedSettings {
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.autoplay
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.brandedUI
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.className
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.color
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.debug
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.error
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.hd
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.icon
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.id
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.metadata
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.name
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.namespace
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.onCreate
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.onDisplay
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.onEmbed
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.onPlaceholderDisplay
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.parameters
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.performance
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.selector
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.silent
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.source
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.templates
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.url
  import typingsSlinky.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    url | icon | source | id | parameters | autoplay | color | hd | brandedUI | onCreate | onDisplay | onPlaceholderDisplay | onEmbed | selector | metadata | className | templates | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      url | icon | source | id | parameters | autoplay | color | hd | brandedUI | selector | metadata | className | templates | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
