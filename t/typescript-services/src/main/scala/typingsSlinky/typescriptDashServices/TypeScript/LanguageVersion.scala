package typingsSlinky.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LanguageVersion extends js.Object

@JSGlobal("TypeScript.LanguageVersion")
@js.native
object LanguageVersion extends js.Object {
  @js.native
  sealed trait EcmaScript3 extends LanguageVersion
  
  @js.native
  sealed trait EcmaScript5 extends LanguageVersion
  
  /* 0 */ val EcmaScript3: typingsSlinky.typescriptDashServices.TypeScript.LanguageVersion.EcmaScript3 with Double = js.native
  /* 1 */ val EcmaScript5: typingsSlinky.typescriptDashServices.TypeScript.LanguageVersion.EcmaScript5 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageVersion with Double] = js.native
}

