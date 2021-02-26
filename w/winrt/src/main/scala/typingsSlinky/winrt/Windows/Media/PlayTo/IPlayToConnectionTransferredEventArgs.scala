package typingsSlinky.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayToConnectionTransferredEventArgs extends StObject {
  
  var currentSource: PlayToSource = js.native
  
  var previousSource: PlayToSource = js.native
}
object IPlayToConnectionTransferredEventArgs {
  
  @scala.inline
  def apply(currentSource: PlayToSource, previousSource: PlayToSource): IPlayToConnectionTransferredEventArgs = {
    val __obj = js.Dynamic.literal(currentSource = currentSource.asInstanceOf[js.Any], previousSource = previousSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnectionTransferredEventArgs]
  }
  
  @scala.inline
  implicit class IPlayToConnectionTransferredEventArgsMutableBuilder[Self <: IPlayToConnectionTransferredEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSource(value: PlayToSource): Self = StObject.set(x, "currentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSource(value: PlayToSource): Self = StObject.set(x, "previousSource", value.asInstanceOf[js.Any])
  }
}
