package typingsSlinky.spectacle.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.spectacle.spectacleMod.DeckProps
import typingsSlinky.spectacle.spectacleMod.Theme
import typingsSlinky.spectacle.spectacleMod.progressType
import typingsSlinky.spectacle.spectacleMod.transitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Deck
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.spectacle.spectacleMod.Deck] {
  @JSImport("spectacle", "Deck")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: controls */
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayDuration: Int | Double = null,
    autoplayLoop: js.UndefOr[Boolean] = js.undefined,
    autoplayOnStart: js.UndefOr[Boolean] = js.undefined,
    contentHeight: String = null,
    contentWidth: String = null,
    globalStyles: js.UndefOr[Boolean] = js.undefined,
    history: js.Any = null,
    onStateChange: (/* previousState */ js.UndefOr[String], /* nextState */ js.UndefOr[String]) => Unit = null,
    progress: progressType = null,
    showFullscreenControl: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null,
    transition: js.Array[transitionType] = null,
    transitionDuration: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.spectacle.spectacleMod.Deck] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayDuration != null) __obj.updateDynamic("autoplayDuration")(autoplayDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayLoop)) __obj.updateDynamic("autoplayLoop")(autoplayLoop.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayOnStart)) __obj.updateDynamic("autoplayOnStart")(autoplayOnStart.asInstanceOf[js.Any])
    if (contentHeight != null) __obj.updateDynamic("contentHeight")(contentHeight.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(globalStyles)) __obj.updateDynamic("globalStyles")(globalStyles.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction2(onStateChange))
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (!js.isUndefined(showFullscreenControl)) __obj.updateDynamic("showFullscreenControl")(showFullscreenControl.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DeckProps
}

