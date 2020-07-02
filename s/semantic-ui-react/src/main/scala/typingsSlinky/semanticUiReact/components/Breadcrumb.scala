package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.semanticUiReact.breadcrumbMod.default
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
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
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
    def sections(value: SemanticShorthandCollection[BreadcrumbSectionProps]): this.type = set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | tiny | small | large | big | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Breadcrumb.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

