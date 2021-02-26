package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.anon.AutoFillHeight
import typingsSlinky.spectacle.anon.Plain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodePane {
  
  @scala.inline
  def apply(autoFillHeight: Boolean, language: String): Builder = {
    val __props = js.Dynamic.literal(autoFillHeight = autoFillHeight.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoFillHeight]))
  }
  
  @JSImport("spectacle", "CodePane")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightEnd(value: Double): this.type = set("highlightEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightStart(value: Double): this.type = set("highlightStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indentSize(value: Double): this.type = set("indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: Plain): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoFillHeight): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
