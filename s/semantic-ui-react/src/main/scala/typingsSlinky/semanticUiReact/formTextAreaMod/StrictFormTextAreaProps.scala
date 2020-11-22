package typingsSlinky.semanticUiReact.formTextAreaMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.HtmlLabelProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.textAreaTextAreaMod.StrictTextAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, disabled, id, required. Inlined content, control, error, `inline`, label, `type`, width */ @js.native
trait StrictFormTextAreaProps extends StrictTextAreaProps {
  
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** A FormField control prop. */
  var control: js.UndefOr[js.Any] = js.native
  
  /** Individual fields may display an error state along with a message. */
  var error: js.UndefOr[Boolean | SemanticShorthandItem[LabelProps]] = js.native
  
  /** A field can have its label next to instead of above it. */
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /** Mutually exclusive with children. */
  var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.native
  
  /** Passed to the control component (i.e. <input type='password' />) */
  var `type`: js.UndefOr[String] = js.native
  
  /** A field can specify its width in grid columns */
  var width: js.UndefOr[SemanticWIDTHS] = js.native
}
object StrictFormTextAreaProps {
  
  @scala.inline
  def apply(): StrictFormTextAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFormTextAreaProps]
  }
  
  @scala.inline
  implicit class StrictFormTextAreaPropsOps[Self <: StrictFormTextAreaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setControl(value: js.Any): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
    @scala.inline
    def setErrorReactElement(value: ReactElement): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorFunction3(
      value: (/* component */ ReactElement, LabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setError(value: Boolean | SemanticShorthandItem[LabelProps]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFunction3(
      value: (/* component */ ReactElement, HtmlLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("label", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: SemanticWIDTHS): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
