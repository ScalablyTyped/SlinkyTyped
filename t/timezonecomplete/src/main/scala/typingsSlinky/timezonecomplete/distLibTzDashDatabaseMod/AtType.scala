package typingsSlinky.timezonecomplete.distLibTzDashDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AtType extends js.Object

@JSImport("timezonecomplete/dist/lib/tz-database", "AtType")
@js.native
object AtType extends js.Object {
  /**
    * Local time (no DST)
    */
  @js.native
  sealed trait Standard extends AtType
  
  /**
    * Utc time
    */
  @js.native
  sealed trait Utc extends AtType
  
  /**
    * Wall clock time (local time with DST)
    */
  @js.native
  sealed trait Wall extends AtType
  
  /* 0 */ val Standard: typingsSlinky.timezonecomplete.distLibTzDashDatabaseMod.AtType.Standard with Double = js.native
  /* 2 */ val Utc: typingsSlinky.timezonecomplete.distLibTzDashDatabaseMod.AtType.Utc with Double = js.native
  /* 1 */ val Wall: typingsSlinky.timezonecomplete.distLibTzDashDatabaseMod.AtType.Wall with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AtType with Double] = js.native
}

