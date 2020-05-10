package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.ComponentPlaygroundProps
import typingsSlinky.spectacle.mod.themeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentPlayground {
  @JSImport("spectacle", "ComponentPlayground")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.spectacle.mod.ComponentPlayground] {
    @scala.inline
    def code(value: String): this.type = set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def previewBackgroundColor(value: String): this.type = set("previewBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def scope(value: js.Object): this.type = set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: themeType): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def transformCode(value: /* code */ String => String): this.type = set("transformCode", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ComponentPlaygroundProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ComponentPlayground.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

