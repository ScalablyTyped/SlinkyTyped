package typingsSlinky.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideSession extends js.Object {
  def getClientData(paramName: String): String = js.native
  def getClientIP(): String = js.native
  def getCurrentApplicationId(): String = js.native
  def getLanguage(): String = js.native
  def getSessionToken(): String = js.native
  def getTimeZoneName(): String = js.native
  def getUrlOnStack(): String = js.native
  def isImpersonating(): Boolean = js.native
  def isInteractive(): Boolean = js.native
  def isLoggedIn(): Boolean = js.native
  def putClientData(paramName: String, paramValue: String): Unit = js.native
}

object GlideSession {
  @scala.inline
  def apply(
    getClientData: String => String,
    getClientIP: () => String,
    getCurrentApplicationId: () => String,
    getLanguage: () => String,
    getSessionToken: () => String,
    getTimeZoneName: () => String,
    getUrlOnStack: () => String,
    isImpersonating: () => Boolean,
    isInteractive: () => Boolean,
    isLoggedIn: () => Boolean,
    putClientData: (String, String) => Unit
  ): GlideSession = {
    val __obj = js.Dynamic.literal(getClientData = js.Any.fromFunction1(getClientData), getClientIP = js.Any.fromFunction0(getClientIP), getCurrentApplicationId = js.Any.fromFunction0(getCurrentApplicationId), getLanguage = js.Any.fromFunction0(getLanguage), getSessionToken = js.Any.fromFunction0(getSessionToken), getTimeZoneName = js.Any.fromFunction0(getTimeZoneName), getUrlOnStack = js.Any.fromFunction0(getUrlOnStack), isImpersonating = js.Any.fromFunction0(isImpersonating), isInteractive = js.Any.fromFunction0(isInteractive), isLoggedIn = js.Any.fromFunction0(isLoggedIn), putClientData = js.Any.fromFunction2(putClientData))
    __obj.asInstanceOf[GlideSession]
  }
  @scala.inline
  implicit class GlideSessionOps[Self <: GlideSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClientData(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetClientIP(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientIP")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentApplicationId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentApplicationId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLanguage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSessionToken(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSessionToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeZoneName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeZoneName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUrlOnStack(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrlOnStack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsImpersonating(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImpersonating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInteractive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLoggedIn(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoggedIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPutClientData(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putClientData")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

