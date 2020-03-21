package typingsSlinky.tinySliderReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.std.Event_
import typingsSlinky.tinySliderReact.mod.TinySliderInfo
import typingsSlinky.tinySliderReact.mod.TinySliderProps
import typingsSlinky.tinySliderReact.mod.TinySliderSettings
import typingsSlinky.tinySliderReact.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TinySliderReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("tiny-slider-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onClick: (/* slideClicked */ Double, /* info */ String, /* event */ Event_) => Unit = null,
    onIndexChanged: /* info */ TinySliderInfo => Unit = null,
    onTouchEnd: /* info */ TinySliderInfo => Unit = null,
    onTouchMove: /* info */ TinySliderInfo => Unit = null,
    onTouchStart: /* info */ TinySliderInfo => Unit = null,
    onTransitionEnd: /* info */ TinySliderInfo => Unit = null,
    onTransitionStart: /* info */ TinySliderInfo => Unit = null,
    settings: TinySliderSettings = null,
    startIndex: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onIndexChanged != null) __obj.updateDynamic("onIndexChanged")(js.Any.fromFunction1(onIndexChanged))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1(onTransitionStart))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.tinySliderReact.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TinySliderProps
}

