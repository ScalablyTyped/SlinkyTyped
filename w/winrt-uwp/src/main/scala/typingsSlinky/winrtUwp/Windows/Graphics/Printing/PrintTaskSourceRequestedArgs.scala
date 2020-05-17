package typingsSlinky.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Arguments associated with the PrintTaskSourceRequestedHandler delegate. Provides a method for handing the content to be printed to the Print Task. */
@js.native
trait PrintTaskSourceRequestedArgs extends js.Object {
  /** Gets the DateTime object that indicates the deadline for a print task source request. */
  var deadline: js.Date = js.native
  /**
    * Gets a PrintTaskSourceRequestedDeferral object that provides access to a Complete method. This method indicates then the deferral is over.
    * @return Provides access to a Complete method.
    */
  def getDeferral(): PrintTaskSourceRequestedDeferral = js.native
  /**
    * Informs the print task of the content to be printed.
    * @param source A pointer to the IPrintDocumentSource interface.
    */
  def setSource(source: IPrintDocumentSource): Unit = js.native
}

object PrintTaskSourceRequestedArgs {
  @scala.inline
  def apply(
    deadline: js.Date,
    getDeferral: () => PrintTaskSourceRequestedDeferral,
    setSource: IPrintDocumentSource => Unit
  ): PrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[PrintTaskSourceRequestedArgs]
  }
  @scala.inline
  implicit class PrintTaskSourceRequestedArgsOps[Self <: PrintTaskSourceRequestedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => PrintTaskSourceRequestedDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSource(value: IPrintDocumentSource => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSource")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

