package typingsSlinky.semanticDashUiDashReact.distCommonjsViewsAdvertisementAdvertisementMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
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

trait AdvertisementProps
  extends StrictAdvertisementProps
     with /* key */ StringDictionary[js.Any]

object AdvertisementProps {
  @scala.inline
  def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`),
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    test: Boolean | String | Double = null
  ): AdvertisementProps = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertisementProps]
  }
}

