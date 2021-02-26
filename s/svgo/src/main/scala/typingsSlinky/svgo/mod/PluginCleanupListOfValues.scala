package typingsSlinky.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginCleanupListOfValues extends PluginConfig {
  
  var cleanupListOfValues: Boolean | js.Object = js.native
}
object PluginCleanupListOfValues {
  
  @scala.inline
  def apply(cleanupListOfValues: Boolean | js.Object): PluginCleanupListOfValues = {
    val __obj = js.Dynamic.literal(cleanupListOfValues = cleanupListOfValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupListOfValues]
  }
  
  @scala.inline
  implicit class PluginCleanupListOfValuesMutableBuilder[Self <: PluginCleanupListOfValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanupListOfValues(value: Boolean | js.Object): Self = StObject.set(x, "cleanupListOfValues", value.asInstanceOf[js.Any])
  }
}
