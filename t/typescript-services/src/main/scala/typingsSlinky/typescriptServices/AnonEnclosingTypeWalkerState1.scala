package typingsSlinky.typescriptServices

import typingsSlinky.typescriptServices.TypeScript.EnclosingTypeWalkerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnclosingTypeWalkerState1 extends js.Object {
  var enclosingTypeWalkerState1: EnclosingTypeWalkerState = js.native
  var enclosingTypeWalkerState2: EnclosingTypeWalkerState = js.native
}

object AnonEnclosingTypeWalkerState1 {
  @scala.inline
  def apply(
    enclosingTypeWalkerState1: EnclosingTypeWalkerState,
    enclosingTypeWalkerState2: EnclosingTypeWalkerState
  ): AnonEnclosingTypeWalkerState1 = {
    val __obj = js.Dynamic.literal(enclosingTypeWalkerState1 = enclosingTypeWalkerState1.asInstanceOf[js.Any], enclosingTypeWalkerState2 = enclosingTypeWalkerState2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnclosingTypeWalkerState1]
  }
  @scala.inline
  implicit class AnonEnclosingTypeWalkerState1Ops[Self <: AnonEnclosingTypeWalkerState1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnclosingTypeWalkerState1(value: EnclosingTypeWalkerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosingTypeWalkerState1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnclosingTypeWalkerState2(value: EnclosingTypeWalkerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosingTypeWalkerState2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

