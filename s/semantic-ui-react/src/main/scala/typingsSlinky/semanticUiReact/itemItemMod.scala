package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.itemContentMod.ItemContentProps
import typingsSlinky.semanticUiReact.itemDescriptionMod.ItemDescriptionProps
import typingsSlinky.semanticUiReact.itemExtraMod.ItemExtraProps
import typingsSlinky.semanticUiReact.itemGroupMod.ItemGroupProps
import typingsSlinky.semanticUiReact.itemHeaderMod.ItemHeaderProps
import typingsSlinky.semanticUiReact.itemImageMod.ItemImageProps
import typingsSlinky.semanticUiReact.itemMetaMod.ItemMetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemItemMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/views/Item/Item", JSImport.Default)
    @js.native
    val ^ : ItemComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/views/Item/Item", "default.Content")
    @js.native
    class Content protected ()
      extends Component[ItemContentProps, js.Object, js.Any] {
      def this(props: ItemContentProps) = this()
      def this(props: ItemContentProps, context: js.Any) = this()
    }
    
    type _To = ItemComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ItemComponent = ^
  }
  
  @js.native
  trait ItemComponent extends FunctionComponent[ItemProps] {
    
    var Content: ReactComponentClass[ItemContentProps] = js.native
    
    var Description: ReactComponentClass[ItemDescriptionProps] = js.native
    
    var Extra: ReactComponentClass[ItemExtraProps] = js.native
    
    var Group: ReactComponentClass[ItemGroupProps] = js.native
    
    var Header: ReactComponentClass[ItemHeaderProps] = js.native
    
    var Image: ReactComponentClass[ItemImageProps] = js.native
    
    var Meta: ReactComponentClass[ItemMetaProps] = js.native
  }
  
  @js.native
  trait ItemProps
    extends StrictItemProps
       with /* key */ StringDictionary[js.Any]
  object ItemProps {
    
    @scala.inline
    def apply(): ItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemProps]
    }
  }
  
  @js.native
  trait StrictItemProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for ItemContent component. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Shorthand for ItemDescription component. */
    var description: js.UndefOr[SemanticShorthandItem[ItemDescriptionProps]] = js.native
    
    /** Shorthand for ItemExtra component. */
    var extra: js.UndefOr[SemanticShorthandItem[ItemExtraProps]] = js.native
    
    /** Shorthand for ItemHeader component. */
    var header: js.UndefOr[SemanticShorthandItem[ItemHeaderProps]] = js.native
    
    /** Shorthand for ItemImage component. */
    var image: js.UndefOr[SemanticShorthandItem[ItemImageProps]] = js.native
    
    /** Shorthand for ItemMeta component. */
    var meta: js.UndefOr[SemanticShorthandItem[ItemMetaProps]] = js.native
  }
  object StrictItemProps {
    
    @scala.inline
    def apply(): StrictItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictItemProps]
    }
    
    @scala.inline
    implicit class StrictItemPropsMutableBuilder[Self <: StrictItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDescription(value: SemanticShorthandItem[ItemDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction3(
        value: (/* component */ ReactElement, ItemDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExtra(value: SemanticShorthandItem[ItemExtraProps]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraFunction3(
        value: (/* component */ ReactElement, ItemExtraProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "extra", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setHeader(value: SemanticShorthandItem[ItemHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction3(
        value: (/* component */ ReactElement, ItemHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaderReactElement(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setImage(value: SemanticShorthandItem[ItemImageProps]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageFunction3(
        value: (/* component */ ReactElement, ItemImageProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      @scala.inline
      def setImageReactElement(value: ReactElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setMeta(value: SemanticShorthandItem[ItemMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaFunction3(
        value: (/* component */ ReactElement, ItemMetaProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMetaReactElement(value: ReactElement): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
}
