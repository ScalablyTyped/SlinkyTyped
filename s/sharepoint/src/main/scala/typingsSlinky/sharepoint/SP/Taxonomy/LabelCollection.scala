package typingsSlinky.sharepoint.SP.Taxonomy

import typingsSlinky.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelCollection extends ClientObjectCollection[Label] {
  
  def getByValue(name: String): Label = js.native
  
  def get_item(index: Double): Label = js.native
  
  def itemAt(index: Double): Label = js.native
}
