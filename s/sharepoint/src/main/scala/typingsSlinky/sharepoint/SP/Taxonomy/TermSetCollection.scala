package typingsSlinky.sharepoint.SP.Taxonomy

import typingsSlinky.sharepoint.SP.ClientObjectCollection
import typingsSlinky.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermSetCollection extends ClientObjectCollection[TermSet] {
  def getById(id: Guid): TermSet = js.native
  def getByName(name: String): TermSet = js.native
  def get_item(index: Double): TermSet = js.native
  def itemAt(index: Double): TermSet = js.native
}

