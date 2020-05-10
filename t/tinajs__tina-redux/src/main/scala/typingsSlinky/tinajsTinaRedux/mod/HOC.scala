package typingsSlinky.tinajsTinaRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HOC extends js.Object {
  var methods: js.Object = js.native
  def onLoad(): Unit = js.native
  def onUnload(): Unit = js.native
}

object HOC {
  @scala.inline
  def apply(methods: js.Object, onLoad: () => Unit, onUnload: () => Unit): HOC = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], onLoad = js.Any.fromFunction0(onLoad), onUnload = js.Any.fromFunction0(onUnload))
    __obj.asInstanceOf[HOC]
  }
  @scala.inline
  implicit class HOCOps[Self <: HOC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethods(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUnload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

