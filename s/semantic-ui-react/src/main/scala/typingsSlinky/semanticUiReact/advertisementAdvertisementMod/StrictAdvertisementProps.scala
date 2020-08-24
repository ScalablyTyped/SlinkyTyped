package typingsSlinky.semanticUiReact.advertisementAdvertisementMod

import slinky.core.facade.ReactElement
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

@js.native
trait StrictAdvertisementProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Center the advertisement. */
  var centered: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Text to be displayed on the advertisement. */
  var test: js.UndefOr[Boolean | String | Double] = js.native
  /** Varies the size of the advertisement. */
  var unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`) = js.native
}

object StrictAdvertisementProps {
  @scala.inline
  def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
  ): StrictAdvertisementProps = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAdvertisementProps]
  }
  @scala.inline
  implicit class StrictAdvertisementPropsOps[Self <: StrictAdvertisementProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUnit(
      value: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
    ): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setTest(value: Boolean | String | Double): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
  
}

