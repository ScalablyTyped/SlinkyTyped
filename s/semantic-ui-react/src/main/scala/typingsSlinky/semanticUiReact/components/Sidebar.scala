package typingsSlinky.semanticUiReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`scale down`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`slide along`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`slide out`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very thin`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very wide`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.overlay
import typingsSlinky.semanticUiReact.semanticUiReactStrings.push
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.thin
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.uncover
import typingsSlinky.semanticUiReact.semanticUiReactStrings.wide
import typingsSlinky.semanticUiReact.sidebarMod.default
import typingsSlinky.semanticUiReact.sidebarSidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
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
    width: (`very thin`) | thin | wide | (`very wide`) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
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
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.semanticUiReact.sidebarMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SidebarProps
}

