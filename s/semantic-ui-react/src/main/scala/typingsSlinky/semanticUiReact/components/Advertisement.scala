package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.advertisementAdvertisementMod.AdvertisementProps
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

object Advertisement {
  @JSImport("semantic-ui-react", "Advertisement")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def test(value: Boolean | String | Double): this.type = set("test", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AdvertisementProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
  ): Builder = {
    val __props = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AdvertisementProps]))
  }
}

