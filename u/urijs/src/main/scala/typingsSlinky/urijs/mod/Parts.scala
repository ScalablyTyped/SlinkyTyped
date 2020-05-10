package typingsSlinky.urijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parts extends URIOptions {
  var duplicateQueryParameters: Boolean = js.native
  var escapeQuerySpace: Boolean = js.native
  var preventInvalidHostname: Boolean = js.native
}

object Parts {
  @scala.inline
  def apply(duplicateQueryParameters: Boolean, escapeQuerySpace: Boolean, preventInvalidHostname: Boolean): Parts = {
    val __obj = js.Dynamic.literal(duplicateQueryParameters = duplicateQueryParameters.asInstanceOf[js.Any], escapeQuerySpace = escapeQuerySpace.asInstanceOf[js.Any], preventInvalidHostname = preventInvalidHostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parts]
  }
  @scala.inline
  implicit class PartsOps[Self <: Parts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuplicateQueryParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateQueryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscapeQuerySpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeQuerySpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventInvalidHostname(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventInvalidHostname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

