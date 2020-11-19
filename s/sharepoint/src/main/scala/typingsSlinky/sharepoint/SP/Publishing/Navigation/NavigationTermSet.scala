package typingsSlinky.sharepoint.SP.Publishing.Navigation

import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.Taxonomy.TaxonomySession
import typingsSlinky.sharepoint.SP.Taxonomy.TermSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationTermSet extends NavigationTermSetItem {
  
  def findTermForUrl(url: String): NavigationTerm = js.native
  
  def getAllTerms(): NavigationTermCollection = js.native
  
  def getAsEditable(taxonomySession: TaxonomySession): NavigationTermSet = js.native
  
  def getTaxonomyTermSet(): TermSet = js.native
  
  def getWithNewView(newView: NavigationTermSetView): NavigationTermSet = js.native
  
  def get_isNavigationTermSet(): Boolean = js.native
  
  def get_lcid(): Double = js.native
  
  def get_loadedFromPersistedData(): Boolean = js.native
  
  def get_termGroupId(): Guid = js.native
  
  def get_termStoreId(): Guid = js.native
  
  def set_isNavigationTermSet(value: Boolean): Boolean = js.native
}
