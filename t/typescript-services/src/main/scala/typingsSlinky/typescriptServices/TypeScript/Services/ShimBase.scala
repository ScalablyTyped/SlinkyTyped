package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShimBase extends IShim {
  var factory: js.Any = js.native
}

object ShimBase {
  @scala.inline
  def apply(dispose: js.Any => Unit, factory: js.Any): ShimBase = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose), factory = factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShimBase]
  }
  @scala.inline
  implicit class ShimBaseOps[Self <: ShimBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFactory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

