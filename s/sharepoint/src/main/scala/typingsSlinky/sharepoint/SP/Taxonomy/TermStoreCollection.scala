package typingsSlinky.sharepoint.SP.Taxonomy

import typingsSlinky.sharepoint.SP.ClientObjectCollection
import typingsSlinky.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TermStoreCollection extends ClientObjectCollection[TermStore] {
  
  def getById(id: Guid): TermStore = js.native
  
  def getByName(name: String): TermStore = js.native
  
  def get_item(index: Double): TermStore = js.native
  
  def itemAt(index: Double): TermStore = js.native
}
