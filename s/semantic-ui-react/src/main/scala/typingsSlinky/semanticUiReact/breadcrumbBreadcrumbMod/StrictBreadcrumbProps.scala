package typingsSlinky.semanticUiReact.breadcrumbBreadcrumbMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.breadcrumbSectionMod.BreadcrumbSectionProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictBreadcrumbProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Shorthand for primary content of the Breadcrumb.Divider. */
  var divider: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** For use with the sections prop. Render as an `Icon` component with `divider` class instead of a `div` in
    *  Breadcrumb.Divider.
    */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
  
  /** Shorthand array of props for Breadcrumb.Section. */
  var sections: js.UndefOr[SemanticShorthandCollection[BreadcrumbSectionProps]] = js.native
  
  /** Size of Breadcrumb */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
}
object StrictBreadcrumbProps {
  
  @scala.inline
  def apply(): StrictBreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictBreadcrumbProps]
  }
  
  @scala.inline
  implicit class StrictBreadcrumbPropsOps[Self <: StrictBreadcrumbProps] (val x: Self) extends AnyVal {
    
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
    def setDividerReactElement(value: ReactElement): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivider(value: SemanticShorthandContent): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconFunction3(
      value: (/* component */ ReactType[IconProps], IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("icon", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIcon(value: SemanticShorthandItem[IconProps]): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: SemanticShorthandItem[BreadcrumbSectionProps]*): Self = this.set("sections", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: SemanticShorthandCollection[BreadcrumbSectionProps]): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
    
    @scala.inline
    def setSize(value: mini | tiny | small | large | big | huge | massive): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
