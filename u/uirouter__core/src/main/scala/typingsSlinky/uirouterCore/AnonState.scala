package typingsSlinky.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonState extends js.Object {
  var params: StringDictionary[js.Any] = js.native
  var state: String | StateDeclaration = js.native
}

object AnonState {
  @scala.inline
  def apply(params: StringDictionary[js.Any], state: String | StateDeclaration): AnonState = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState]
  }
  @scala.inline
  implicit class AnonStateOps[Self <: AnonState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String | StateDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

