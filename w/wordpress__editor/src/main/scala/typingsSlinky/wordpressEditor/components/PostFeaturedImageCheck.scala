package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditor.postFeaturedImageCheckMod.PostFeaturedImageCheck.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PostFeaturedImageCheck {
  @JSImport("@wordpress/editor", "PostFeaturedImageCheck")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def supportKeysVarargs(value: String*): this.type = set("supportKeys", js.Array(value :_*))
    @scala.inline
    def supportKeys(value: String | js.Array[String]): this.type = set("supportKeys", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PostFeaturedImageCheck.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

