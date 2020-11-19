package typingsSlinky.wordpressEditor.components

import typingsSlinky.std.Record
import typingsSlinky.wordpressEditor.providerMod.EditorProvider.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditorProvider {
  
  @JSImport("@wordpress/editor", "EditorProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1522940978 = new SharedBuilder_Props1522940978(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(post: Record[String, _]): SharedBuilder_Props1522940978 = {
    val __props = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    new SharedBuilder_Props1522940978(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
