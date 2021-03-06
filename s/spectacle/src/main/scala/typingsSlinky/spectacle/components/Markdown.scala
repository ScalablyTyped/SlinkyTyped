package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.anon.ContainsSlides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Markdown {
  
  @JSImport("spectacle", "Markdown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def containsSlides(value: Boolean): this.type = set("containsSlides", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Markdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ContainsSlides): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
