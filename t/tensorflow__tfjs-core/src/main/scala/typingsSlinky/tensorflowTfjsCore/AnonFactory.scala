package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFactory extends js.Object {
  var priority: Double = js.native
  def factory(): KernelBackend | js.Promise[KernelBackend] = js.native
}

object AnonFactory {
  @scala.inline
  def apply(factory: () => KernelBackend | js.Promise[KernelBackend], priority: Double): AnonFactory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactory]
  }
  @scala.inline
  implicit class AnonFactoryOps[Self <: AnonFactory] (val x: Self) extends AnyVal {
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

