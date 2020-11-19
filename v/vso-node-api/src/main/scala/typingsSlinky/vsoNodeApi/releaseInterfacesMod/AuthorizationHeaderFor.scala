package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuthorizationHeaderFor extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AuthorizationHeaderFor")
@js.native
object AuthorizationHeaderFor extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthorizationHeaderFor with Double] = js.native
  
  @js.native
  sealed trait OnBehalfOf extends AuthorizationHeaderFor
  /* 1 */ @js.native
  object OnBehalfOf extends TopLevel[OnBehalfOf with Double]
  
  @js.native
  sealed trait RevalidateApproverIdentity extends AuthorizationHeaderFor
  /* 0 */ @js.native
  object RevalidateApproverIdentity extends TopLevel[RevalidateApproverIdentity with Double]
}
