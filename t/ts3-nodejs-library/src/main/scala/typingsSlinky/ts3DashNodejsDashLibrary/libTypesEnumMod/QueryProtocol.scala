package typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryProtocol extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "QueryProtocol")
@js.native
object QueryProtocol extends js.Object {
  @js.native
  sealed trait RAW extends QueryProtocol
  
  @js.native
  sealed trait SSH extends QueryProtocol
  
  /* "raw" */ val RAW: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.QueryProtocol.RAW with String = js.native
  /* "ssh" */ val SSH: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.QueryProtocol.SSH with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QueryProtocol with String] = js.native
}

