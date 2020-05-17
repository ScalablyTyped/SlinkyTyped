package typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the source location of the HTTP activity. */
@js.native
trait HttpDiagnosticSourceLocation extends js.Object {
  /** Gets the column number. */
  var columnNumber: Double = js.native
  /** Gets the line number. */
  var lineNumber: Double = js.native
  /** Gets the source URI. */
  var sourceUri: Uri = js.native
}

object HttpDiagnosticSourceLocation {
  @scala.inline
  def apply(columnNumber: Double, lineNumber: Double, sourceUri: Uri): HttpDiagnosticSourceLocation = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], sourceUri = sourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticSourceLocation]
  }
  @scala.inline
  implicit class HttpDiagnosticSourceLocationOps[Self <: HttpDiagnosticSourceLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

