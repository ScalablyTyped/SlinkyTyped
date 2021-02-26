package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMenuMenuMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/MenuMenu", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MenuMenuProps] = js.native
  
  @js.native
  trait MenuMenuProps
    extends StrictMenuMenuProps
       with /* key */ StringDictionary[js.Any]
  object MenuMenuProps {
    
    @scala.inline
    def apply(): MenuMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuMenuProps]
    }
  }
  
  @js.native
  trait StrictMenuMenuProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A sub menu can take left or right position. */
    var position: js.UndefOr[left | right] = js.native
  }
  object StrictMenuMenuProps {
    
    @scala.inline
    def apply(): StrictMenuMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMenuMenuProps]
    }
    
    @scala.inline
    implicit class StrictMenuMenuPropsMutableBuilder[Self <: StrictMenuMenuProps] (val x: Self) extends AnyVal {
      
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
      def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MenuMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuMenuMenuMod.foo` */
  override def _to: ReactComponentClass[MenuMenuProps] = default
}
