package typingsSlinky.unlCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElevationType extends js.Object
@JSImport("unl-core", "ElevationType")
@js.native
object ElevationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ElevationType with String] = js.native
  
  @js.native
  sealed trait floor extends ElevationType
  /* "floor" */ @js.native
  object floor extends TopLevel[floor with String]
  
  @js.native
  sealed trait heightincm extends ElevationType
  /* "heightincm" */ @js.native
  object heightincm extends TopLevel[heightincm with String]
}
