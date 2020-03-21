package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.terminalMod.SingleLineMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromise extends js.Object {
  var promise: js.Promise[SingleLineMenuResponse]
}

object AnonPromise {
  @scala.inline
  def apply(promise: js.Promise[SingleLineMenuResponse]): AnonPromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPromise]
  }
}

