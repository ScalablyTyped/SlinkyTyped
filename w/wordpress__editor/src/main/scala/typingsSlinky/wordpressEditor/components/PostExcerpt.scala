package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.postExcerptMod.PostExcerpt.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostExcerpt {
  
  @JSImport("@wordpress/editor", "PostExcerpt")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PostExcerpt.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
