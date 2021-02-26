package typingsSlinky.wordpressEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.checkMod.MediaUploadCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaUploadCheck {
  
  @JSImport("@wordpress/editor", "MediaUploadCheck")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def fallback(value: ReactElement): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fallbackReactElement(value: ReactElement): this.type = set("fallback", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MediaUploadCheck.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
