package typingsSlinky.storybookApi.channelMod

import typingsSlinky.storybookChannels.mod.Channel
import typingsSlinky.storybookChannels.mod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubAPI extends js.Object {
  
  def collapseAll(): Unit = js.native
  
  def emit(`type`: String, args: js.Any*): Unit = js.native
  
  def expandAll(): Unit = js.native
  
  def getChannel(): Channel = js.native
  
  def off(`type`: String, cb: Listener): Unit = js.native
  
  def on(`type`: String, cb: Listener): js.Function0[Unit] = js.native
  
  def once(`type`: String, cb: Listener): Unit = js.native
}
object SubAPI {
  
  @scala.inline
  def apply(
    collapseAll: () => Unit,
    emit: (String, /* repeated */ js.Any) => Unit,
    expandAll: () => Unit,
    getChannel: () => Channel,
    off: (String, Listener) => Unit,
    on: (String, Listener) => js.Function0[Unit],
    once: (String, Listener) => Unit
  ): SubAPI = {
    val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), emit = js.Any.fromFunction2(emit), expandAll = js.Any.fromFunction0(expandAll), getChannel = js.Any.fromFunction0(getChannel), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[SubAPI]
  }
  
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollapseAll(value: () => Unit): Self = this.set("collapseAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandAll(value: () => Unit): Self = this.set("expandAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChannel(value: () => Channel): Self = this.set("getChannel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOff(value: (String, Listener) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, Listener) => js.Function0[Unit]): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnce(value: (String, Listener) => Unit): Self = this.set("once", js.Any.fromFunction2(value))
  }
}
