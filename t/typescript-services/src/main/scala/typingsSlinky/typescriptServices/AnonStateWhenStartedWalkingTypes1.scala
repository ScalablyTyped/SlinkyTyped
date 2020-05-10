package typingsSlinky.typescriptServices

import typingsSlinky.typescriptServices.TypeScript.EnclosingTypeWalkerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStateWhenStartedWalkingTypes1 extends js.Object {
  var stateWhenStartedWalkingTypes1: EnclosingTypeWalkerState = js.native
  var stateWhenStartedWalkingTypes2: EnclosingTypeWalkerState = js.native
}

object AnonStateWhenStartedWalkingTypes1 {
  @scala.inline
  def apply(
    stateWhenStartedWalkingTypes1: EnclosingTypeWalkerState,
    stateWhenStartedWalkingTypes2: EnclosingTypeWalkerState
  ): AnonStateWhenStartedWalkingTypes1 = {
    val __obj = js.Dynamic.literal(stateWhenStartedWalkingTypes1 = stateWhenStartedWalkingTypes1.asInstanceOf[js.Any], stateWhenStartedWalkingTypes2 = stateWhenStartedWalkingTypes2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStateWhenStartedWalkingTypes1]
  }
  @scala.inline
  implicit class AnonStateWhenStartedWalkingTypes1Ops[Self <: AnonStateWhenStartedWalkingTypes1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateWhenStartedWalkingTypes1(value: EnclosingTypeWalkerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateWhenStartedWalkingTypes1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateWhenStartedWalkingTypes2(value: EnclosingTypeWalkerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateWhenStartedWalkingTypes2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

