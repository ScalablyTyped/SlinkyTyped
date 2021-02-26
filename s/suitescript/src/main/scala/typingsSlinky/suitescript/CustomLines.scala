package typingsSlinky.suitescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLines extends StObject {
  
  def addNewLine(): CustomLine = js.native
  
  def getCount(): Double = js.native
  
  def getLine(index: Double): CustomLine = js.native
}
object CustomLines {
  
  @scala.inline
  def apply(addNewLine: () => CustomLine, getCount: () => Double, getLine: Double => CustomLine): CustomLines = {
    val __obj = js.Dynamic.literal(addNewLine = js.Any.fromFunction0(addNewLine), getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[CustomLines]
  }
  
  @scala.inline
  implicit class CustomLinesMutableBuilder[Self <: CustomLines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNewLine(value: () => CustomLine): Self = StObject.set(x, "addNewLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLine(value: Double => CustomLine): Self = StObject.set(x, "getLine", js.Any.fromFunction1(value))
  }
}
