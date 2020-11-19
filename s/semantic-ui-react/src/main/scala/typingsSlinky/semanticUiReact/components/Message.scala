package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.messageContentMod.MessageContentProps
import typingsSlinky.semanticUiReact.messageHeaderMod.MessageHeaderProps
import typingsSlinky.semanticUiReact.messageItemMod.MessageItemProps
import typingsSlinky.semanticUiReact.messageListMod.MessageListProps
import typingsSlinky.semanticUiReact.messageMessageMod.MessageProps
import typingsSlinky.semanticUiReact.messageMessageMod.MessageSizeProp
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Message {
  
  @JSImport("semantic-ui-react", "Message")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Message] {
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def attached(value: Boolean | bottom | top): this.type = set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floating(value: Boolean): this.type = set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerFunction3(
      value: (/* component */ ReactType[MessageHeaderProps], MessageHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    
    @scala.inline
    def header(value: SemanticShorthandItem[MessageHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: js.Any | Boolean): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def info(value: Boolean): this.type = set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listVarargs(value: SemanticShorthandItem[MessageItemProps]*): this.type = set("list", js.Array(value :_*))
    
    @scala.inline
    def list(value: SemanticShorthandCollection[MessageItemProps]): this.type = set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def negative(value: Boolean): this.type = set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDismiss(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ MessageProps) => Unit): this.type = set("onDismiss", js.Any.fromFunction2(value))
    
    @scala.inline
    def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: MessageSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def success(value: Boolean): this.type = set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def warning(value: Boolean): this.type = set("warning", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MessageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Message.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Content {
    
    @JSImport("semantic-ui-react", "Message.Content")
    @js.native
    object component extends js.Object
    
    def withProps(p: MessageContentProps): SharedBuilder_MessageContentProps596902138 = new SharedBuilder_MessageContentProps596902138(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Content.type): SharedBuilder_MessageContentProps596902138 = new SharedBuilder_MessageContentProps596902138(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "Message.Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: MessageHeaderProps): SharedBuilder_MessageHeaderProps325359624 = new SharedBuilder_MessageHeaderProps325359624(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Header.type): SharedBuilder_MessageHeaderProps325359624 = new SharedBuilder_MessageHeaderProps325359624(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Item {
    
    @JSImport("semantic-ui-react", "Message.Item")
    @js.native
    object component extends js.Object
    
    def withProps(p: MessageItemProps): SharedBuilder_MessageItemProps_528637509 = new SharedBuilder_MessageItemProps_528637509(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Item.type): SharedBuilder_MessageItemProps_528637509 = new SharedBuilder_MessageItemProps_528637509(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object List {
    
    @JSImport("semantic-ui-react", "Message.List")
    @js.native
    object component extends js.Object
    
    def withProps(p: MessageListProps): SharedBuilder_MessageListProps1781517395 = new SharedBuilder_MessageListProps1781517395(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: List.type): SharedBuilder_MessageListProps1781517395 = new SharedBuilder_MessageListProps1781517395(js.Array(this.component, js.Dictionary.empty))()
  }
}
