package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientContext extends ClientRuntimeContext {
  
  def get_serverVersion(): String = js.native
  
  def get_site(): Site = js.native
  
  def get_web(): Web = js.native
}
