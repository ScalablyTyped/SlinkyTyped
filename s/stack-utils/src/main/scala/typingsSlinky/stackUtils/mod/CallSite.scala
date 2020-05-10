package typingsSlinky.stackUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallSite extends js.Object {
  def getColumnNumber(): Double = js.native
  def getEvalOrigin(): CallSite | String = js.native
  def getFileName(): js.UndefOr[String] = js.native
  def getFunction(): js.UndefOr[js.Function] = js.native
  def getFunctionName(): String = js.native
  def getLineNumber(): Double = js.native
  def getMethodName(): String | Null = js.native
  def getThis(): js.UndefOr[js.Object] = js.native
  def getTypeName(): String = js.native
  def isConstructor(): Boolean = js.native
  def isEval(): Boolean = js.native
  def isNative(): Boolean = js.native
  def isToplevel(): Boolean = js.native
}

object CallSite {
  @scala.inline
  def apply(
    getColumnNumber: () => Double,
    getEvalOrigin: () => CallSite | String,
    getFileName: () => js.UndefOr[String],
    getFunction: () => js.UndefOr[js.Function],
    getFunctionName: () => String,
    getLineNumber: () => Double,
    getMethodName: () => String | Null,
    getThis: () => js.UndefOr[js.Object],
    getTypeName: () => String,
    isConstructor: () => Boolean,
    isEval: () => Boolean,
    isNative: () => Boolean,
    isToplevel: () => Boolean
  ): CallSite = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
    __obj.asInstanceOf[CallSite]
  }
  @scala.inline
  implicit class CallSiteOps[Self <: CallSite] (val x: Self) extends AnyVal {
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
    def withGetEvalOrigin(value: () => CallSite | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEvalOrigin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFileName(value: () => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFunction(value: () => js.UndefOr[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFunction")(js.Any.fromFunction0(value))
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
    def withGetMethodName(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethodName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThis(value: () => js.UndefOr[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTypeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsConstructor(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEval(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNative(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNative")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsToplevel(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToplevel")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

