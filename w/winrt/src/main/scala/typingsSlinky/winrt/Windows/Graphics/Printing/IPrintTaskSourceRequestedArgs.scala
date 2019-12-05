package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskSourceRequestedArgs extends js.Object {
  var deadline: js.Date
  def getDeferral(): PrintTaskSourceRequestedDeferral
  def setSource(source: IPrintDocumentSource): Unit
}

object IPrintTaskSourceRequestedArgs {
  @scala.inline
  def apply(
    deadline: js.Date,
    getDeferral: () => PrintTaskSourceRequestedDeferral,
    setSource: IPrintDocumentSource => Unit
  ): IPrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
  
    __obj.asInstanceOf[IPrintTaskSourceRequestedArgs]
  }
}

