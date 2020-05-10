package typingsSlinky.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEscapedIdentifier extends js.Object {
  var __escapedIdentifier: Unit = js.native
}

object AnonEscapedIdentifier {
  @scala.inline
  def apply(__escapedIdentifier: Unit): AnonEscapedIdentifier = {
    val __obj = js.Dynamic.literal(__escapedIdentifier = __escapedIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEscapedIdentifier]
  }
  @scala.inline
  implicit class AnonEscapedIdentifierOps[Self <: AnonEscapedIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__escapedIdentifier(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__escapedIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

