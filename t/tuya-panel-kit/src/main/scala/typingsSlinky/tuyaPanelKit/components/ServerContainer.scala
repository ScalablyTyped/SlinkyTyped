package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.tuyaPanelKit.anon.Pathname
import typingsSlinky.tuyaPanelKit.anon.ServerContextTypechildren
import typingsSlinky.tuyaPanelKit.nativeTypesMod.ServerContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServerContainer {
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "ServerContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ServerContainerRef] {
    
    @scala.inline
    def location(value: Pathname): this.type = set("location", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ServerContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ServerContextTypechildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
