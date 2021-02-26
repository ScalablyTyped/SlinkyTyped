package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileLevel extends StObject
@JSGlobal("SP.FileLevel")
@js.native
object FileLevel extends StObject {
  
  @js.native
  sealed trait checkout extends FileLevel
  
  @js.native
  sealed trait draft extends FileLevel
  
  @js.native
  sealed trait published extends FileLevel
}
