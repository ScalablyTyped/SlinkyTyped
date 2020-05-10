package typingsSlinky.webcomponentsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomElementsPolyfill extends js.Object {
  var flags: js.Any = js.native
  var hasNative: Boolean = js.native
  var ready: Boolean = js.native
  var useNative: Boolean = js.native
}

object CustomElementsPolyfill {
  @scala.inline
  def apply(flags: js.Any, hasNative: Boolean, ready: Boolean, useNative: Boolean): CustomElementsPolyfill = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], hasNative = hasNative.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], useNative = useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomElementsPolyfill]
  }
  @scala.inline
  implicit class CustomElementsPolyfillOps[Self <: CustomElementsPolyfill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

