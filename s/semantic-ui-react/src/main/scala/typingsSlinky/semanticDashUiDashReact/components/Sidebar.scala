package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesSidebarMod.default
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesSidebarSidebarMod.SidebarProps
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`scale down`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`slide along`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`slide out`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.overlay
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.push
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.uncover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, width */
object Sidebar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.semanticDashUiDashReact.distCommonjsModulesSidebarMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animation: overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`) = null,
    as: js.Any = null,
    content: SemanticShorthandContent = null,
    direction: top | right | bottom | left = null,
    onHidden: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit = null,
    onHide: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit = null,
    onShow: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit = null,
    onVisible: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SidebarProps) => Unit = null,
    target: js.Object | ReactRef[HTMLElement] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction2(onHidden))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2(onShow))
    if (onVisible != null) __obj.updateDynamic("onVisible")(js.Any.fromFunction2(onVisible))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SidebarProps
}

