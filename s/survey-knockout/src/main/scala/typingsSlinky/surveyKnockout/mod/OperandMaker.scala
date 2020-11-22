package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "OperandMaker")
@js.native
class OperandMaker () extends js.Object
/* static members */
@JSImport("survey-knockout", "OperandMaker")
@js.native
object OperandMaker extends js.Object {
  
  var binaryFunctions: HashTable[js.Function] = js.native
  
  def isBooleanValue(value: String): Boolean = js.native
  
  def isNumeric(value: String): Boolean = js.native
  
  def isSpaceString(str: String): Boolean = js.native
  
  def isTwoValueEquals(x: js.Any, y: js.Any): Boolean = js.native
  
  def operatorToString(operatorName: String): String = js.native
  
  def safeToString(operand: Operand, func: js.Function1[/* op */ Operand, String]): String = js.native
  
  var signs: HashTable[String] = js.native
  
  def throwInvalidOperatorError(op: String): Unit = js.native
  
  def toOperandString(value: String): String = js.native
  
  var unaryFunctions: HashTable[js.Function] = js.native
}
