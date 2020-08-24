package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typingsSlinky.semanticUiReact.headerContentMod.HeaderContentProps
import typingsSlinky.semanticUiReact.headerHeaderMod.HeaderProps
import typingsSlinky.semanticUiReact.headerSubheaderMod.HeaderSubheaderProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.medium
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  @JSImport("semantic-ui-react", "Header")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def attached(value: Boolean | top | bottom): this.type = set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def dividing(value: Boolean): this.type = set("dividing", value.asInstanceOf[js.Any])
    @scala.inline
    def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: js.Any): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def image(value: js.Any): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: tiny | small | medium | large | huge): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def sub(value: Boolean): this.type = set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def subheader(value: js.Any): this.type = set("subheader", value.asInstanceOf[js.Any])
    @scala.inline
    def textAlign(value: SemanticTEXTALIGNMENTS): this.type = set("textAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Header.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Content {
    @JSImport("semantic-ui-react", "Header.Content")
    @js.native
    object component extends js.Object
    
    def withProps(p: HeaderContentProps): SharedBuilder_HeaderContentProps252036383 = new SharedBuilder_HeaderContentProps252036383(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Content.type): SharedBuilder_HeaderContentProps252036383 = new SharedBuilder_HeaderContentProps252036383(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Subheader {
    @JSImport("semantic-ui-react", "Header.Subheader")
    @js.native
    object component extends js.Object
    
    def withProps(p: HeaderSubheaderProps): SharedBuilder_HeaderSubheaderProps_656978477 = new SharedBuilder_HeaderSubheaderProps_656978477(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Subheader.type): SharedBuilder_HeaderSubheaderProps_656978477 = new SharedBuilder_HeaderSubheaderProps_656978477(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

