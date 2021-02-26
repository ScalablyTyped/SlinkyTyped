package typingsSlinky.suitescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardLines extends StObject {
  
  def getCount(): Double = js.native
  
  def getLine(index: Double): StandardLine = js.native
}
object StandardLines {
  
  @scala.inline
  def apply(getCount: () => Double, getLine: Double => StandardLine): StandardLines = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[StandardLines]
  }
  
  @scala.inline
  implicit class StandardLinesMutableBuilder[Self <: StandardLines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLine(value: Double => StandardLine): Self = StObject.set(x, "getLine", js.Any.fromFunction1(value))
  }
}
