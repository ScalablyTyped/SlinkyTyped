package typingsSlinky.semanticDashUiDashReact.distCommonjsViewsAdvertisementAdvertisementMod

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

trait StrictAdvertisementProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Center the advertisement. */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Text to be displayed on the advertisement. */
  var test: js.UndefOr[Boolean | String | Double] = js.undefined
  /** Varies the size of the advertisement. */
  var unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
}

object StrictAdvertisementProps {
  @scala.inline
  def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`),
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    test: Boolean | String | Double = null
  ): StrictAdvertisementProps = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAdvertisementProps]
  }
}

