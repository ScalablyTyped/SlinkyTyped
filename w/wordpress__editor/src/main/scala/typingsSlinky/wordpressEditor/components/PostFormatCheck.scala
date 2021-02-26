package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditor.postFormatCheckMod.PostFormatCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostFormatCheck {
  
  @JSImport("@wordpress/editor", "PostFormatCheck")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def supportKeys(value: String | js.Array[String]): this.type = set("supportKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def supportKeysVarargs(value: String*): this.type = set("supportKeys", js.Array(value :_*))
  }
  
  implicit def make(companion: PostFormatCheck.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
