package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.ImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Image {
  @JSImport("spectacle", "Image")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.spectacle.mod.Image] {
    @scala.inline
    def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def display(value: String): this.type = set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Double | String): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: Double | String): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Image.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

