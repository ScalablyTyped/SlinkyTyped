package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.mod.PostTrashCheck.^
import typingsSlinky.wordpressEditor.postTrashCheckMod.PostTrashCheck.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PostTrashCheck {
  @JSImport("@wordpress/editor", "PostTrashCheck")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_691280260[^] = new SharedBuilder_Props_691280260[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PostTrashCheck.type): SharedBuilder_Props_691280260[^] = new SharedBuilder_Props_691280260[^](js.Array(this.component, js.Dictionary.empty))()
}

