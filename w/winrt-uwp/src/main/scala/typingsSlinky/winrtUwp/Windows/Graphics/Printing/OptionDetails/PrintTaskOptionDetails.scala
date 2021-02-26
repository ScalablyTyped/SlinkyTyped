package typingsSlinky.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Graphics.Printing.PrintPageDescription
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.beginvalidation
import typingsSlinky.winrtUwp.winrtUwpStrings.optionchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A collection of events, methods and properties for advanced print tasks. */
@js.native
trait PrintTaskOptionDetails extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beginvalidation(`type`: beginvalidation, listener: TypedEventHandler[PrintTaskOptionDetails, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionchanged(
    `type`: optionchanged,
    listener: TypedEventHandler[PrintTaskOptionDetails, PrintTaskOptionChangedEventArgs]
  ): Unit = js.native
  
  /**
    * Creates a custom list of items that allow the user to choose the page format.
    * @param optionId The ID for the custom item.
    * @param displayName The display name for the custom item.
    * @return The list of custom items.
    */
  def createItemListOption(optionId: String, displayName: String): PrintCustomItemListOptionDetails = js.native
  
  /**
    * Creates a CustomPrintTaskOptionText object to handle the display name and other parameters of the advanced print task option item.
    * @param optionId The ID of the print task option.
    * @param displayName The display name of the print task option.
    * @return The CustomPrintTaskOptionText object.
    */
  def createTextOption(optionId: String, displayName: String): PrintCustomTextOptionDetails = js.native
  
  /** Gets the list of print task options that are currently displayed. */
  var displayedOptions: IVector[String] = js.native
  
  /**
    * Returns a PrintPageDescription object for the referenced page number.
    * @param jobPageNumber The page number.
    * @return The PrintPageDescription object.
    */
  def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
  
  /** Raised when the print system begins a validation pass on the current state of the print ticket. */
  def onbeginvalidation(ev: js.Any with WinRTEvent[PrintTaskOptionDetails]): Unit = js.native
  /** Raised when the print system begins a validation pass on the current state of the print ticket. */
  @JSName("onbeginvalidation")
  var onbeginvalidation_Original: TypedEventHandler[PrintTaskOptionDetails, _] = js.native
  
  /** Raised when any one of the advanced print task options is changed. */
  def onoptionchanged(ev: PrintTaskOptionChangedEventArgs with WinRTEvent[PrintTaskOptionDetails]): Unit = js.native
  /** Raised when any one of the advanced print task options is changed. */
  @JSName("onoptionchanged")
  var onoptionchanged_Original: TypedEventHandler[PrintTaskOptionDetails, PrintTaskOptionChangedEventArgs] = js.native
  
  /** Gets the list of options for the advanced print task. */
  var options: IMapView[String, IPrintOptionDetails] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beginvalidation(`type`: beginvalidation, listener: TypedEventHandler[PrintTaskOptionDetails, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionchanged(
    `type`: optionchanged,
    listener: TypedEventHandler[PrintTaskOptionDetails, PrintTaskOptionChangedEventArgs]
  ): Unit = js.native
}
