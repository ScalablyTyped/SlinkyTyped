package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeResult extends StObject {
  
  def get_value(): js.Date = js.native
}
object DateTimeResult {
  
  @scala.inline
  def apply(get_value: () => js.Date): DateTimeResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[DateTimeResult]
  }
  
  @scala.inline
  implicit class DateTimeResultMutableBuilder[Self <: DateTimeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_value(value: () => js.Date): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
