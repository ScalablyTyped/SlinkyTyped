package typingsSlinky.ssri.anon

import typingsSlinky.ssri.ssriBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSingle extends StObject {
  
  var options: js.UndefOr[js.Array[String]] = js.native
  
  var single: `true` = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object OptionsSingle {
  
  @scala.inline
  def apply(single: `true`): OptionsSingle = {
    val __obj = js.Dynamic.literal(single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSingle]
  }
  
  @scala.inline
  implicit class OptionsSingleMutableBuilder[Self <: OptionsSingle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSingle(value: `true`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
