package typingsSlinky.wordpressEditor.components

import typingsSlinky.std.Record
import typingsSlinky.wordpressEditor.mod.EditorProvider.^
import typingsSlinky.wordpressEditor.providerMod.EditorProvider.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditorProvider {
  @JSImport("@wordpress/editor", "EditorProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1909593046[^] = new SharedBuilder_Props1909593046[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(post: Record[String, _]): SharedBuilder_Props1909593046[^] = {
    val __props = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    new SharedBuilder_Props1909593046[^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

