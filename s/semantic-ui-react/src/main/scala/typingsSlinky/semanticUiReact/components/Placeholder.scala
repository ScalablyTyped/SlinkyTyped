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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Placeholder {
  
  object Header {
    
    @JSImport("semantic-ui-react", "Placeholder.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_PlaceholderHeaderProps_1369306081 = new SharedBuilder_PlaceholderHeaderProps_1369306081(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PlaceholderHeaderProps): SharedBuilder_PlaceholderHeaderProps_1369306081 = new SharedBuilder_PlaceholderHeaderProps_1369306081(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Image {
    
    @JSImport("semantic-ui-react", "Placeholder.Image")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Image.type): SharedBuilder_PlaceholderImageProps758767587 = new SharedBuilder_PlaceholderImageProps758767587(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PlaceholderImageProps): SharedBuilder_PlaceholderImageProps758767587 = new SharedBuilder_PlaceholderImageProps758767587(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Line {
    
    @JSImport("semantic-ui-react", "Placeholder.Line")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Line.type): SharedBuilder_PlaceholderLineProps_804921993 = new SharedBuilder_PlaceholderLineProps_804921993(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PlaceholderLineProps): SharedBuilder_PlaceholderLineProps_804921993 = new SharedBuilder_PlaceholderLineProps_804921993(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Paragraph {
    
    @JSImport("semantic-ui-react", "Placeholder.Paragraph")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Paragraph.type): SharedBuilder_PlaceholderParagraphProps561623350 = new SharedBuilder_PlaceholderParagraphProps561623350(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PlaceholderParagraphProps): SharedBuilder_PlaceholderParagraphProps561623350 = new SharedBuilder_PlaceholderParagraphProps561623350(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Placeholder")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Placeholder.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PlaceholderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
