package typingsSlinky.semanticUiReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.semanticUiReact.paginationItemMod.PaginationItemProps
import typingsSlinky.semanticUiReact.paginationItemMod.default
import typingsSlinky.semanticUiReact.semanticUiReactStrings.ellipsisItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.firstItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.lastItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.nextItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.pageItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.prevItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PaginationItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("semantic-ui-react/dist/commonjs/addons/Pagination/PaginationItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit = null,
    onKeyDown: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit = null,
    `type`: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.a.tag.type, 
  typingsSlinky.semanticUiReact.paginationItemMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PaginationItemProps
}

