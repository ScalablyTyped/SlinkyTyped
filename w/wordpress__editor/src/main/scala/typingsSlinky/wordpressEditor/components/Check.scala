package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.postTrashCheckMod.PostTrashCheck.Props
import typingsSlinky.wordpressEditor.postTrashCheckMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Check {
  @JSImport("@wordpress/editor/components/post-trash/check", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_691280260[^] = new SharedBuilder_Props_691280260[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Check.type): SharedBuilder_Props_691280260[^] = new SharedBuilder_Props_691280260[^](js.Array(this.component, js.Dictionary.empty))()
}

