package typingsSlinky.sharepoint.global.SP.Publishing

import typingsSlinky.sharepoint.SP.ClientContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.SiteImageRenditions")
@js.native
class SiteImageRenditions ()
  extends typingsSlinky.sharepoint.SP.Publishing.SiteImageRenditions

/* static members */
@JSGlobal("SP.Publishing.SiteImageRenditions")
@js.native
object SiteImageRenditions extends js.Object {
  def getRenditions(context: ClientContext): js.Array[typingsSlinky.sharepoint.SP.Publishing.ImageRendition] = js.native
  def setRenditions(
    context: ClientContext,
    renditions: js.Array[typingsSlinky.sharepoint.SP.Publishing.ImageRendition]
  ): Unit = js.native
}

