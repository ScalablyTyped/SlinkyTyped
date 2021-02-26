package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Double extends StObject {
  
  var boolean: scala.Double = js.native
  
  var dateTime: scala.Double = js.native
  
  var double: scala.Double = js.native
  
  var integer: scala.Double = js.native
  
  var plainText: scala.Double = js.native
  
  var string: scala.Double = js.native
  
  var treePath: scala.Double = js.native
}
object Double {
  
  @scala.inline
  def apply(
    boolean: scala.Double,
    dateTime: scala.Double,
    double: scala.Double,
    integer: scala.Double,
    plainText: scala.Double,
    string: scala.Double,
    treePath: scala.Double
  ): Double = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Double]
  }
  
  @scala.inline
  implicit class DoubleMutableBuilder[Self <: Double] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolean(value: scala.Double): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: scala.Double): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDouble(value: scala.Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteger(value: scala.Double): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainText(value: scala.Double): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreePath(value: scala.Double): Self = StObject.set(x, "treePath", value.asInstanceOf[js.Any])
  }
}
