package typingsSlinky.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveDesc extends PluginConfig {
  
  var removeDesc: Boolean | js.Object = js.native
}
object PluginRemoveDesc {
  
  @scala.inline
  def apply(removeDesc: Boolean | js.Object): PluginRemoveDesc = {
    val __obj = js.Dynamic.literal(removeDesc = removeDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDesc]
  }
  
  @scala.inline
  implicit class PluginRemoveDescMutableBuilder[Self <: PluginRemoveDesc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveDesc(value: Boolean | js.Object): Self = StObject.set(x, "removeDesc", value.asInstanceOf[js.Any])
  }
}
