package typingsSlinky.semanticUiReact.formCheckboxMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.checkboxCheckboxMod.StrictCheckboxProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, disabled, id, label, required, `type`, width. Inlined content, control, error, `inline` */ @js.native
trait StrictFormCheckboxProps extends StrictCheckboxProps {
  
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** A FormField control prop. */
  var control: js.UndefOr[js.Any] = js.native
  
  /** Individual fields may display an error state along with a message. */
  var error: js.UndefOr[Boolean | SemanticShorthandItem[LabelProps]] = js.native
  
  /** A field can have its label next to instead of above it. */
  var `inline`: js.UndefOr[Boolean] = js.native
}
object StrictFormCheckboxProps {
  
  @scala.inline
  def apply(): StrictFormCheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFormCheckboxProps]
  }
  
  @scala.inline
  implicit class StrictFormCheckboxPropsOps[Self <: StrictFormCheckboxProps] (val x: Self) extends AnyVal {
    
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
  }
}
