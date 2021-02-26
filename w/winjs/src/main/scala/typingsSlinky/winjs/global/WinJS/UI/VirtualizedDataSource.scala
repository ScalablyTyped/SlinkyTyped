package typingsSlinky.winjs.global.WinJS.UI

import typingsSlinky.winjs.WinJS.UI.IListDataAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base class for a custom IListDataSource.
  **/
@JSGlobal("WinJS.UI.VirtualizedDataSource")
@js.native
class VirtualizedDataSource[T] protected ()
  extends typingsSlinky.winjs.WinJS.UI.VirtualizedDataSource[T] {
  //#region Constructors
  /**
    * Initializes the VirtualizedDataSource base class of a custom data source.
    * @constructor
    * @param listDataAdapter The object that supplies data to the VirtualizedDataSource.
    * @param options An object that can contain properties that specify additional options for the VirtualizedDataSource. It supports these properties: cacheSize.
    **/
  def this(listDataAdapter: IListDataAdapter[T]) = this()
  def this(listDataAdapter: IListDataAdapter[T], options: js.Any) = this()
}
object VirtualizedDataSource {
  
  @JSGlobal("WinJS.UI.VirtualizedDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.VirtualizedDataSource.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
