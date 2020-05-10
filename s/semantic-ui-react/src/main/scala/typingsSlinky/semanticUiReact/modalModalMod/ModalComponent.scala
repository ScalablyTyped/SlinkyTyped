package typingsSlinky.semanticUiReact.modalModalMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.modalActionsMod.ModalActionsProps
import typingsSlinky.semanticUiReact.modalContentMod.ModalContentProps
import typingsSlinky.semanticUiReact.modalDescriptionMod.ModalDescriptionProps
import typingsSlinky.semanticUiReact.modalHeaderMod.ModalHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalComponent
  extends ComponentClass[ModalProps, js.Object] {
  var Actions: ReactComponentClass[ModalActionsProps] = js.native
  var Content: ReactComponentClass[ModalContentProps] = js.native
  var Description: ReactComponentClass[ModalDescriptionProps] = js.native
  var Header: ReactComponentClass[ModalHeaderProps] = js.native
}

