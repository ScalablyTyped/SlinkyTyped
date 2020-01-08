package typingsSlinky.tinyDashSliderDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.tinyDashSliderDashReact.tinyDashSliderDashReactMod.TinySliderInfo
import typingsSlinky.tinyDashSliderDashReact.tinyDashSliderDashReactMod.TinySliderProps
import typingsSlinky.tinyDashSliderDashReact.tinyDashSliderDashReactMod.TinySliderSettings
import typingsSlinky.tinyDashSliderDashReact.tinyDashSliderDashReactMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TinyDashSliderDashReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("tiny-slider-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd */
  def apply(
    onClick: (/* slideClicked */ Double, /* info */ String, /* event */ Event) => Unit = null,
    onIndexChanged: /* info */ TinySliderInfo => Unit = null,
    onTransitionStart: /* info */ TinySliderInfo => Unit = null,
    settings: TinySliderSettings = null,
    startIndex: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onIndexChanged != null) __obj.updateDynamic("onIndexChanged")(js.Any.fromFunction1(onIndexChanged))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1(onTransitionStart))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.tinyDashSliderDashReact.tinyDashSliderDashReactMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TinySliderProps
}

