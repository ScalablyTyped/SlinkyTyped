package typingsSlinky.twineSugarcube.passageMod

import typingsSlinky.twineSugarcube.extensionsMod.global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassageBase extends js.Object {
  
  /**
    * The tags of the passage.
    * @since 2.0.0
    */
  var tags: Array[String] = js.native
  
  /**
    * The raw text of the passage.
    * @since 2.0.0
    */
  var text: String = js.native
  
  /**
    * The title of the passage.
    * @since 2.0.0
    */
  var title: String = js.native
}
object PassageBase {
  
  @scala.inline
  def apply(tags: Array[String], text: String, title: String): PassageBase = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassageBase]
  }
  
  @scala.inline
  implicit class PassageBaseOps[Self <: PassageBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTags(value: Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
