package typingsSlinky.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataSourceStatus extends StObject
/**
  * Describes the status of an IListDataSource.
  **/
@JSGlobal("WinJS.UI.DataSourceStatus")
@js.native
object DataSourceStatus extends StObject {
  
  /**
    * The IListDataSource failed to load.
    **/
  @js.native
  sealed trait failure extends DataSourceStatus
  
  /**
    * The IListDataSource is ready.
    **/
  @js.native
  sealed trait ready extends DataSourceStatus
  
  /**
    * The IListDataSource is still loading.
    **/
  @js.native
  sealed trait waiting extends DataSourceStatus
}
