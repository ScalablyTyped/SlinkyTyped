package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.statisticStatisticMod.StatisticProps
import typingsSlinky.semanticUiReact.statisticStatisticMod.StatisticSizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Statistic/StatisticGroup", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatisticGroupProps] = js.native
  
  @js.native
  trait StatisticGroupProps
    extends StrictStatisticGroupProps
       with /* key */ StringDictionary[js.Any]
  object StatisticGroupProps {
    
    @scala.inline
    def apply(): StatisticGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticGroupProps]
    }
  }
  
  @js.native
  trait StrictStatisticGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A statistic group can be formatted to be different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A statistic group can present its measurement horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /** A statistic group can present its measurement horizontally. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** Array of props for Statistic. */
    var items: js.UndefOr[SemanticShorthandCollection[StatisticProps]] = js.native
    
    /** A statistic group can vary in size. */
    var size: js.UndefOr[StatisticSizeProp] = js.native
    
    /** A statistic group can have its items divided evenly. */
    var widths: js.UndefOr[SemanticWIDTHS] = js.native
  }
  object StrictStatisticGroupProps {
    
    @scala.inline
    def apply(): StrictStatisticGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStatisticGroupProps]
    }
    
    @scala.inline
    implicit class StrictStatisticGroupPropsMutableBuilder[Self <: StrictStatisticGroupProps] (val x: Self) extends AnyVal {
      
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
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setItems(value: SemanticShorthandCollection[StatisticProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SemanticShorthandItem[StatisticProps]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: StatisticSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWidths(value: SemanticWIDTHS): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatisticGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `statisticGroupMod.foo` */
  override def _to: ReactComponentClass[StatisticGroupProps] = default
}
