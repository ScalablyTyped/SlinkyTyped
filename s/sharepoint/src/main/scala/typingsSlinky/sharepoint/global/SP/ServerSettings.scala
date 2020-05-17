package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ServerSettings")
@js.native
class ServerSettings ()
  extends typingsSlinky.sharepoint.SP.ServerSettings

/* static members */
@JSGlobal("SP.ServerSettings")
@js.native
object ServerSettings extends js.Object {
  def getAlternateUrls(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.ClientObjectList[typingsSlinky.sharepoint.SP.AlternateUrl] = js.native
  def getGlobalInstalledLanguages(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, compatibilityLevel: Double): js.Array[typingsSlinky.sharepoint.SP.Language] = js.native
}

