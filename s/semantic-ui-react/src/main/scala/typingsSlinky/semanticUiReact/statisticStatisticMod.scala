package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.statisticGroupMod.StatisticGroupProps
import typingsSlinky.semanticUiReact.statisticLabelMod.StatisticLabelProps
import typingsSlinky.semanticUiReact.statisticValueMod.StatisticValueProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticStatisticMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Statistic/Statistic", JSImport.Default)
  @js.native
  val default: StatisticComponent = js.native
  
  @js.native
  trait StatisticComponent extends FunctionComponent[StatisticProps] {
    
    var Group: ReactComponentClass[StatisticGroupProps] = js.native
    
    var Label: ReactComponentClass[StatisticLabelProps] = js.native
    
    var Value: ReactComponentClass[StatisticValueProps] = js.native
  }
  
  @js.native
  trait StatisticProps
    extends StrictStatisticProps
       with /* key */ StringDictionary[js.Any]
  object StatisticProps {
    
    @scala.inline
    def apply(): StatisticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.small
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.large
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
  */
  trait StatisticSizeProp extends StObject
  object StatisticSizeProp {
    
    @scala.inline
    def huge: typingsSlinky.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.huge]
    
    @scala.inline
    def large: typingsSlinky.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.large]
    
    @scala.inline
    def mini: typingsSlinky.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.mini]
    
    @scala.inline
    def small: typingsSlinky.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.small]
    
    @scala.inline
    def tiny: typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  @js.native
  trait StrictStatisticProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A statistic can be formatted to be different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A statistic can sit to the left or right of other content. */
    var floated: js.UndefOr[SemanticFLOATS] = js.native
    
    /** A statistic can present its measurement horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /** A statistic can be formatted to fit on a dark background. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** Label content of the Statistic. */
    var label: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A statistic can vary in size. */
    var size: js.UndefOr[StatisticSizeProp] = js.native
    
    /** Format the StatisticValue with smaller font size to fit nicely beside number values. */
    var text: js.UndefOr[Boolean] = js.native
    
    /** Value content of the Statistic. */
    var value: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictStatisticProps {
    
    @scala.inline
    def apply(): StrictStatisticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStatisticProps]
    }
    
    @scala.inline
    implicit class StrictStatisticPropsMutableBuilder[Self <: StrictStatisticProps] (val x: Self) extends AnyVal {
      
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
      def setLabel(value: SemanticShorthandContent): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSize(value: StatisticSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: SemanticShorthandContent): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueReactElement(value: ReactElement): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = StatisticComponent
  
  /* This means you don't have to write `default`, but can instead just say `statisticStatisticMod.foo` */
  override def _to: StatisticComponent = default
}
