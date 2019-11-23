package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsPaginationMod.default
import typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationMod.PaginationProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsPaginationMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    totalPages: Double | String,
    activePage: Double | String = null,
    `aria-label`: String = null,
    boundaryRange: Double | String = null,
    defaultActivePage: Double | String = null,
    ellipsisItem: SemanticShorthandItem[PaginationItemProps] = null,
    firstItem: SemanticShorthandItem[PaginationItemProps] = null,
    lastItem: SemanticShorthandItem[PaginationItemProps] = null,
    nextItem: SemanticShorthandItem[PaginationItemProps] = null,
    onPageChange: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationProps) => Unit = null,
    pageItem: SemanticShorthandItem[PaginationItemProps] = null,
    prevItem: SemanticShorthandItem[PaginationItemProps] = null,
    siblingRange: Double | String = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    if (activePage != null) __obj.updateDynamic("activePage")(activePage.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (boundaryRange != null) __obj.updateDynamic("boundaryRange")(boundaryRange.asInstanceOf[js.Any])
    if (defaultActivePage != null) __obj.updateDynamic("defaultActivePage")(defaultActivePage.asInstanceOf[js.Any])
    if (ellipsisItem != null) __obj.updateDynamic("ellipsisItem")(ellipsisItem.asInstanceOf[js.Any])
    if (firstItem != null) __obj.updateDynamic("firstItem")(firstItem.asInstanceOf[js.Any])
    if (lastItem != null) __obj.updateDynamic("lastItem")(lastItem.asInstanceOf[js.Any])
    if (nextItem != null) __obj.updateDynamic("nextItem")(nextItem.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction2(onPageChange))
    if (pageItem != null) __obj.updateDynamic("pageItem")(pageItem.asInstanceOf[js.Any])
    if (prevItem != null) __obj.updateDynamic("prevItem")(prevItem.asInstanceOf[js.Any])
    if (siblingRange != null) __obj.updateDynamic("siblingRange")(siblingRange.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProps
}

