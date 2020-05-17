package typingsSlinky.stackframe.StackFrame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackFrame extends js.Object {
  def getArgs(): js.Array[_] = js.native
  def getColumnNumber(): Double = js.native
  def getEvalOrigin(): typingsSlinky.stackframe.StackFrame.StackFrame = js.native
  def getFileName(): String = js.native
  def getFunctionName(): String = js.native
  def getIsConstructor(): Boolean = js.native
  def getIsEval(): Boolean = js.native
  def getIsNative(): Boolean = js.native
  def getIsToplevel(): Boolean = js.native
  def getLineNumber(): Double = js.native
  def getSource(): String = js.native
  def setArgs(args: js.Array[_]): Unit = js.native
  def setColumnNumber(columnNumber: Double): Unit = js.native
  def setEvalOrigin(stackframe: typingsSlinky.stackframe.StackFrame.StackFrame): Unit = js.native
  def setFileName(fileName: String): Unit = js.native
  def setFunctionName(functionName: String): Unit = js.native
  def setIsConstructor(isConstructor: Boolean): Unit = js.native
  def setIsEval(isEval: Boolean): Unit = js.native
  def setIsNative(isNative: Boolean): Unit = js.native
  def setIsToplevel(isToplevel: Boolean): Unit = js.native
  def setLineNumber(lineNumber: Double): Unit = js.native
  def setSource(source: String): Unit = js.native
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
  @scala.inline
  implicit class StackFrameOps[Self <: typingsSlinky.stackframe.StackFrame.StackFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetArgs(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArgs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColumnNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEvalOrigin(value: () => typingsSlinky.stackframe.StackFrame.StackFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEvalOrigin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFileName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFunctionName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFunctionName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsConstructor(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsConstructor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsEval(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsEval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsNative(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsNative")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsToplevel(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsToplevel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSource(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetArgs(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArgs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetColumnNumber(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumnNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEvalOrigin(value: typingsSlinky.stackframe.StackFrame.StackFrame => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEvalOrigin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFileName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFunctionName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFunctionName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsConstructor(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsConstructor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsEval(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsEval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsNative(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsNative")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsToplevel(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsToplevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLineNumber(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLineNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSource(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSource")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

