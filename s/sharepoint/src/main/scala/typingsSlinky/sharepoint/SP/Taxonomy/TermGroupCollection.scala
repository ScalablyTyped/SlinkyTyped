package typingsSlinky.sharepoint.SP.Taxonomy

import typingsSlinky.sharepoint.SP.ClientObjectCollection
import typingsSlinky.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermGroupCollection extends ClientObjectCollection[TermGroup] {
  def getById(id: Guid): TermGroup = js.native
  def getByName(name: String): TermGroup = js.native
  def get_item(index: Double): TermGroup = js.native
  def itemAt(index: Double): TermGroup = js.native
}

