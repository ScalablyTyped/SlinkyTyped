package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb {
  @JSImport("semantic-ui-react", "Breadcrumb")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Breadcrumb] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def dividerReactElement(value: ReactElement): this.type = set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def divider(value: SemanticShorthandContent): this.type = set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction3(
      value: (/* component */ ReactType[IconProps], IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def sectionsVarargs(value: SemanticShorthandItem[BreadcrumbSectionProps]*): this.type = set("sections", js.Array(value :_*))
    @scala.inline
    def sections(value: SemanticShorthandCollection[BreadcrumbSectionProps]): this.type = set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | tiny | small | large | big | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Breadcrumb.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Divider {
    @JSImport("semantic-ui-react", "Breadcrumb.Divider")
    @js.native
    object component extends js.Object
    
    def withProps(p: BreadcrumbDividerProps): SharedBuilder_BreadcrumbDividerProps_1812549402 = new SharedBuilder_BreadcrumbDividerProps_1812549402(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Divider.type): SharedBuilder_BreadcrumbDividerProps_1812549402 = new SharedBuilder_BreadcrumbDividerProps_1812549402(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Section {
    @JSImport("semantic-ui-react", "Breadcrumb.Section")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.a.tag.type, js.Object] {
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      @scala.inline
      def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
      @scala.inline
      def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
      @scala.inline
      def onClick(
        value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ BreadcrumbSectionProps) => Unit
      ): this.type = set("onClick", js.Any.fromFunction2(value))
    }
    
    def withProps(p: BreadcrumbSectionProps): typingsSlinky.semanticUiReact.components.Breadcrumb.Section.Builder = new typingsSlinky.semanticUiReact.components.Breadcrumb.Section.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Section.type): typingsSlinky.semanticUiReact.components.Breadcrumb.Section.Builder = new typingsSlinky.semanticUiReact.components.Breadcrumb.Section.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

