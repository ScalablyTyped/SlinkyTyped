package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.semanticUiReactStrings.equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormGroup", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormGroupProps] = js.native
  
  @js.native
  trait FormGroupProps
    extends StrictFormGroupProps
       with /* key */ StringDictionary[js.Any]
  object FormGroupProps {
    
    @scala.inline
    def apply(): FormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormGroupProps]
    }
  }
  
  @js.native
  trait StrictFormGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Fields can show related choices. */
    var grouped: js.UndefOr[Boolean] = js.native
    
    /** Multiple fields may be inline in a row. */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /** A form group can prevent itself from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.native
    
    /** Fields Groups can specify their width in grid columns or automatically divide fields to be equal width. */
    var widths: js.UndefOr[SemanticWIDTHS | equal] = js.native
  }
  object StrictFormGroupProps {
    
    @scala.inline
    def apply(): StrictFormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFormGroupProps]
    }
    
    @scala.inline
    implicit class StrictFormGroupPropsMutableBuilder[Self <: StrictFormGroupProps] (val x: Self) extends AnyVal {
      
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
      def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
      
      @scala.inline
      def setWidths(value: SemanticWIDTHS | equal): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `formGroupMod.foo` */
  override def _to: ReactComponentClass[FormGroupProps] = default
}
