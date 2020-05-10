package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.CSSProperties
import typingsSlinky.spectacle.mod.CodePaneProps
import typingsSlinky.spectacle.mod.themeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CodePane {
  @JSImport("spectacle", "CodePane")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.spectacle.mod.CodePane] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentEditable(value: Boolean): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def source(value: String): this.type = set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: themeType): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CodePaneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CodePane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

