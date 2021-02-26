package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.gridColumnMod.GridOnlyProp
import typingsSlinky.semanticUiReact.gridGridMod.GridReversedProp
import typingsSlinky.semanticUiReact.semanticUiReactStrings.equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridRowMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Grid/GridRow", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GridRowProps] = js.native
  
  @js.native
  trait GridRowProps
    extends StrictGridRowProps
       with /* key */ StringDictionary[js.Any]
  object GridRowProps {
    
    @scala.inline
    def apply(): GridRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridRowProps]
    }
  }
  
  @js.native
  trait StrictGridRowProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A row can have its columns centered. */
    var centered: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A grid row can be colored. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** Represents column count per line in Row. */
    var columns: js.UndefOr[SemanticWIDTHS | equal] = js.native
    
    /** A row can have dividers between its columns. */
    var divided: js.UndefOr[Boolean] = js.native
    
    /** A row can appear only for a specific device, or screen sizes. */
    var only: js.UndefOr[GridOnlyProp] = js.native
    
    /** A  row can specify that its columns should reverse order at different device sizes. */
    var reversed: js.UndefOr[GridReversedProp] = js.native
    
    /** An can stretch its contents to take up the entire column height. */
    var stretched: js.UndefOr[Boolean] = js.native
    
    /** A row can specify its text alignment. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
    
    /** A row can specify its vertical alignment to have all its columns vertically centered. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
  }
  object StrictGridRowProps {
    
    @scala.inline
    def apply(): StrictGridRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictGridRowProps]
    }
    
    @scala.inline
    implicit class StrictGridRowPropsMutableBuilder[Self <: StrictGridRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
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
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumns(value: SemanticWIDTHS | equal): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setDivided(value: Boolean): Self = StObject.set(x, "divided", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividedUndefined: Self = StObject.set(x, "divided", js.undefined)
      
      @scala.inline
      def setOnly(value: GridOnlyProp): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setReversed(value: GridReversedProp): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setStretched(value: Boolean): Self = StObject.set(x, "stretched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchedUndefined: Self = StObject.set(x, "stretched", js.undefined)
      
      @scala.inline
      def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[GridRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridRowMod.foo` */
  override def _to: ReactComponentClass[GridRowProps] = default
}
