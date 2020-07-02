package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.paginationItemMod.PaginationItemProps
import typingsSlinky.semanticUiReact.paginationMod.default
import typingsSlinky.semanticUiReact.paginationPaginationMod.PaginationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination {
  @JSImport("semantic-ui-react/dist/commonjs/addons/Pagination", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activePage(value: Double | String): this.type = set("activePage", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def boundaryRange(value: Double | String): this.type = set("boundaryRange", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultActivePage(value: Double | String): this.type = set("defaultActivePage", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def ellipsisItemReactElement(value: ReactElement): this.type = set("ellipsisItem", value.asInstanceOf[js.Any])
    @scala.inline
    def ellipsisItemFunction3(
      value: (/* component */ ReactType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("ellipsisItem", js.Any.fromFunction3(value))
    @scala.inline
    def ellipsisItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("ellipsisItem", value.asInstanceOf[js.Any])
    @scala.inline
    def firstItemReactElement(value: ReactElement): this.type = set("firstItem", value.asInstanceOf[js.Any])
    @scala.inline
    def firstItemFunction3(
      value: (/* component */ ReactType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("firstItem", js.Any.fromFunction3(value))
    @scala.inline
    def firstItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("firstItem", value.asInstanceOf[js.Any])
    @scala.inline
    def lastItemReactElement(value: ReactElement): this.type = set("lastItem", value.asInstanceOf[js.Any])
    @scala.inline
    def lastItemFunction3(
      value: (/* component */ ReactType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("lastItem", js.Any.fromFunction3(value))
    @scala.inline
    def lastItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("lastItem", value.asInstanceOf[js.Any])
    @scala.inline
    def nextItemReactElement(value: ReactElement): this.type = set("nextItem", value.asInstanceOf[js.Any])
    @scala.inline
    def nextItemFunction3(
      value: (/* component */ ReactType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("nextItem", js.Any.fromFunction3(value))
    @scala.inline
    def nextItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("nextItem", value.asInstanceOf[js.Any])
    @scala.inline
    def onPageChange(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationProps) => Unit): this.type = set("onPageChange", js.Any.fromFunction2(value))
    @scala.inline
    def pageItemReactElement(value: ReactElement): this.type = set("pageItem", value.asInstanceOf[js.Any])
    @scala.inline
    def pageItemFunction3(
      value: (/* component */ ReactType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("pageItem", js.Any.fromFunction3(value))
    @scala.inline
    def pageItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("pageItem", value.asInstanceOf[js.Any])
    @scala.inline
    def prevItemReactElement(value: ReactElement): this.type = set("prevItem", value.asInstanceOf[js.Any])
    @scala.inline
    def prevItemFunction3(
      value: (/* component */ ReactType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("prevItem", js.Any.fromFunction3(value))
    @scala.inline
    def prevItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("prevItem", value.asInstanceOf[js.Any])
    @scala.inline
    def siblingRange(value: Double | String): this.type = set("siblingRange", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(totalPages: Double | String): Builder = {
    val __props = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
}

