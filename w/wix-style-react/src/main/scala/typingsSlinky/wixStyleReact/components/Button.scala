package typingsSlinky.wixStyleReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wixStyleReact.buttonMod.ButtonPriority
import typingsSlinky.wixStyleReact.buttonMod.ButtonProps
import typingsSlinky.wixStyleReact.buttonMod.ButtonSize
import typingsSlinky.wixStyleReact.buttonMod.ButtonSkin
import typingsSlinky.wixStyleReact.buttonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("wix-style-react/Button", JSImport.Default)
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
    def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def prefixIcon(value: ReactElement): this.type = set("prefixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def priority(value: ButtonPriority): this.type = set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: ButtonSize): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: ButtonSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Button.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

