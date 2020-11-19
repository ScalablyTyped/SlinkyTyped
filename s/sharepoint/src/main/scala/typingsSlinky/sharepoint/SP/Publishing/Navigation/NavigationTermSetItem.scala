package typingsSlinky.sharepoint.SP.Publishing.Navigation

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.Publishing.CustomizableString
import typingsSlinky.sharepoint.SP.StringResult
import typingsSlinky.sharepoint.SP.Taxonomy.Term
import typingsSlinky.sharepoint.SP.Taxonomy.TermStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationTermSetItem extends ClientObject {
  
  def createTerm(termName: String, linkType: NavigationLinkType, termId: Guid): Term = js.native
  
  def getResolvedDisplayUrl(browserQueryString: String): StringResult = js.native
  
  def getTaxonomyTermStore(): TermStore = js.native
  
  def get_catalogTargetUrlForChildTerms(): CustomizableString = js.native
  
  def get_id(): Guid = js.native
  
  def get_isReadOnly(): Boolean = js.native
  
  def get_linkType(): NavigationLinkType = js.native
  
  def get_targetUrlForChildTerms(): CustomizableString = js.native
  
  def get_taxonomyName(): String = js.native
  
  def get_terms(): NavigationTermCollection = js.native
  
  def get_title(): CustomizableString = js.native
  
  def get_view(): NavigationTermSetView = js.native
  
  def set_linkType(value: NavigationLinkType): NavigationLinkType = js.native
}
