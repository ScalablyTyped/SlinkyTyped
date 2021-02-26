package typingsSlinky.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Workbook Classes
@js.native
trait Workbook extends StObject {
  
  /** Activates the sheet, either by name or index, and returns a promise of the sheet that was activated. */
  def activateSheetAsync(sheetNameOrIndex: String): js.Promise[Sheet] = js.native
  def activateSheetAsync(sheetNameOrIndex: Double): js.Promise[Sheet] = js.native
  
  /**
    * Changes the value of the parameter with the given name and returns the new Parameter.
    * The value should be the same data type as the parameter and within the allowable range of values.
    * It also needs to be the aliased value and not the raw value.
    * For more information and examples, see changeParameterValueAsync() Additional Information
    */
  def changeParameterValueAsync(name: String, value: js.Any): js.Promise[Parameter] = js.native
  
  /** Gets the currently active custom view, or null if no custom view is active. */
  def getActiveCustomView(): CustomView = js.native
  
  /** Gets the currently active sheet (the active tab) */
  def getActiveSheet(): Sheet = js.native
  
  /** Gets the collection of CustomView objects associated with the workbook. */
  def getCustomViewsAsync(): js.Promise[js.Array[CustomView]] = js.native
  
  /** Gets the name of the workbook saved to the server. Note that this is not necessarily the file name. */
  def getName(): String = js.native
  
  /** Fetches the parameters for this workbook. */
  def getParametersAsync(): js.Promise[js.Array[Parameter]] = js.native
  
  /** Note that this is synchronous, meaning that all of the sheets are expected when loaded. */
  def getPublishedSheetsInfo(): js.Array[SheetInfo] = js.native
  
  /** Gets the Viz object that contains the workbook. */
  def getViz(): Viz = js.native
  
  /** Remembers the current state of the workbook by assigning a custom view name. */
  def rememberCustomViewAsync(customViewName: String): js.Promise[CustomView] = js.native
  
  /** Removes the named custom view. */
  def removeCustomViewAsync(customViewName: String): js.Promise[CustomView] = js.native
  
  /** Reverts the workbook to its last saved state. */
  def revertAllAsync(): js.Promise[Unit] = js.native
  
  /** Sets the active custom view as the default. */
  def setActiveCustomViewAsDefaultAsync(): Unit = js.native
  
  /** Changes the visualization to show the named saved state. */
  def showCustomViewAsync(customViewName: String): js.Promise[CustomView] = js.native
}
