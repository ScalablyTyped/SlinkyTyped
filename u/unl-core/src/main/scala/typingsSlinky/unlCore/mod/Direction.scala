package typingsSlinky.unlCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends js.Object
@JSImport("unl-core", "Direction")
@js.native
object Direction extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction with String] = js.native
  
  @js.native
  sealed trait East extends Direction
  /* "E" */ @js.native
  object East extends TopLevel[East with String]
  
  @js.native
  sealed trait North extends Direction
  /* "N" */ @js.native
  object North extends TopLevel[North with String]
  
  @js.native
  sealed trait South extends Direction
  /* "S" */ @js.native
  object South extends TopLevel[South with String]
  
  @js.native
  sealed trait West extends Direction
  /* "W" */ @js.native
  object West extends TopLevel[West with String]
}
