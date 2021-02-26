package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginImport extends StObject {
  
  var name: java.lang.String = js.native
}
object PluginImport {
  
  @scala.inline
  def apply(name: java.lang.String): PluginImport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginImport]
  }
  
  @scala.inline
  implicit class PluginImportMutableBuilder[Self <: PluginImport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
