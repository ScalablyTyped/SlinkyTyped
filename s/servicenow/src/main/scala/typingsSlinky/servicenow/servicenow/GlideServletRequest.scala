package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideServletRequest extends js.Object {
  def getContentType(): String = js.native
  def getHeader(name: String): String = js.native
  def getParameter(name: String): String = js.native
  def writeOutput(mimeType: String, output: String): Unit = js.native
}

object GlideServletRequest {
  @scala.inline
  def apply(
    getContentType: () => String,
    getHeader: String => String,
    getParameter: String => String,
    writeOutput: (String, String) => Unit
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal(getContentType = js.Any.fromFunction0(getContentType), getHeader = js.Any.fromFunction1(getHeader), getParameter = js.Any.fromFunction1(getParameter), writeOutput = js.Any.fromFunction2(writeOutput))
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
    def withGetParameter(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameter")(js.Any.fromFunction1(value))
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

