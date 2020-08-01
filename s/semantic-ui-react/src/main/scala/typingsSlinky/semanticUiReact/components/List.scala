package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticSIZES
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.listContentMod.ListContentProps
import typingsSlinky.semanticUiReact.listDescriptionMod.ListDescriptionProps
import typingsSlinky.semanticUiReact.listHeaderMod.ListHeaderProps
import typingsSlinky.semanticUiReact.listIconMod.ListIconProps
import typingsSlinky.semanticUiReact.listItemMod.ListItemProps
import typingsSlinky.semanticUiReact.listListListMod.ListListProps
import typingsSlinky.semanticUiReact.listListMod.ListProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("semantic-ui-react/dist/commonjs/elements/List", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def bulleted(value: Boolean): this.type = set("bulleted", value.asInstanceOf[js.Any])
    @scala.inline
    def celled(value: Boolean): this.type = set("celled", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def divided(value: Boolean): this.type = set("divided", value.asInstanceOf[js.Any])
    @scala.inline
    def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def itemsVarargs(value: SemanticShorthandItem[ListItemProps]*): this.type = set("items", js.Array(value :_*))
    @scala.inline
    def items(value: SemanticShorthandCollection[ListItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def onItemClick(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ListItemProps) => Unit): this.type = set("onItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def ordered(value: Boolean): this.type = set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def relaxed(value: Boolean | very): this.type = set("relaxed", value.asInstanceOf[js.Any])
    @scala.inline
    def selection(value: Boolean): this.type = set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: List.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Content {
    @JSImport("semantic-ui-react/dist/commonjs/elements/List", "default.Content")
    @js.native
    object component extends js.Object
    
    def withProps(p: ListContentProps): SharedBuilder_ListContentProps_1399011485 = new SharedBuilder_ListContentProps_1399011485(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Content.type): SharedBuilder_ListContentProps_1399011485 = new SharedBuilder_ListContentProps_1399011485(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Header {
    @JSImport("semantic-ui-react/dist/commonjs/elements/List", "default.Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: ListHeaderProps): SharedBuilder_ListHeaderProps958583138 = new SharedBuilder_ListHeaderProps958583138(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Header.type): SharedBuilder_ListHeaderProps958583138 = new SharedBuilder_ListHeaderProps958583138(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Item {
    @JSImport("semantic-ui-react/dist/commonjs/elements/List", "default.Item")
    @js.native
    object component extends js.Object
    
    def withProps(p: ListItemProps): SharedBuilder_ListItemProps_1306166873 = new SharedBuilder_ListItemProps_1306166873(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Item.type): SharedBuilder_ListItemProps_1306166873 = new SharedBuilder_ListItemProps_1306166873(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Icon {
    @JSImport("semantic-ui-react/dist/commonjs/elements/List", "default.Icon")
    @js.native
    object component extends js.Object
    
    def withProps(p: ListIconProps): SharedBuilder_ListIconProps56449996 = new SharedBuilder_ListIconProps56449996(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Icon.type): SharedBuilder_ListIconProps56449996 = new SharedBuilder_ListIconProps56449996(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object List {
    @JSImport("semantic-ui-react/dist/commonjs/elements/List", "default.List")
    @js.native
    object component extends js.Object
    
    def withProps(p: ListListProps): SharedBuilder_ListListProps15365399 = new SharedBuilder_ListListProps15365399(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: List.type): SharedBuilder_ListListProps15365399 = new SharedBuilder_ListListProps15365399(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Description {
    @JSImport("semantic-ui-react/dist/commonjs/elements/List", "default.Description")
    @js.native
    object component extends js.Object
    
    def withProps(p: ListDescriptionProps): SharedBuilder_ListDescriptionProps249326696 = new SharedBuilder_ListDescriptionProps249326696(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Description.type): SharedBuilder_ListDescriptionProps249326696 = new SharedBuilder_ListDescriptionProps249326696(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

