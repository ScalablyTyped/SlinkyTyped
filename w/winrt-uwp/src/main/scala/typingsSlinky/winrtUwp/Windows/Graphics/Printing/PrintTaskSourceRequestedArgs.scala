package typingsSlinky.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments associated with the PrintTaskSourceRequestedHandler delegate. Provides a method for handing the content to be printed to the Print Task. */
@js.native
trait PrintTaskSourceRequestedArgs extends StObject {
  
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
  implicit class PrintTaskSourceRequestedArgsMutableBuilder[Self <: PrintTaskSourceRequestedArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => PrintTaskSourceRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSource(value: IPrintDocumentSource => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
  }
}
