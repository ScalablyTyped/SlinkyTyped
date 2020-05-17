package typingsSlinky.styledReactModal.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.styledReactModal.mod.ModalProps
import typingsSlinky.styledReactModal.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledReactModal {
  @JSImport("styled-react-modal", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def afterClose(value: () => Unit): this.type = set("afterClose", js.Any.fromFunction0(value))
    @scala.inline
    def afterOpen(value: () => Unit): this.type = set("afterOpen", js.Any.fromFunction0(value))
    @scala.inline
    def allowScroll(value: Boolean): this.type = set("allowScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundProps(value: js.Object): this.type = set("backgroundProps", value.asInstanceOf[js.Any])
    @scala.inline
    def beforeCloseFunction0(value: () => Unit): this.type = set("beforeClose", js.Any.fromFunction0(value))
    @scala.inline
    def beforeClose(value: js.Promise[Unit] | js.Function0[Unit]): this.type = set("beforeClose", value.asInstanceOf[js.Any])
    @scala.inline
    def beforeOpenFunction0(value: () => Unit): this.type = set("beforeOpen", js.Any.fromFunction0(value))
    @scala.inline
    def beforeOpen(value: js.Promise[Unit] | js.Function0[Unit]): this.type = set("beforeOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def onBackgroundClick(value: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onBackgroundClick", js.Any.fromFunction1(value))
    @scala.inline
    def onEscapeKeydown(value: /* event */ Event => Unit): this.type = set("onEscapeKeydown", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ModalProps]))
  }
}

