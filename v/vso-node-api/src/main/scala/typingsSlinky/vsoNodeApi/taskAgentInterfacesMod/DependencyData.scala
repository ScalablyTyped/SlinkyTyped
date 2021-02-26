package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import typingsSlinky.vsoNodeApi.anon.KeyString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyData extends StObject {
  
  var input: String = js.native
  
  var map: js.Array[KeyString] = js.native
}
object DependencyData {
  
  @scala.inline
  def apply(input: String, map: js.Array[KeyString]): DependencyData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyData]
  }
  
  @scala.inline
  implicit class DependencyDataMutableBuilder[Self <: DependencyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: js.Array[KeyString]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapVarargs(value: KeyString*): Self = StObject.set(x, "map", js.Array(value :_*))
  }
}
