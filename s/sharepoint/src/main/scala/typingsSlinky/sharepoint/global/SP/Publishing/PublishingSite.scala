package typingsSlinky.sharepoint.global.SP.Publishing

import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingSite")
@js.native
class PublishingSite () extends ClientObject

/* static members */
@JSGlobal("SP.Publishing.PublishingSite")
@js.native
object PublishingSite extends js.Object {
  def createPageLayout(
    context: ClientContext,
    parameters: typingsSlinky.sharepoint.SP.Publishing.PageLayoutCreationInformation
  ): Unit = js.native
}

