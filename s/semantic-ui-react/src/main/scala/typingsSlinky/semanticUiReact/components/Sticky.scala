package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.stickyMod.default
import typingsSlinky.semanticUiReact.stickyStickyMod.StickyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sticky {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def bottomOffset(value: Double): this.type = set("bottomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contextRefObject(value: ReactRef[HTMLElement]): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def contextFunction1(value: /* instance */ HTMLElement | Null => Unit): this.type = set("context", js.Any.fromFunction1(value))
    @scala.inline
    def context(value: js.Object | typingsSlinky.react.mod.Ref[HTMLElement]): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def contextNull: this.type = set("context", null)
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def onBottom(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps) => Unit): this.type = set("onBottom", js.Any.fromFunction2(value))
    @scala.inline
    def onStick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps) => Unit): this.type = set("onStick", js.Any.fromFunction2(value))
    @scala.inline
    def onTop(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps) => Unit): this.type = set("onTop", js.Any.fromFunction2(value))
    @scala.inline
    def onUnstick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ StickyProps) => Unit): this.type = set("onUnstick", js.Any.fromFunction2(value))
    @scala.inline
    def pushing(value: Boolean): this.type = set("pushing", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollContextRefObject(value: ReactRef[HTMLElement]): this.type = set("scrollContext", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollContextFunction1(value: /* instance */ HTMLElement | Null => Unit): this.type = set("scrollContext", js.Any.fromFunction1(value))
    @scala.inline
    def scrollContext(value: js.Object | typingsSlinky.react.mod.Ref[HTMLElement]): this.type = set("scrollContext", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollContextNull: this.type = set("scrollContext", null)
    @scala.inline
    def styleElement(value: js.Object): this.type = set("styleElement", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StickyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Sticky.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

