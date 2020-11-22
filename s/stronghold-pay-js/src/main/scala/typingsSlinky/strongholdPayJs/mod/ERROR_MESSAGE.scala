package typingsSlinky.strongholdPayJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stronghold-pay-js", "ERROR_MESSAGE")
@js.native
object ERROR_MESSAGE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE with String] = js.native
  
  /* "The 'amount' option was unable to be parsed as number." */ val AMOUNT_BAD_FORMAT: typingsSlinky.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.AMOUNT_BAD_FORMAT with String = js.native
  
  /* "Attribute is required." */ val ATTRIBUTE_REQUIRED: typingsSlinky.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.ATTRIBUTE_REQUIRED with String = js.native
  
  /* "Invalid environment provided. Expect \"live\" or \"sandbox\"." */ val BAD_ENVIRONMENT: typingsSlinky.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.BAD_ENVIRONMENT with String = js.native
}
