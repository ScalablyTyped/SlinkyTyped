package typingsSlinky.servicenow.snWs

import typingsSlinky.servicenow.servicenow.SOAPResponseV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SOAPMessageV2 extends js.Object {
  def execute(): SOAPResponseV2 = js.native
  def executeAsync(): SOAPResponseV2 = js.native
  def getEndpoint(): String = js.native
  def getRequestBody(): String = js.native
  def getRequestHeader(headerName: String): String = js.native
  def getRequestHeaders(): js.Object = js.native
  def setBasicAuth(userName: String, userPass: String): Unit = js.native
  def setEccCorrelator(correlator: String): Unit = js.native
  def setEccParameter(name: String, value: String): Unit = js.native
  def setEndpoint(endpoint: String): Unit = js.native
  def setHttpMethod(method: String): Unit = js.native
  def setHttpTimeout(timeoutMs: Double): Unit = js.native
  def setMIDServer(midServer: String): Unit = js.native
  def setMutualAuth(profileName: String): Unit = js.native
  def setRequestBody(body: String): Unit = js.native
  def setRequestHeader(name: String, value: String): Unit = js.native
  def setStringParameter(name: String, value: String): Unit = js.native
  def setStringParameterNoEscape(name: String, value: String): Unit = js.native
  def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit = js.native
}

object SOAPMessageV2 {
  @scala.inline
  def apply(
    execute: () => SOAPResponseV2,
    executeAsync: () => SOAPResponseV2,
    getEndpoint: () => String,
    getRequestBody: () => String,
    getRequestHeader: String => String,
    getRequestHeaders: () => js.Object,
    setBasicAuth: (String, String) => Unit,
    setEccCorrelator: String => Unit,
    setEccParameter: (String, String) => Unit,
    setEndpoint: String => Unit,
    setHttpMethod: String => Unit,
    setHttpTimeout: Double => Unit,
    setMIDServer: String => Unit,
    setMutualAuth: String => Unit,
    setRequestBody: String => Unit,
    setRequestHeader: (String, String) => Unit,
    setStringParameter: (String, String) => Unit,
    setStringParameterNoEscape: (String, String) => Unit,
    setWSSecurity: (String, String, String, String) => Unit
  ): SOAPMessageV2 = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), executeAsync = js.Any.fromFunction0(executeAsync), getEndpoint = js.Any.fromFunction0(getEndpoint), getRequestBody = js.Any.fromFunction0(getRequestBody), getRequestHeader = js.Any.fromFunction1(getRequestHeader), getRequestHeaders = js.Any.fromFunction0(getRequestHeaders), setBasicAuth = js.Any.fromFunction2(setBasicAuth), setEccCorrelator = js.Any.fromFunction1(setEccCorrelator), setEccParameter = js.Any.fromFunction2(setEccParameter), setEndpoint = js.Any.fromFunction1(setEndpoint), setHttpMethod = js.Any.fromFunction1(setHttpMethod), setHttpTimeout = js.Any.fromFunction1(setHttpTimeout), setMIDServer = js.Any.fromFunction1(setMIDServer), setMutualAuth = js.Any.fromFunction1(setMutualAuth), setRequestBody = js.Any.fromFunction1(setRequestBody), setRequestHeader = js.Any.fromFunction2(setRequestHeader), setStringParameter = js.Any.fromFunction2(setStringParameter), setStringParameterNoEscape = js.Any.fromFunction2(setStringParameterNoEscape), setWSSecurity = js.Any.fromFunction4(setWSSecurity))
    __obj.asInstanceOf[SOAPMessageV2]
  }
  @scala.inline
  implicit class SOAPMessageV2Ops[Self <: SOAPMessageV2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: () => SOAPResponseV2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExecuteAsync(value: () => SOAPResponseV2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndpoint(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndpoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRequestBody(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequestBody")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRequestHeader(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequestHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRequestHeaders(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequestHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBasicAuth(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBasicAuth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetEccCorrelator(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEccCorrelator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEccParameter(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEccParameter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetEndpoint(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEndpoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHttpMethod(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHttpMethod")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHttpTimeout(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHttpTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMIDServer(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMIDServer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMutualAuth(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMutualAuth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRequestBody(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequestBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRequestHeader(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequestHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStringParameter(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStringParameter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStringParameterNoEscape(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStringParameterNoEscape")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetWSSecurity(value: (String, String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWSSecurity")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

