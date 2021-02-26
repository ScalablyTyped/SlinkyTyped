package typingsSlinky.yup.anon

import typingsSlinky.yup.mod.TestOptionsMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludeEmptyString extends StObject {
  
  var excludeEmptyString: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
}
object ExcludeEmptyString {
  
  @scala.inline
  def apply(): ExcludeEmptyString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeEmptyString]
  }
  
  @scala.inline
  implicit class ExcludeEmptyStringMutableBuilder[Self <: ExcludeEmptyString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeEmptyString(value: Boolean): Self = StObject.set(x, "excludeEmptyString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeEmptyStringUndefined: Self = StObject.set(x, "excludeEmptyString", js.undefined)
    
    @scala.inline
    def setMessage(value: TestOptionsMessage[Regex, _]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
