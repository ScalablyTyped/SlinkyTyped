package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.contrastCheckerMod.ContrastChecker.Props
import typingsSlinky.wordpressBlockEditor.mod.ContrastChecker.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContrastChecker {
  @JSImport("@wordpress/block-editor", "ContrastChecker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def fallbackBackgroundColor(value: String): this.type = set("fallbackBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def fallbackTextColor(value: String): this.type = set("fallbackTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def isLargeText(value: Boolean): this.type = set("isLargeText", value.asInstanceOf[js.Any])
    @scala.inline
    def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ContrastChecker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

