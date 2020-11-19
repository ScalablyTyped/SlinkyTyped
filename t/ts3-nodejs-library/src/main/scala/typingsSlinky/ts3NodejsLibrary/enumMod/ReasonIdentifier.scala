package typingsSlinky.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReasonIdentifier extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "ReasonIdentifier")
@js.native
object ReasonIdentifier extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReasonIdentifier with Double] = js.native
  
  /** kick client from channel */
  @js.native
  sealed trait KICK_CHANNEL extends ReasonIdentifier
  /* 4 */ @js.native
  object KICK_CHANNEL extends TopLevel[KICK_CHANNEL with Double]
  
  /** kick client from server */
  @js.native
  sealed trait KICK_SERVER extends ReasonIdentifier
  /* 5 */ @js.native
  object KICK_SERVER extends TopLevel[KICK_SERVER with Double]
}
