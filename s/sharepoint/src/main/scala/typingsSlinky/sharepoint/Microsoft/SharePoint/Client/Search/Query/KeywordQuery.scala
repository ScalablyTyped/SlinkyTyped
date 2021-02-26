package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**Contains information about a keyword based search query.*/
@js.native
trait KeywordQuery
  extends typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query.Query {
  
  def get_collapseSpecification(): String = js.native
  
  def get_enableSorting(): Boolean = js.native
  
  def get_hiddenConstraints(): String = js.native
  
  def get_properties(): KeywordQueryProperties = js.native
  
  def get_refinementFilters(): StringCollection = js.native
  
  def get_refiners(): String = js.native
  
  def get_reorderingRules(): ReorderingRuleCollection = js.native
  
  /**Specifies the list of managed properties to be returned for each search result.*/
  def get_selectProperties(): StringCollection = js.native
  
  def get_sortList(): SortCollection = js.native
  
  def get_trimDuplicatesIncludeId(): Double = js.native
  
  def set_collapseSpecification(value: String): Unit = js.native
  
  def set_enableSorting(value: Boolean): Unit = js.native
  
  def set_hiddenConstraints(value: String): Unit = js.native
  
  def set_refinementFilters(value: StringCollection): Unit = js.native
  
  def set_refiners(value: String): Unit = js.native
  
  def set_reorderingRules(value: ReorderingRuleCollection): Unit = js.native
  
  def set_trimDuplicatesIncludeId(value: Double): Unit = js.native
}
