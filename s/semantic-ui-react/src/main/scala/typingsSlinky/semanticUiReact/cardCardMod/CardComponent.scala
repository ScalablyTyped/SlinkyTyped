package typingsSlinky.semanticUiReact.cardCardMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.cardContentMod.CardContentProps
import typingsSlinky.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typingsSlinky.semanticUiReact.cardGroupMod.CardGroupProps
import typingsSlinky.semanticUiReact.cardHeaderMod.CardHeaderProps
import typingsSlinky.semanticUiReact.cardMetaMod.CardMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardComponent
  extends ComponentClass[CardProps, js.Object] {
  var Content: ReactComponentClass[CardContentProps] = js.native
  var Description: ReactComponentClass[CardDescriptionProps] = js.native
  var Group: ReactComponentClass[CardGroupProps] = js.native
  var Header: ReactComponentClass[CardHeaderProps] = js.native
  var Meta: ReactComponentClass[CardMetaProps] = js.native
}

