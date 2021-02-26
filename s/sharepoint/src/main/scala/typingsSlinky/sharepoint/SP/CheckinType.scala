package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckinType extends StObject
@JSGlobal("SP.CheckinType")
@js.native
object CheckinType extends StObject {
  
  @js.native
  sealed trait majorCheckIn extends CheckinType
  
  @js.native
  sealed trait minorCheckIn extends CheckinType
  
  @js.native
  sealed trait overwriteCheckIn extends CheckinType
}
