package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.portalMod.default
import typingsSlinky.semanticUiReact.portalPortalMod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal {
  @JSImport("semantic-ui-react/dist/commonjs/addons/Portal", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def closeOnDocumentClick(value: Boolean): this.type = set("closeOnDocumentClick", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnPortalMouseLeave(value: Boolean): this.type = set("closeOnPortalMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnTriggerBlur(value: Boolean): this.type = set("closeOnTriggerBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnTriggerClick(value: Boolean): this.type = set("closeOnTriggerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnTriggerMouseLeave(value: Boolean): this.type = set("closeOnTriggerMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def eventPool(value: String): this.type = set("eventPool", value.asInstanceOf[js.Any])
    @scala.inline
    def mountNode(value: js.Any): this.type = set("mountNode", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PortalProps) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def onMount(value: (/* nothing */ Null, /* data */ PortalProps) => Unit): this.type = set("onMount", js.Any.fromFunction2(value))
    @scala.inline
    def onOpen(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PortalProps) => Unit): this.type = set("onOpen", js.Any.fromFunction2(value))
    @scala.inline
    def onUnmount(value: (/* nothing */ Null, /* data */ PortalProps) => Unit): this.type = set("onUnmount", js.Any.fromFunction2(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def openOnTriggerClick(value: Boolean): this.type = set("openOnTriggerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def openOnTriggerFocus(value: Boolean): this.type = set("openOnTriggerFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def openOnTriggerMouseEnter(value: Boolean): this.type = set("openOnTriggerMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerReactElement(value: ReactElement): this.type = set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def trigger(value: TagMod[Any]): this.type = set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerRefRefObject(value: ReactRef[_]): this.type = set("triggerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("triggerRef", js.Any.fromFunction1(value))
    @scala.inline
    def triggerRef(value: typingsSlinky.react.mod.Ref[_]): this.type = set("triggerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerRefNull: this.type = set("triggerRef", null)
  }
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

