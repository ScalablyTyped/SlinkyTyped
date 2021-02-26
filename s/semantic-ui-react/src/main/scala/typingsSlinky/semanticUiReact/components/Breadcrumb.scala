package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.semanticUiReact.breadcrumbDividerMod.BreadcrumbDividerProps
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumb {
  
  object Divider {
    
    @JSImport("semantic-ui-react", "Breadcrumb.Divider")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Divider.type): SharedBuilder_BreadcrumbDividerProps_1812549402 = new SharedBuilder_BreadcrumbDividerProps_1812549402(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BreadcrumbDividerProps): SharedBuilder_BreadcrumbDividerProps_1812549402 = new SharedBuilder_BreadcrumbDividerProps_1812549402(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Section {
    
    @JSImport("semantic-ui-react", "Breadcrumb.Section")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Section.type): SharedBuilder_BreadcrumbSectionProps803953206[typingsSlinky.semanticUiReact.mod.Breadcrumb.Section] = new SharedBuilder_BreadcrumbSectionProps803953206[typingsSlinky.semanticUiReact.mod.Breadcrumb.Section](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BreadcrumbSectionProps): SharedBuilder_BreadcrumbSectionProps803953206[typingsSlinky.semanticUiReact.mod.Breadcrumb.Section] = new SharedBuilder_BreadcrumbSectionProps803953206[typingsSlinky.semanticUiReact.mod.Breadcrumb.Section](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Breadcrumb")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Breadcrumb] {
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def divider(value: SemanticShorthandContent): this.type = set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dividerReactElement(value: ReactElement): this.type = set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconFunction3(
      value: (/* component */ ReactElement, IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sections(value: SemanticShorthandCollection[BreadcrumbSectionProps]): this.type = set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sectionsVarargs(value: SemanticShorthandItem[BreadcrumbSectionProps]*): this.type = set("sections", js.Array(value :_*))
    
    @scala.inline
    def size(value: mini | tiny | small | large | big | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Breadcrumb.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
