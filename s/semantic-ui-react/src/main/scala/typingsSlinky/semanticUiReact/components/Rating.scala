package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.mod.Rating.IconCls
import typingsSlinky.semanticUiReact.ratingIconMod.RatingIconProps
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rating {
  
  object Icon {
    
    @JSImport("semantic-ui-react", "Rating.Icon")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Icon.type): SharedBuilder_RatingIconProps440953503[IconCls] = new SharedBuilder_RatingIconProps440953503[IconCls](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RatingIconProps): SharedBuilder_RatingIconProps440953503[IconCls] = new SharedBuilder_RatingIconProps440953503[IconCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Rating")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Rating] {
    
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
  
  implicit def make(companion: Rating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
