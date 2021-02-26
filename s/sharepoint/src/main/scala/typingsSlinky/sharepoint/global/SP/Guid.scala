package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Guid")
@js.native
class Guid protected ()
  extends typingsSlinky.sharepoint.SP.Guid {
  def this(guidText: String) = this()
}
object Guid {
  
  /* static member */
  @JSGlobal("SP.Guid.get_empty")
  @js.native
  def getEmpty(): typingsSlinky.sharepoint.SP.Guid = js.native
  
  /* static member */
  @JSGlobal("SP.Guid.isValid")
  @js.native
  def isValid(uuid: String): Boolean = js.native
  
  /* static member */
  @JSGlobal("SP.Guid.newGuid")
  @js.native
  def newGuid(): typingsSlinky.sharepoint.SP.Guid = js.native
}
