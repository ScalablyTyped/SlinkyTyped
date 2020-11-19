package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Helpers")
@js.native
class Helpers () extends js.Object
/* static members */
@JSImport("survey-knockout", "Helpers")
@js.native
object Helpers extends js.Object {
  
  def createCopy(obj: js.Any): js.Any = js.native
  
  def getMaxLength(maxLength: Double, surveyLength: Double): js.Any = js.native
  
  def getNumberByIndex(index: Double, startIndexStr: String): String = js.native
  
  def getUnbindValue(value: js.Any): js.Any = js.native
  
  def isArrayContainsEqual(x: js.Any, y: js.Any): Boolean = js.native
  
  def isArraysEqual(x: js.Any, y: js.Any): Boolean = js.native
  def isArraysEqual(x: js.Any, y: js.Any, ignoreOrder: Boolean): Boolean = js.native
  
  def isCharDigit(ch: String): Boolean = js.native
  
  def isCharNotLetterAndDigit(ch: String): Boolean = js.native
  
  def isConvertibleToNumber(value: js.Any): Boolean = js.native
  
  def isNumber(value: js.Any): Boolean = js.native
  
  def isTwoValueEquals(x: js.Any, y: js.Any): Boolean = js.native
  def isTwoValueEquals(x: js.Any, y: js.Any, ignoreOrder: Boolean): Boolean = js.native
  
  /**
    * A static methods that returns true if a value underfined, null, empty string or empty array.
    * @param value
    */
  def isValueEmpty(value: js.Any): Boolean = js.native
  
  def randomizeArray[T](array: js.Array[T]): js.Array[T] = js.native
}
