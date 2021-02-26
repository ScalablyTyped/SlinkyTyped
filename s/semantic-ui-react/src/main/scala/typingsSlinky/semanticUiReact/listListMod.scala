package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.FunctionComponent
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
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/List", JSImport.Default)
  @js.native
  val default: ListComponent = js.native
  
  @js.native
  trait ListComponent extends FunctionComponent[ListProps] {
    
    var Content: ReactComponentClass[ListContentProps] = js.native
    
    var Description: ReactComponentClass[ListDescriptionProps] = js.native
    
    var Header: ReactComponentClass[ListHeaderProps] = js.native
    
    var Icon: ReactComponentClass[ListIconProps] = js.native
    
    var Item: ReactComponentClass[ListItemProps] = js.native
    
    var List: ReactComponentClass[ListListProps] = js.native
  }
  
  @js.native
  trait ListProps
    extends StrictListProps
       with /* key */ StringDictionary[js.Any]
  object ListProps {
    
    @scala.inline
    def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
  }
  
  @js.native
  trait StrictListProps extends StObject {
    
    /** A list can animate to set the current item apart from the list. */
    var animated: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A list can mark items with a bullet. */
    var bulleted: js.UndefOr[Boolean] = js.native
    
    /** A list can divide its items into cells. */
    var celled: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A list can show divisions between content. */
    var divided: js.UndefOr[Boolean] = js.native
    
    /** An list can be floated left or right. */
    var floated: js.UndefOr[SemanticFLOATS] = js.native
    
    /** A list can be formatted to have items appear horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /** A list can be inverted to appear on a dark background. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** Shorthand array of props for ListItem. */
    var items: js.UndefOr[SemanticShorthandCollection[ListItemProps]] = js.native
    
    /** A list can be specially formatted for navigation links. */
    var link: js.UndefOr[Boolean] = js.native
    
    /**
      * onClick handler for ListItem. Mutually exclusive with children.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All item props.
      */
    var onItemClick: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ListItemProps, Unit]
      ] = js.native
    
    /** A list can be ordered numerically. */
    var ordered: js.UndefOr[Boolean] = js.native
    
    /** A list can relax its padding to provide more negative space. */
    var relaxed: js.UndefOr[Boolean | very] = js.native
    
    /** A selection list formats list items as possible choices. */
    var selection: js.UndefOr[Boolean] = js.native
    
    /** A list can vary in size. */
    var size: js.UndefOr[SemanticSIZES] = js.native
    
    /** An element inside a list can be vertically aligned. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
  }
  object StrictListProps {
    
    @scala.inline
    def apply(): StrictListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListProps]
    }
    
    @scala.inline
    implicit class StrictListPropsMutableBuilder[Self <: StrictListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBulleted(value: Boolean): Self = StObject.set(x, "bulleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletedUndefined: Self = StObject.set(x, "bulleted", js.undefined)
      
      @scala.inline
      def setCelled(value: Boolean): Self = StObject.set(x, "celled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCelledUndefined: Self = StObject.set(x, "celled", js.undefined)
      
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
      def setDivided(value: Boolean): Self = StObject.set(x, "divided", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividedUndefined: Self = StObject.set(x, "divided", js.undefined)
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setItems(value: SemanticShorthandCollection[ListItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SemanticShorthandItem[ListItemProps]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ListItemProps) => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      @scala.inline
      def setRelaxed(value: Boolean | very): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
      
      @scala.inline
      def setSelection(value: Boolean): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = ListComponent
  
  /* This means you don't have to write `default`, but can instead just say `listListMod.foo` */
  override def _to: ListComponent = default
}
