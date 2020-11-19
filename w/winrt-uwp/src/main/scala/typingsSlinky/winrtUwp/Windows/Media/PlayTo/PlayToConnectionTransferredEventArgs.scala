package typingsSlinky.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the Transferred event. */
@js.native
trait PlayToConnectionTransferredEventArgs extends js.Object {
  
  /** Gets the current Play To source that a connection was transferred to. */
  var currentSource: PlayToSource = js.native
  
  /** Gets the previous Play To source that a connection was transferred from. */
  var previousSource: PlayToSource = js.native
}
object PlayToConnectionTransferredEventArgs {
  
  @scala.inline
  def apply(currentSource: PlayToSource, previousSource: PlayToSource): PlayToConnectionTransferredEventArgs = {
    val __obj = js.Dynamic.literal(currentSource = currentSource.asInstanceOf[js.Any], previousSource = previousSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionTransferredEventArgs]
  }
  
  @scala.inline
  implicit class PlayToConnectionTransferredEventArgsOps[Self <: PlayToConnectionTransferredEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCurrentSource(value: PlayToSource): Self = this.set("currentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSource(value: PlayToSource): Self = this.set("previousSource", value.asInstanceOf[js.Any])
  }
}
