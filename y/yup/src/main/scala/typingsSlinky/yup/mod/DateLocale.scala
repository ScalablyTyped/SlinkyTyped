package typingsSlinky.yup.mod

import typingsSlinky.yup.anon.PartialTestMessageParams
import typingsSlinky.yup.anon.`0`
import typingsSlinky.yup.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateLocale extends StObject {
  
  var max: js.UndefOr[TestOptionsMessage[`1`, _]] = js.native
  
  var min: js.UndefOr[TestOptionsMessage[`0`, _]] = js.native
}
object DateLocale {
  
  @scala.inline
  def apply(): DateLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateLocale]
  }
  
  @scala.inline
  implicit class DateLocaleMutableBuilder[Self <: DateLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: TestOptionsMessage[`1`, _]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFunction1(value: /* params */ `1` with PartialTestMessageParams => _): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: TestOptionsMessage[`0`, _]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFunction1(value: /* params */ `0` with PartialTestMessageParams => _): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
