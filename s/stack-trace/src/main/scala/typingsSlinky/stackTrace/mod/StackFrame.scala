package typingsSlinky.stackTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackFrame extends js.Object {
  def getColumnNumber(): Double = js.native
  def getFileName(): String = js.native
  def getFunctionName(): String = js.native
  def getLineNumber(): Double = js.native
  def getMethodName(): String = js.native
  def getTypeName(): String = js.native
  def isNative(): Boolean = js.native
}

object StackFrame {
  @scala.inline
  def apply(
    getColumnNumber: () => Double,
    getFileName: () => String,
    getFunctionName: () => String,
    getLineNumber: () => Double,
    getMethodName: () => String,
    getTypeName: () => String,
    isNative: () => Boolean
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getTypeName = js.Any.fromFunction0(getTypeName), isNative = js.Any.fromFunction0(isNative))
    __obj.asInstanceOf[StackFrame]
  }
  @scala.inline
  implicit class StackFrameOps[Self <: StackFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColumnNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnNumber")(js.Any.fromFunction0(value))
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
    def withGetLineNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMethodName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethodName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTypeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNative(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNative")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

