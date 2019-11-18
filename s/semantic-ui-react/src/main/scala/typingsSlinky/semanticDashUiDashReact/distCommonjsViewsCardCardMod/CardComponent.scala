package typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardContentMod.CardContentProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardDescriptionMod.CardDescriptionProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardGroupMod.CardGroupProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardHeaderMod.CardHeaderProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardMetaMod.CardMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardComponent extends ComponentClass[CardProps, ComponentState] {
  var Content: ReactComponentClass[CardContentProps] = js.native
  var Description: ReactComponentClass[CardDescriptionProps] = js.native
  var Group: ReactComponentClass[CardGroupProps] = js.native
  var Header: ReactComponentClass[CardHeaderProps] = js.native
  var Meta: ReactComponentClass[CardMetaProps] = js.native
}

