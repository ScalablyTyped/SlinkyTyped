package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.placeholderImageMod.PlaceholderImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PlaceholderImage {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderImage", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def rectangular(value: Boolean): this.type = set("rectangular", value.asInstanceOf[js.Any])
    @scala.inline
    def square(value: Boolean): this.type = set("square", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PlaceholderImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PlaceholderImage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

