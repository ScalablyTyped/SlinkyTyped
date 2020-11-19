package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.cardCardMod.CardProps
import typingsSlinky.semanticUiReact.cardContentMod.CardContentProps
import typingsSlinky.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typingsSlinky.semanticUiReact.cardGroupMod.CardGroupProps
import typingsSlinky.semanticUiReact.cardHeaderMod.CardHeaderProps
import typingsSlinky.semanticUiReact.cardMetaMod.CardMetaProps
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.imageImageMod.ImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  @JSImport("semantic-ui-react", "Card")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Card] {
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionFunction3(
      value: (/* component */ ReactType[CardDescriptionProps], CardDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("description", js.Any.fromFunction3(value))
    
    @scala.inline
    def description(value: SemanticShorthandItem[CardDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: SemanticShorthandContent): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerFunction3(
      value: (/* component */ ReactType[CardHeaderProps], CardHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    
    @scala.inline
    def header(value: SemanticShorthandItem[CardHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageReactElement(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageFunction3(
      value: (/* component */ ReactType[ImageProps], ImageProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("image", js.Any.fromFunction3(value))
    
    @scala.inline
    def image(value: SemanticShorthandItem[ImageProps]): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def metaReactElement(value: ReactElement): this.type = set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def metaFunction3(
      value: (/* component */ ReactType[CardMetaProps], CardMetaProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("meta", js.Any.fromFunction3(value))
    
    @scala.inline
    def meta(value: SemanticShorthandItem[CardMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ CardProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Content {
    
    @JSImport("semantic-ui-react", "Card.Content")
    @js.native
    object component extends js.Object
    
    def withProps(p: CardContentProps): SharedBuilder_CardContentProps516196698 = new SharedBuilder_CardContentProps516196698(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Content.type): SharedBuilder_CardContentProps516196698 = new SharedBuilder_CardContentProps516196698(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Description {
    
    @JSImport("semantic-ui-react", "Card.Description")
    @js.native
    object component extends js.Object
    
    def withProps(p: CardDescriptionProps): SharedBuilder_CardDescriptionProps1426981333 = new SharedBuilder_CardDescriptionProps1426981333(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Description.type): SharedBuilder_CardDescriptionProps1426981333 = new SharedBuilder_CardDescriptionProps1426981333(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Group {
    
    @JSImport("semantic-ui-react", "Card.Group")
    @js.native
    object component extends js.Object
    
    def withProps(p: CardGroupProps): SharedBuilder_CardGroupProps495383547 = new SharedBuilder_CardGroupProps495383547(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Group.type): SharedBuilder_CardGroupProps495383547 = new SharedBuilder_CardGroupProps495383547(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "Card.Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: CardHeaderProps): SharedBuilder_CardHeaderProps899634192 = new SharedBuilder_CardHeaderProps899634192(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Header.type): SharedBuilder_CardHeaderProps899634192 = new SharedBuilder_CardHeaderProps899634192(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Meta {
    
    @JSImport("semantic-ui-react", "Card.Meta")
    @js.native
    object component extends js.Object
    
    def withProps(p: CardMetaProps): SharedBuilder_CardMetaProps_1971303307 = new SharedBuilder_CardMetaProps_1971303307(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Meta.type): SharedBuilder_CardMetaProps_1971303307 = new SharedBuilder_CardMetaProps_1971303307(js.Array(this.component, js.Dictionary.empty))()
  }
}
