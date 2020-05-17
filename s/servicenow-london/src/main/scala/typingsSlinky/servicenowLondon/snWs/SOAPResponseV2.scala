package typingsSlinky.servicenowLondon.snWs

import typingsSlinky.servicenowLondon.anon.Get
import typingsSlinky.servicenowLondon.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SOAPResponseV2 extends js.Object {
  def getAllHeaders(): js.Array[Name] = js.native
  def getBody(): String = js.native
  def getCookies(): Get = js.native
  def getErrorCode(): Double = js.native
  def getErrorMessage(): String = js.native
  def getHeader(name: String): String = js.native
  def getHeaders(): js.Object = js.native
  def getStatusCode(): Double = js.native
  def haveError(): Boolean = js.native
  def waitForResponse(timeoutSecs: Double): Unit = js.native
}

object SOAPResponseV2 {
  @scala.inline
  def apply(
    getAllHeaders: () => js.Array[Name],
    getBody: () => String,
    getCookies: () => Get,
    getErrorCode: () => Double,
    getErrorMessage: () => String,
    getHeader: String => String,
    getHeaders: () => js.Object,
    getStatusCode: () => Double,
    haveError: () => Boolean,
    waitForResponse: Double => Unit
  ): SOAPResponseV2 = {
    val __obj = js.Dynamic.literal(getAllHeaders = js.Any.fromFunction0(getAllHeaders), getBody = js.Any.fromFunction0(getBody), getCookies = js.Any.fromFunction0(getCookies), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
    __obj.asInstanceOf[SOAPResponseV2]
  }
  @scala.inline
  implicit class SOAPResponseV2Ops[Self <: SOAPResponseV2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllHeaders(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBody(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBody")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCookies(value: () => Get): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCookies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeader(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHeaders(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatusCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHaveError(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haveError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWaitForResponse(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForResponse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

