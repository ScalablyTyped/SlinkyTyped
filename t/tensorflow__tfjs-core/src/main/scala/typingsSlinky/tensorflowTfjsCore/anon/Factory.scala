package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Factory extends js.Object {
  var priority: Double = js.native
  def factory(): KernelBackend | js.Promise[KernelBackend] = js.native
}

object Factory {
  @scala.inline
  def apply(factory: () => KernelBackend | js.Promise[KernelBackend], priority: Double): Factory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factory]
  }
  @scala.inline
  implicit class FactoryOps[Self <: Factory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFactory(value: () => KernelBackend | js.Promise[KernelBackend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

