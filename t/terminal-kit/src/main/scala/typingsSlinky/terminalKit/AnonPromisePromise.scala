package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.terminalMod.SingleLineMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPromisePromise extends js.Object {
  var promise: js.Promise[SingleLineMenuResponse] = js.native
}

object AnonPromisePromise {
  @scala.inline
  def apply(promise: js.Promise[SingleLineMenuResponse]): AnonPromisePromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPromisePromise]
  }
  @scala.inline
  implicit class AnonPromisePromiseOps[Self <: AnonPromisePromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: js.Promise[SingleLineMenuResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

