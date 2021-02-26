package typingsSlinky.wordpressEditor.components

import typingsSlinky.std.Record
import typingsSlinky.wordpressEditor.providerMod.EditorProvider.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @scala.inline
  def apply(post: Record[String, _]): SharedBuilder_Props1522940978 = {
    val __props = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    new SharedBuilder_Props1522940978(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/editor/components/provider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props1522940978 = new SharedBuilder_Props1522940978(js.Array(this.component, p.asInstanceOf[js.Any]))
}
