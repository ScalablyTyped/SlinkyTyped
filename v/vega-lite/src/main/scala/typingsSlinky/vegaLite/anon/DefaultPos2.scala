package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.vegaLiteStrings.mid
import typingsSlinky.vegaLite.vegaLiteStrings.zeroOrMax
import typingsSlinky.vegaLite.vegaLiteStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultPos2 extends StObject {
  
  var defaultPos: zeroOrMin | zeroOrMax | mid = js.native
  
  var defaultPos2: zeroOrMin | zeroOrMax = js.native
  
  var range: Boolean = js.native
}
object DefaultPos2 {
  
  @scala.inline
  def apply(defaultPos: zeroOrMin | zeroOrMax | mid, defaultPos2: zeroOrMin | zeroOrMax, range: Boolean): DefaultPos2 = {
    val __obj = js.Dynamic.literal(defaultPos = defaultPos.asInstanceOf[js.Any], defaultPos2 = defaultPos2.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPos2]
  }
  
  @scala.inline
  implicit class DefaultPos2MutableBuilder[Self <: DefaultPos2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPos(value: zeroOrMin | zeroOrMax | mid): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPos2(value: zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
