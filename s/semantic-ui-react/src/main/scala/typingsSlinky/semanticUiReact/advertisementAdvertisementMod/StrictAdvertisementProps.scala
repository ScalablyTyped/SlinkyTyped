package typingsSlinky.semanticUiReact.advertisementAdvertisementMod

import slinky.core.TagMod
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`half banner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`half page`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`large leaderboard`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`large rectangle`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`medium rectangle`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`mobile banner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`mobile leaderboard`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`small button`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`small rectangle`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`small square`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`square button`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top banner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`vertical banner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`vertical rectangle`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`wide skyscraper`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.banner
import typingsSlinky.semanticUiReact.semanticUiReactStrings.billboard
import typingsSlinky.semanticUiReact.semanticUiReactStrings.button
import typingsSlinky.semanticUiReact.semanticUiReactStrings.leaderboard
import typingsSlinky.semanticUiReact.semanticUiReactStrings.netboard
import typingsSlinky.semanticUiReact.semanticUiReactStrings.panorama
import typingsSlinky.semanticUiReact.semanticUiReactStrings.skyscraper
import typingsSlinky.semanticUiReact.semanticUiReactStrings.square
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
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAdvertisementProps]
  }
}

