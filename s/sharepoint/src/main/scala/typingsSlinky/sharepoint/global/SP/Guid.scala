package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Guid")
@js.native
class Guid protected ()
  extends typingsSlinky.sharepoint.SP.Guid {
  def this(guidText: String) = this()
}
/* static members */
@JSGlobal("SP.Guid")
@js.native
object Guid extends js.Object {
  
  def get_empty(): typingsSlinky.sharepoint.SP.Guid = js.native
  
  def isValid(uuid: String): Boolean = js.native
  
  def newGuid(): typingsSlinky.sharepoint.SP.Guid = js.native
}
