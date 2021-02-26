package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitImportTfvcSource extends StObject {
  
  /**
    * Set true to import History, false otherwise
    */
  var importHistory: Boolean = js.native
  
  /**
    * Get history for last n days (max allowed value is 180 days)
    */
  var importHistoryDurationInDays: Double = js.native
  
  /**
    * Path which we want to import (this can be copied from Path Control in Explorer)
    */
  var path: String = js.native
}
object GitImportTfvcSource {
  
  @scala.inline
  def apply(importHistory: Boolean, importHistoryDurationInDays: Double, path: String): GitImportTfvcSource = {
    val __obj = js.Dynamic.literal(importHistory = importHistory.asInstanceOf[js.Any], importHistoryDurationInDays = importHistoryDurationInDays.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportTfvcSource]
  }
  
  @scala.inline
  implicit class GitImportTfvcSourceMutableBuilder[Self <: GitImportTfvcSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportHistory(value: Boolean): Self = StObject.set(x, "importHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportHistoryDurationInDays(value: Double): Self = StObject.set(x, "importHistoryDurationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
