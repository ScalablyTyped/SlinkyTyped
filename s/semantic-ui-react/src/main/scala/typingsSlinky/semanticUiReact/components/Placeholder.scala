package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.placeholderHeaderMod.PlaceholderHeaderProps
import typingsSlinky.semanticUiReact.placeholderImageMod.PlaceholderImageProps
import typingsSlinky.semanticUiReact.placeholderLineMod.PlaceholderLineProps
import typingsSlinky.semanticUiReact.placeholderParagraphMod.PlaceholderParagraphProps
import typingsSlinky.semanticUiReact.placeholderPlaceholderMod.PlaceholderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Placeholder {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PlaceholderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Placeholder.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Image {
    @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder", "default.Image")
    @js.native
    object component extends js.Object
    
    def withProps(p: PlaceholderImageProps): SharedBuilder_PlaceholderImageProps758767587 = new SharedBuilder_PlaceholderImageProps758767587(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Image.type): SharedBuilder_PlaceholderImageProps758767587 = new SharedBuilder_PlaceholderImageProps758767587(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Header {
    @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder", "default.Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: PlaceholderHeaderProps): SharedBuilder_PlaceholderHeaderProps_1369306081 = new SharedBuilder_PlaceholderHeaderProps_1369306081(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Header.type): SharedBuilder_PlaceholderHeaderProps_1369306081 = new SharedBuilder_PlaceholderHeaderProps_1369306081(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Line {
    @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder", "default.Line")
    @js.native
    object component extends js.Object
    
    def withProps(p: PlaceholderLineProps): SharedBuilder_PlaceholderLineProps_804921993 = new SharedBuilder_PlaceholderLineProps_804921993(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Line.type): SharedBuilder_PlaceholderLineProps_804921993 = new SharedBuilder_PlaceholderLineProps_804921993(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Paragraph {
    @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder", "default.Paragraph")
    @js.native
    object component extends js.Object
    
    def withProps(p: PlaceholderParagraphProps): SharedBuilder_PlaceholderParagraphProps561623350 = new SharedBuilder_PlaceholderParagraphProps561623350(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Paragraph.type): SharedBuilder_PlaceholderParagraphProps561623350 = new SharedBuilder_PlaceholderParagraphProps561623350(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

