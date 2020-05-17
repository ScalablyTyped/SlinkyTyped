package typingsSlinky.yeomanGenerator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  var adapter: PromptModule = js.native
  def error(e: js.Error*): Unit = js.native
}

object Adapter {
  @scala.inline
  def apply(adapter: PromptModule, error: /* repeated */ js.Error => Unit): Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: PromptModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: /* repeated */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

