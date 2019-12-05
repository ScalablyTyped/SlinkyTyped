package typingsSlinky.sharepoint.SP.Publishing.Navigation

import typingsSlinky.sharepoint.SP.BooleanResult
import typingsSlinky.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationTermProviderNameCollection extends ClientObjectCollection[String] {
  def Add(item: String): Unit = js.native
  def Clear(): Unit = js.native
  def Remove(item: String): BooleanResult = js.native
}

