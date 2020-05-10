package typingsSlinky.stacktraceJs.StackTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackFrame extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.native
  var columnNumber: js.UndefOr[Double] = js.native
  var evalOrigin: js.UndefOr[StackFrame] = js.native
  var fileName: js.UndefOr[String] = js.native
  var functionName: js.UndefOr[String] = js.native
  var isConstructor: js.UndefOr[Boolean] = js.native
  var isEval: js.UndefOr[Boolean] = js.native
  var isNative: js.UndefOr[Boolean] = js.native
  var isTopLevel: js.UndefOr[Boolean] = js.native
  var lineNumber: js.UndefOr[Double] = js.native
  var source: js.UndefOr[String] = js.native
  def getArgs(): js.Array[_] = js.native
  def getColumnNumber(): Double = js.native
  def getEvalOrigin(): StackFrame = js.native
  def getFileName(): String = js.native
  def getFunctionName(): String = js.native
  def getIsConstructor(): Boolean = js.native
  def getIsEval(): Boolean = js.native
  def getIsNative(): Boolean = js.native
  def getIsTopLevel(): Boolean = js.native
  def getLineNumber(): Double = js.native
  def getSource(): String = js.native
  def setArgs(): Unit = js.native
  def setColumnNumber(): Unit = js.native
  def setEvalOrigin(): Unit = js.native
  def setFileName(): Unit = js.native
  def setFunctionName(): Unit = js.native
  def setIsConstructor(): Unit = js.native
  def setIsEval(): Unit = js.native
  def setIsNative(): Unit = js.native
  def setIsTopLevel(): Unit = js.native
  def setLineNumber(): Unit = js.native
  def setSource(): Unit = js.native
}

object StackFrame {
  @scala.inline
  def apply(
    getArgs: () => js.Array[_],
    getColumnNumber: () => Double,
    getEvalOrigin: () => StackFrame,
    getFileName: () => String,
    getFunctionName: () => String,
    getIsConstructor: () => Boolean,
    getIsEval: () => Boolean,
    getIsNative: () => Boolean,
    getIsTopLevel: () => Boolean,
    getLineNumber: () => Double,
    getSource: () => String,
    setArgs: () => Unit,
    setColumnNumber: () => Unit,
    setEvalOrigin: () => Unit,
    setFileName: () => Unit,
    setFunctionName: () => Unit,
    setIsConstructor: () => Unit,
    setIsEval: () => Unit,
    setIsNative: () => Unit,
    setIsTopLevel: () => Unit,
    setLineNumber: () => Unit,
    setSource: () => Unit
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getArgs = js.Any.fromFunction0(getArgs), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getIsConstructor = js.Any.fromFunction0(getIsConstructor), getIsEval = js.Any.fromFunction0(getIsEval), getIsNative = js.Any.fromFunction0(getIsNative), getIsTopLevel = js.Any.fromFunction0(getIsTopLevel), getLineNumber = js.Any.fromFunction0(getLineNumber), getSource = js.Any.fromFunction0(getSource), setArgs = js.Any.fromFunction0(setArgs), setColumnNumber = js.Any.fromFunction0(setColumnNumber), setEvalOrigin = js.Any.fromFunction0(setEvalOrigin), setFileName = js.Any.fromFunction0(setFileName), setFunctionName = js.Any.fromFunction0(setFunctionName), setIsConstructor = js.Any.fromFunction0(setIsConstructor), setIsEval = js.Any.fromFunction0(setIsEval), setIsNative = js.Any.fromFunction0(setIsNative), setIsTopLevel = js.Any.fromFunction0(setIsTopLevel), setLineNumber = js.Any.fromFunction0(setLineNumber), setSource = js.Any.fromFunction0(setSource))
    __obj.asInstanceOf[StackFrame]
  }
  @scala.inline
  implicit class StackFrameOps[Self <: StackFrame] (val x: Self) extends AnyVal {
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
    def withGetEvalOrigin(value: () => StackFrame): Self = {
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
    def withGetIsTopLevel(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsTopLevel")(js.Any.fromFunction0(value))
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
    def withSetArgs(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArgs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetColumnNumber(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumnNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEvalOrigin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEvalOrigin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFileName(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFunctionName(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFunctionName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIsConstructor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsConstructor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIsEval(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsEval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIsNative(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsNative")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIsTopLevel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsTopLevel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLineNumber(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLineNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSource(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withEvalOrigin(value: StackFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsConstructor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEval")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNative")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTopLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTopLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTopLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTopLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

