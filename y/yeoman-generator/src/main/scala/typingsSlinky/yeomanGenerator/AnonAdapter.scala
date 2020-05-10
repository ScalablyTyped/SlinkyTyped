package typingsSlinky.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdapter extends js.Object {
  var adapter: AnonPromptModule = js.native
  def error(e: js.Error*): Unit = js.native
}

object AnonAdapter {
  @scala.inline
  def apply(adapter: AnonPromptModule, error: /* repeated */ js.Error => Unit): AnonAdapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[AnonAdapter]
  }
  @scala.inline
  implicit class AnonAdapterOps[Self <: AnonAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: AnonPromptModule): Self = {
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

