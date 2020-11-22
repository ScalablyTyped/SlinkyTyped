package typingsSlinky.strongholdPayJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Different Stronghold Pay environments
  */
@JSImport("stronghold-pay-js", "ENVIRONMENT")
@js.native
object ENVIRONMENT extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT with String] = js.native
  
  /* "live" */ val live: typingsSlinky.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.live with String = js.native
  
  /* "sandbox" */ val sandbox: typingsSlinky.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.sandbox with String = js.native
}
