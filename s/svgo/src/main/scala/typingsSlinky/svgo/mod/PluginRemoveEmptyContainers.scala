package typingsSlinky.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveEmptyContainers extends PluginConfig {
  
  var removeEmptyContainers: Boolean | js.Object = js.native
}
object PluginRemoveEmptyContainers {
  
  @scala.inline
  def apply(removeEmptyContainers: Boolean | js.Object): PluginRemoveEmptyContainers = {
    val __obj = js.Dynamic.literal(removeEmptyContainers = removeEmptyContainers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyContainers]
  }
  
  @scala.inline
  implicit class PluginRemoveEmptyContainersMutableBuilder[Self <: PluginRemoveEmptyContainers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveEmptyContainers(value: Boolean | js.Object): Self = StObject.set(x, "removeEmptyContainers", value.asInstanceOf[js.Any])
  }
}
