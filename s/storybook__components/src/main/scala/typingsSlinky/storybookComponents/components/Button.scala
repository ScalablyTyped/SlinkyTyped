package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.storybookComponents.buttonButtonMod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("@storybook/components", "Button")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Any with js.Object] {
    @scala.inline
    def containsIcon(value: Boolean): this.type = set("containsIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def inForm(value: Boolean): this.type = set("inForm", value.asInstanceOf[js.Any])
    @scala.inline
    def isLink(value: Boolean): this.type = set("isLink", value.asInstanceOf[js.Any])
    @scala.inline
    def outline(value: Boolean): this.type = set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def primary(value: Boolean): this.type = set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def tertiary(value: Boolean): this.type = set("tertiary", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonProps with RefAttributes[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Button.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

