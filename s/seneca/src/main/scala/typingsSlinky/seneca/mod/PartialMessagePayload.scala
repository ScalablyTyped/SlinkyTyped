package typingsSlinky.seneca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialMessagePayload extends js.Object {
  @JSName("fatal$")
  var fatal$: Boolean = js.native
  @JSName("plugin$")
  var plugin$: js.Any = js.native
  @JSName("transport$")
  var transport$: js.Object = js.native
  @JSName("tx$")
  var tx$: String = js.native
}

object PartialMessagePayload {
  @scala.inline
  def apply(fatal$: Boolean, plugin$: js.Any, transport$: js.Object, tx$: String): PartialMessagePayload = {
    val __obj = js.Dynamic.literal(fatal$ = fatal$.asInstanceOf[js.Any], plugin$ = plugin$.asInstanceOf[js.Any], transport$ = transport$.asInstanceOf[js.Any], tx$ = tx$.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMessagePayload]
  }
  @scala.inline
  implicit class PartialMessagePayloadOps[Self <: PartialMessagePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatal$(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin$(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransport$(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTx$(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx$")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

