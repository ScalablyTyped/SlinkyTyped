package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageVariant extends js.Object
@JSImport("typescript", "LanguageVariant")
@js.native
object LanguageVariant extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageVariant with Double] = js.native
  
  @js.native
  sealed trait JSX extends LanguageVariant
  /* 1 */ @js.native
  object JSX extends TopLevel[JSX with Double]
  
  @js.native
  sealed trait Standard extends LanguageVariant
  /* 0 */ @js.native
  object Standard extends TopLevel[Standard with Double]
}
