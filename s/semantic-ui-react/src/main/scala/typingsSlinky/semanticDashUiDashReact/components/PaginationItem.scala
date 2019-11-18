package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.default
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.ellipsisItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.firstItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.lastItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.nextItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.pageItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.prevItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: disabled */
object PaginationItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit = null,
    onKeyDown: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit = null,
    `type`: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationItemProps
}

