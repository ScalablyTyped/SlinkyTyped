package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.messageItemMod.MessageItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageListMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/MessageList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MessageListProps] = js.native
  
  @js.native
  trait MessageListProps
    extends StrictMessageListProps
       with /* key */ StringDictionary[js.Any]
  object MessageListProps {
    
    @scala.inline
    def apply(): MessageListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageListProps]
    }
  }
  
  @js.native
  trait StrictMessageListProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand Message.Items. */
    var items: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.native
  }
  object StrictMessageListProps {
    
    @scala.inline
    def apply(): StrictMessageListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMessageListProps]
    }
    
    @scala.inline
    implicit class StrictMessageListPropsMutableBuilder[Self <: StrictMessageListProps] (val x: Self) extends AnyVal {
      
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
      def setItems(value: SemanticShorthandCollection[MessageItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SemanticShorthandItem[MessageItemProps]*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[MessageListProps]
  
  /* This means you don't have to write `default`, but can instead just say `messageListMod.foo` */
  override def _to: ReactComponentClass[MessageListProps] = default
}
