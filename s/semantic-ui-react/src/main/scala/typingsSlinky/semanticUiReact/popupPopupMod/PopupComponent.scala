package typingsSlinky.semanticUiReact.popupPopupMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.semanticUiReact.popupContentMod.PopupContentProps
import typingsSlinky.semanticUiReact.popupHeaderMod.PopupHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupComponent extends ComponentClass[PopupProps, ComponentState] {
  var Content: ReactComponentClass[PopupContentProps] = js.native
  var Header: ReactComponentClass[PopupHeaderProps] = js.native
}

