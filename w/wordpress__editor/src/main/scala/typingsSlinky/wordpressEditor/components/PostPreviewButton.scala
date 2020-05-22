package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditor.mod.PostPreviewButton.^
import typingsSlinky.wordpressEditor.postPreviewButtonMod.PostPreviewButton.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PostPreviewButton {
  @JSImport("@wordpress/editor", "PostPreviewButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def forceIsAutosaveable(value: Boolean): this.type = set("forceIsAutosaveable", value.asInstanceOf[js.Any])
    @scala.inline
    def forcePreviewLink(value: String): this.type = set("forcePreviewLink", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PostPreviewButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

