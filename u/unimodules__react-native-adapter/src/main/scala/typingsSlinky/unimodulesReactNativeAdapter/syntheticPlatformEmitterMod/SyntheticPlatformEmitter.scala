package typingsSlinky.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntheticPlatformEmitter extends js.Object {
  var _emitter: js.Any = js.native
  def emit(eventName: String, props: js.Any): Unit = js.native
}

object SyntheticPlatformEmitter {
  @scala.inline
  def apply(_emitter: js.Any, emit: (String, js.Any) => Unit): SyntheticPlatformEmitter = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit))
    __obj.asInstanceOf[SyntheticPlatformEmitter]
  }
  @scala.inline
  implicit class SyntheticPlatformEmitterOps[Self <: SyntheticPlatformEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_emitter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_emitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmit(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

