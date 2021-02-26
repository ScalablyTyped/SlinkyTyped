package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SignatureKind extends StObject
@JSImport("typescript", "SignatureKind")
@js.native
object SignatureKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureKind with Double] = js.native
  
  @js.native
  sealed trait Call extends SignatureKind
  /* 0 */ val Call: typingsSlinky.typescript.mod.SignatureKind.Call with Double = js.native
  
  @js.native
  sealed trait Construct extends SignatureKind
  /* 1 */ val Construct: typingsSlinky.typescript.mod.SignatureKind.Construct with Double = js.native
}
