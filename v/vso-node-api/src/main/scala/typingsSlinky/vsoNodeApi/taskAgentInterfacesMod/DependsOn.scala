package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependsOn extends StObject {
  
  var input: String = js.native
  
  var map: js.Array[DependencyBinding] = js.native
}
object DependsOn {
  
  @scala.inline
  def apply(input: String, map: js.Array[DependencyBinding]): DependsOn = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependsOn]
  }
  
  @scala.inline
  implicit class DependsOnMutableBuilder[Self <: DependsOn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: js.Array[DependencyBinding]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapVarargs(value: DependencyBinding*): Self = StObject.set(x, "map", js.Array(value :_*))
  }
}
