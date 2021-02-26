package typingsSlinky.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesDirection extends StObject {
  
  var properties: Direction = js.native
  
  var value: js.Array[_] = js.native
}
object PropertiesDirection {
  
  @scala.inline
  def apply(properties: Direction, value: js.Array[_]): PropertiesDirection = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDirection]
  }
  
  @scala.inline
  implicit class PropertiesDirectionMutableBuilder[Self <: PropertiesDirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Direction): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
