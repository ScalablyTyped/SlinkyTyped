package typingsSlinky.wixStyleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wixStyleReact.textMod.TextProps
import typingsSlinky.wixStyleReact.textMod.TextSize
import typingsSlinky.wixStyleReact.textMod.TextSkin
import typingsSlinky.wixStyleReact.textMod.TextWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text {
  @JSImport("wix-style-react/Text", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def ellipsis(value: Boolean): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def light(value: Boolean): this.type = set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def showTooltip(value: Boolean): this.type = set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: TextSize): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: TextSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def tagName(value: String): this.type = set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def weight(value: TextWeight): this.type = set("weight", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Text.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

