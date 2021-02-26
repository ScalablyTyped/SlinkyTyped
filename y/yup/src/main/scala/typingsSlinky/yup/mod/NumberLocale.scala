package typingsSlinky.yup.mod

import typingsSlinky.yup.anon.Less
import typingsSlinky.yup.anon.Max
import typingsSlinky.yup.anon.Min
import typingsSlinky.yup.anon.More
import typingsSlinky.yup.anon.PartialTestMessageParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberLocale extends StObject {
  
  var integer: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  
  var lessThan: js.UndefOr[TestOptionsMessage[Less, _]] = js.native
  
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.native
  
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.native
  
  var moreThan: js.UndefOr[TestOptionsMessage[More, _]] = js.native
  
  var negative: js.UndefOr[TestOptionsMessage[Less, _]] = js.native
  
  var positive: js.UndefOr[TestOptionsMessage[More, _]] = js.native
}
object NumberLocale {
  
  @scala.inline
  def apply(): NumberLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberLocale]
  }
  
  @scala.inline
  implicit class NumberLocaleMutableBuilder[Self <: NumberLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteger(value: TestOptionsMessage[js.Object, _]): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    @scala.inline
    def setLessThan(value: TestOptionsMessage[Less, _]): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessThanFunction1(value: /* params */ Less with PartialTestMessageParams => _): Self = StObject.set(x, "lessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
    
    @scala.inline
    def setMax(value: TestOptionsMessage[Max, _]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFunction1(value: /* params */ Max with PartialTestMessageParams => _): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: TestOptionsMessage[Min, _]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFunction1(value: /* params */ Min with PartialTestMessageParams => _): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMoreThan(value: TestOptionsMessage[More, _]): Self = StObject.set(x, "moreThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreThanFunction1(value: /* params */ More with PartialTestMessageParams => _): Self = StObject.set(x, "moreThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoreThanUndefined: Self = StObject.set(x, "moreThan", js.undefined)
    
    @scala.inline
    def setNegative(value: TestOptionsMessage[Less, _]): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeFunction1(value: /* params */ Less with PartialTestMessageParams => _): Self = StObject.set(x, "negative", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    @scala.inline
    def setPositive(value: TestOptionsMessage[More, _]): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveFunction1(value: /* params */ More with PartialTestMessageParams => _): Self = StObject.set(x, "positive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
  }
}
