package typingsSlinky.semanticUiReact.listContentMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.listDescriptionMod.ListDescriptionProps
import typingsSlinky.semanticUiReact.listHeaderMod.ListHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictListContentProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** Shorthand for ListDescription. */
  var description: js.UndefOr[SemanticShorthandItem[ListDescriptionProps]] = js.native
  
  /** An list content can be floated left or right. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  
  /** Shorthand for ListHeader. */
  var header: js.UndefOr[SemanticShorthandItem[ListHeaderProps]] = js.native
  
  /** An element inside a list can be vertically aligned. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
}
object StrictListContentProps {
  
  @scala.inline
  def apply(): StrictListContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictListContentProps]
  }
  
  @scala.inline
  implicit class StrictListContentPropsOps[Self <: StrictListContentProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDescriptionReactElement(value: ReactElement): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionFunction3(
      value: (/* component */ ReactType[ListDescriptionProps], ListDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("description", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDescription(value: SemanticShorthandItem[ListDescriptionProps]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFloated(value: SemanticFLOATS): Self = this.set("floated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloated: Self = this.set("floated", js.undefined)
    
    @scala.inline
    def setHeaderReactElement(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFunction3(
      value: (/* component */ ReactType[ListHeaderProps], ListHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("header", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHeader(value: SemanticShorthandItem[ListHeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
}
