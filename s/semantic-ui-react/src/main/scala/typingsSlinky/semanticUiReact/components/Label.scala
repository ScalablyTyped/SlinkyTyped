package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticSIZES
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.labelDetailMod.LabelDetailProps
import typingsSlinky.semanticUiReact.labelGroupMod.LabelGroupProps
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.above
import typingsSlinky.semanticUiReact.semanticUiReactStrings.below
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Label {
  
  @JSImport("semantic-ui-react", "Label")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.semanticUiReact.mod.Label] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def attached(value: top | bottom | (`top right`) | (`top left`) | (`bottom left`) | (`bottom right`)): this.type = set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def corner(value: Boolean | left | right): this.type = set("corner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def detailReactElement(value: ReactElement): this.type = set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def detailFunction3(
      value: (/* component */ ReactElement, LabelDetailProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("detail", js.Any.fromFunction3(value))
    
    @scala.inline
    def detail(value: SemanticShorthandItem[LabelDetailProps]): this.type = set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def empty(value: js.Any): this.type = set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floating(value: Boolean): this.type = set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconFunction3(
      value: (/* component */ ReactElement, IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    
    @scala.inline
    def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def image(value: js.Any): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ LabelProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRemove(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ LabelProps) => Unit): this.type = set("onRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def pointing(value: Boolean | above | below | left | right): this.type = set("pointing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prompt(value: Boolean): this.type = set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIconFunction3(
      value: (/* component */ ReactElement, IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("removeIcon", js.Any.fromFunction3(value))
    
    @scala.inline
    def removeIcon(value: SemanticShorthandItem[IconProps]): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ribbon(value: Boolean | right): this.type = set("ribbon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tag(value: Boolean): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Label.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Detail {
    
    @JSImport("semantic-ui-react", "Label.Detail")
    @js.native
    object component extends js.Object
    
    def withProps(p: LabelDetailProps): SharedBuilder_LabelDetailProps_543902875 = new SharedBuilder_LabelDetailProps_543902875(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Detail.type): SharedBuilder_LabelDetailProps_543902875 = new SharedBuilder_LabelDetailProps_543902875(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Group {
    
    @JSImport("semantic-ui-react", "Label.Group")
    @js.native
    object component extends js.Object
    
    def withProps(p: LabelGroupProps): SharedBuilder_LabelGroupProps1387370830 = new SharedBuilder_LabelGroupProps1387370830(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Group.type): SharedBuilder_LabelGroupProps1387370830 = new SharedBuilder_LabelGroupProps1387370830(js.Array(this.component, js.Dictionary.empty))()
  }
}
