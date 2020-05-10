package typingsSlinky.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideServletRequest extends js.Object {
  def getContentType(): String = js.native
  def getHeader(name: String): String = js.native
  def getHeaderNames(): String = js.native
  def getHeaders(name: String): String = js.native
  def getParameter(name: String): String = js.native
  def getParameterNames(): String = js.native
  def getQueryString(): String = js.native
  def writeOutput(mimeType: String, output: String): Unit = js.native
}

object GlideServletRequest {
  @scala.inline
  def apply(
    getContentType: () => String,
    getHeader: String => String,
    getHeaderNames: () => String,
    getHeaders: String => String,
    getParameter: String => String,
    getParameterNames: () => String,
    getQueryString: () => String,
    writeOutput: (String, String) => Unit
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal(getContentType = js.Any.fromFunction0(getContentType), getHeader = js.Any.fromFunction1(getHeader), getHeaderNames = js.Any.fromFunction0(getHeaderNames), getHeaders = js.Any.fromFunction1(getHeaders), getParameter = js.Any.fromFunction1(getParameter), getParameterNames = js.Any.fromFunction0(getParameterNames), getQueryString = js.Any.fromFunction0(getQueryString), writeOutput = js.Any.fromFunction2(writeOutput))
    __obj.asInstanceOf[GlideServletRequest]
  }
  @scala.inline
  implicit class GlideServletRequestOps[Self <: GlideServletRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContentType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeader(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHeaderNames(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaders(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParameter(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParameterNames(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameterNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQueryString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWriteOutput(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeOutput")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

