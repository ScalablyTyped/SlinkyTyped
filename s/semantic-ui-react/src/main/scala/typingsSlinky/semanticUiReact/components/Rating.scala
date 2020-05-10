package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.ratingMod.default
import typingsSlinky.semanticUiReact.ratingRatingMod.RatingProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.auto
import typingsSlinky.semanticUiReact.semanticUiReactStrings.heart
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.star
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rating {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clearable(value: Boolean | auto): this.type = set("clearable", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultRating(value: Double | String): this.type = set("defaultRating", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: star | heart): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def maxRating(value: Double | String): this.type = set("maxRating", value.asInstanceOf[js.Any])
    @scala.inline
    def onRate(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ RatingProps) => Unit): this.type = set("onRate", js.Any.fromFunction2(value))
    @scala.inline
    def rating(value: Double | String): this.type = set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | tiny | small | large | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Rating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

