package typingsSlinky.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends StObject {
  
  def fromJS(expose: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, _]): Unit = js.native
  
  val unit: YogaUnit | Double = js.native
  
  val value: Double = js.native
}
object Value {
  
  @scala.inline
  def apply(
    fromJS: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, _] => Unit,
    unit: YogaUnit | Double,
    value: Double
  ): Value = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1(fromJS), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromJS(value: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, _] => Unit): Self = StObject.set(x, "fromJS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnit(value: YogaUnit | Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
