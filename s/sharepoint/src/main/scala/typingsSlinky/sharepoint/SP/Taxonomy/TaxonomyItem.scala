package typingsSlinky.sharepoint.SP.Taxonomy

import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomyItem")
@js.native
class TaxonomyItem () extends ClientObject {
  def deleteObject(): Unit = js.native
  def get_createdDate(): js.Date = js.native
  def get_id(): Guid = js.native
  def get_lastModifiedDate(): js.Date = js.native
  def get_name(): String = js.native
  def get_termStore(): TermStore = js.native
  def set_name(value: String): Unit = js.native
}

/* static members */
@JSGlobal("SP.Taxonomy.TaxonomyItem")
@js.native
object TaxonomyItem extends js.Object {
  def normalizeName(context: ClientContext, name: String): StringResult = js.native
}

