package typingsSlinky.uirouterAngularjs.interfaceMod.uirouterCoreLibStateStateRegistryAugmentingMod

import typingsSlinky.uirouterAngularjs.interfaceMod.Ng1StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateRegistry extends js.Object {
  def register(state: Ng1StateDeclaration): js.Any = js.native
}

object StateRegistry {
  @scala.inline
  def apply(register: Ng1StateDeclaration => js.Any): StateRegistry = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[StateRegistry]
  }
  @scala.inline
  implicit class StateRegistryOps[Self <: StateRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegister(value: Ng1StateDeclaration => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

