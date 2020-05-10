package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.MarkdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Markdown {
  @JSImport("spectacle", "Markdown")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.spectacle.mod.Markdown] {
    @scala.inline
    def source(value: String): this.type = set("source", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MarkdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Markdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

