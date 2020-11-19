package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AppCatalog")
@js.native
class AppCatalog ()
  extends typingsSlinky.sharepoint.SP.AppCatalog
/* static members */
@JSGlobal("SP.AppCatalog")
@js.native
object AppCatalog extends js.Object {
  
  def getAppInstances(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.ClientObjectList[typingsSlinky.sharepoint.SP.AppInstance] = js.native
  
  def getDeveloperSiteAppInstancesByIds(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    site: typingsSlinky.sharepoint.SP.Site,
    appInstanceIds: js.Array[typingsSlinky.sharepoint.SP.Guid]
  ): typingsSlinky.sharepoint.SP.ClientObjectList[typingsSlinky.sharepoint.SP.AppInstance] = js.native
  
  def isAppSideloadingEnabled(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.BooleanResult = js.native
}
