package typingsSlinky.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends js.Object
@JSImport("vscode-languageclient/lib/client", "State")
@js.native
object State extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
  
  @js.native
  sealed trait Running extends State
  /* 2 */ @js.native
  object Running extends TopLevel[Running with Double]
  
  @js.native
  sealed trait Starting extends State
  /* 3 */ @js.native
  object Starting extends TopLevel[Starting with Double]
  
  @js.native
  sealed trait Stopped extends State
  /* 1 */ @js.native
  object Stopped extends TopLevel[Stopped with Double]
}
