package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.mod.PostFeaturedImage.^
import typingsSlinky.wordpressEditor.postFeaturedImageMod.PostFeaturedImage.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PostFeaturedImage {
  @JSImport("@wordpress/editor", "PostFeaturedImage")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PostFeaturedImage.type): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, js.Dictionary.empty))()
}

