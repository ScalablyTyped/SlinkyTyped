package typingsSlinky.stackframe.StackFrame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  def getArgs(): js.Array[_]
  def getColumnNumber(): Double
  def getEvalOrigin(): typingsSlinky.stackframe.StackFrame.StackFrame
  def getFileName(): String
  def getFunctionName(): String
  def getIsConstructor(): Boolean
  def getIsEval(): Boolean
  def getIsNative(): Boolean
  def getIsToplevel(): Boolean
  def getLineNumber(): Double
  def getSource(): String
  def setArgs(args: js.Array[_]): Unit
  def setColumnNumber(columnNumber: Double): Unit
  def setEvalOrigin(stackframe: typingsSlinky.stackframe.StackFrame.StackFrame): Unit
  def setFileName(fileName: String): Unit
  def setFunctionName(functionName: String): Unit
  def setIsConstructor(isConstructor: Boolean): Unit
  def setIsEval(isEval: Boolean): Unit
  def setIsNative(isNative: Boolean): Unit
  def setIsToplevel(isToplevel: Boolean): Unit
  def setLineNumber(lineNumber: Double): Unit
  def setSource(source: String): Unit
}

object StackFrame {
  @scala.inline
  def apply(
    getArgs: () => js.Array[_],
    getColumnNumber: () => Double,
    getEvalOrigin: () => typingsSlinky.stackframe.StackFrame.StackFrame,
    getFileName: () => String,
    getFunctionName: () => String,
    getIsConstructor: () => Boolean,
    getIsEval: () => Boolean,
    getIsNative: () => Boolean,
    getIsToplevel: () => Boolean,
    getLineNumber: () => Double,
    getSource: () => String,
    setArgs: js.Array[_] => Unit,
    setColumnNumber: Double => Unit,
    setEvalOrigin: typingsSlinky.stackframe.StackFrame.StackFrame => Unit,
    setFileName: String => Unit,
    setFunctionName: String => Unit,
    setIsConstructor: Boolean => Unit,
    setIsEval: Boolean => Unit,
    setIsNative: Boolean => Unit,
    setIsToplevel: Boolean => Unit,
    setLineNumber: Double => Unit,
    setSource: String => Unit
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getArgs = js.Any.fromFunction0(getArgs), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getIsConstructor = js.Any.fromFunction0(getIsConstructor), getIsEval = js.Any.fromFunction0(getIsEval), getIsNative = js.Any.fromFunction0(getIsNative), getIsToplevel = js.Any.fromFunction0(getIsToplevel), getLineNumber = js.Any.fromFunction0(getLineNumber), getSource = js.Any.fromFunction0(getSource), setArgs = js.Any.fromFunction1(setArgs), setColumnNumber = js.Any.fromFunction1(setColumnNumber), setEvalOrigin = js.Any.fromFunction1(setEvalOrigin), setFileName = js.Any.fromFunction1(setFileName), setFunctionName = js.Any.fromFunction1(setFunctionName), setIsConstructor = js.Any.fromFunction1(setIsConstructor), setIsEval = js.Any.fromFunction1(setIsEval), setIsNative = js.Any.fromFunction1(setIsNative), setIsToplevel = js.Any.fromFunction1(setIsToplevel), setLineNumber = js.Any.fromFunction1(setLineNumber), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[StackFrame]
  }
}

