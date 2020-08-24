package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`scale down`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`slide along`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`slide out`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very thin`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very wide`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.overlay
import typingsSlinky.semanticUiReact.semanticUiReactStrings.push
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.thin
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.uncover
import typingsSlinky.semanticUiReact.semanticUiReactStrings.wide
import typingsSlinky.semanticUiReact.sidebarPushableMod.SidebarPushableProps
import typingsSlinky.semanticUiReact.sidebarPusherMod.SidebarPusherProps
import typingsSlinky.semanticUiReact.sidebarSidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar {
  @JSImport("semantic-ui-react", "Sidebar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Sidebar] {
    @scala.inline
    def animation(value: overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: top | right | bottom | left): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def onHidden(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): this.type = set("onHidden", js.Any.fromFunction2(value))
    @scala.inline
    def onHide(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): this.type = set("onHide", js.Any.fromFunction2(value))
    @scala.inline
    def onShow(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): this.type = set("onShow", js.Any.fromFunction2(value))
    @scala.inline
    def onVisible(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit): this.type = set("onVisible", js.Any.fromFunction2(value))
    @scala.inline
    def targetWindow(value: Window): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: Document | Window | HTMLElement | ReactRef[HTMLElement]): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def targetDocument(value: Document): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def targetRefObject(value: ReactRef[HTMLElement]): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def targetHTMLElement(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: (`very thin`) | thin | wide | (`very wide`)): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Sidebar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Pushable {
    @JSImport("semantic-ui-react", "Sidebar.Pushable")
    @js.native
    object component extends js.Object
    
    def withProps(p: SidebarPushableProps): SharedBuilder_SidebarPushableProps_269623663 = new SharedBuilder_SidebarPushableProps_269623663(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Pushable.type): SharedBuilder_SidebarPushableProps_269623663 = new SharedBuilder_SidebarPushableProps_269623663(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Pusher {
    @JSImport("semantic-ui-react", "Sidebar.Pusher")
    @js.native
    object component extends js.Object
    
    def withProps(p: SidebarPusherProps): SharedBuilder_SidebarPusherProps_1793364942 = new SharedBuilder_SidebarPusherProps_1793364942(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Pusher.type): SharedBuilder_SidebarPusherProps_1793364942 = new SharedBuilder_SidebarPusherProps_1793364942(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

