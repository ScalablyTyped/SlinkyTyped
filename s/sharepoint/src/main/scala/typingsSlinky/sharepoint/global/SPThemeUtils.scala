package typingsSlinky.sharepoint.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
@JSGlobal("SPThemeUtils")
@js.native
object SPThemeUtils extends js.Object {
  
  def ApplyCurrentTheme(): Unit = js.native
  
  def Suspend(): Unit = js.native
  
  def UseClientSideTheming(): Boolean = js.native
  
  def WithCurrentTheme(resultCallback: js.Function1[/* themesCache */ js.Any, Unit]): Unit = js.native
}
