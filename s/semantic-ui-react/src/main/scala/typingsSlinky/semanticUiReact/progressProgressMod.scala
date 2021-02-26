package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.HtmlLabelProps
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.medium
import typingsSlinky.semanticUiReact.semanticUiReactStrings.percent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.ratio
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressProgressMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress/Progress", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ProgressProps, js.Object, js.Any] {
    def this(props: ProgressProps) = this()
    def this(props: ProgressProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress/Progress", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ProgressProps] = js.native
  
  @js.native
  trait ProgressProps
    extends StrictProgressProps
       with /* key */ StringDictionary[js.Any]
  object ProgressProps {
    
    @scala.inline
    def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
  }
  
  @js.native
  trait StrictProgressProps extends StObject {
    
    /** A progress bar can show activity. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A progress bar can attach to and show the progress of an element (i.e. Card or Segment). */
    var attached: js.UndefOr[top | bottom] = js.native
    
    /** Whether success state should automatically trigger when progress completes. */
    var autoSuccess: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A progress bar can have different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A progress bar be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** A progress bar can show a error state. */
    var error: js.UndefOr[Boolean] = js.native
    
    /** An indicating progress bar visually indicates the current level of progress of a task. */
    var indicating: js.UndefOr[Boolean] = js.native
    
    /** A progress bar can have its colors inverted. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** Can be set to either to display progress as percent or ratio. */
    var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.native
    
    /** Current percent complete. */
    var percent: js.UndefOr[Double | String] = js.native
    
    /** Decimal point precision for calculated progress. */
    var precision: js.UndefOr[Double] = js.native
    
    /** A progress bar can contain a text value indicating current progress. */
    var progress: js.UndefOr[Boolean | percent | ratio | value] = js.native
    
    /** A progress bar can vary in size. */
    var size: js.UndefOr[tiny | small | medium | large | big] = js.native
    
    /** A progress bar can show a success state. */
    var success: js.UndefOr[Boolean] = js.native
    
    /** For use with value. Together, these will calculate the percent. Mutually excludes percent. */
    var total: js.UndefOr[Double | String] = js.native
    
    /** For use with total. Together, these will calculate the percent. Mutually excludes percent. */
    var value: js.UndefOr[Double | String] = js.native
    
    /** A progress bar can show a warning state. */
    var warning: js.UndefOr[Boolean] = js.native
  }
  object StrictProgressProps {
    
    @scala.inline
    def apply(): StrictProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictProgressProps]
    }
    
    @scala.inline
    implicit class StrictProgressPropsMutableBuilder[Self <: StrictProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setAutoSuccess(value: Boolean): Self = StObject.set(x, "autoSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSuccessUndefined: Self = StObject.set(x, "autoSuccess", js.undefined)
      
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
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setIndicating(value: Boolean): Self = StObject.set(x, "indicating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatingUndefined: Self = StObject.set(x, "indicating", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ReactElement, HtmlLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPercent(value: Double | String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setProgress(value: Boolean | percent | ratio | value): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setSize(value: tiny | small | medium | large | big): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTotal(value: Double | String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `progressProgressMod.foo` */
  override def _to: ReactComponentClass[ProgressProps] = default
}
