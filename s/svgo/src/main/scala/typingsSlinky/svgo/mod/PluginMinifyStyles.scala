package typingsSlinky.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginMinifyStyles extends PluginConfig {
  
  var minifyStyles: Boolean | js.Object = js.native
}
object PluginMinifyStyles {
  
  @scala.inline
  def apply(minifyStyles: Boolean | js.Object): PluginMinifyStyles = {
    val __obj = js.Dynamic.literal(minifyStyles = minifyStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMinifyStyles]
  }
  
  @scala.inline
  implicit class PluginMinifyStylesMutableBuilder[Self <: PluginMinifyStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinifyStyles(value: Boolean | js.Object): Self = StObject.set(x, "minifyStyles", value.asInstanceOf[js.Any])
  }
}
