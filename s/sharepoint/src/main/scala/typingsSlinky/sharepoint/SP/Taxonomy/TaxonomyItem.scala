package typingsSlinky.sharepoint.SP.Taxonomy

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxonomyItem extends ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_createdDate(): js.Date = js.native
  
  def get_id(): Guid = js.native
  
  def get_lastModifiedDate(): js.Date = js.native
  
  def get_name(): String = js.native
  
  def get_termStore(): TermStore = js.native
  
  def set_name(value: String): Unit = js.native
}
