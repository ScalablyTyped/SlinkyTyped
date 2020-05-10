package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShim extends js.Object {
  def dispose(dummy: js.Any): Unit = js.native
}

object IShim {
  @scala.inline
  def apply(dispose: js.Any => Unit): IShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose))
    __obj.asInstanceOf[IShim]
  }
  @scala.inline
  implicit class IShimOps[Self <: IShim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

