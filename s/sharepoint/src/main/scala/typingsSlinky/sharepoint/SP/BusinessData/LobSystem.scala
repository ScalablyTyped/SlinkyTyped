package typingsSlinky.sharepoint.SP.BusinessData

import typingsSlinky.sharepoint.SP.BusinessData.Collections.LobSystemInstanceCollection
import typingsSlinky.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LobSystem extends ClientObject {
  def getLobSystemInstances(): LobSystemInstanceCollection = js.native
  def get_name(): String = js.native
}

