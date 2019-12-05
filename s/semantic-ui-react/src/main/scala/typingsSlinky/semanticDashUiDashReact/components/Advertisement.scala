package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsAdvertisementAdvertisementMod.AdvertisementProps
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`half banner`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`half page`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`large leaderboard`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`large rectangle`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`medium rectangle`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`mobile banner`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`mobile leaderboard`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small button`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small rectangle`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small square`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`square button`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`top banner`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`vertical banner`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`vertical rectangle`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`wide skyscraper`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.banner
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.billboard
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.button
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.leaderboard
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.netboard
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.panorama
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.skyscraper
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Advertisement
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("semantic-ui-react/dist/commonjs/views/Advertisement", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`),
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    test: Boolean | String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AdvertisementProps
}

