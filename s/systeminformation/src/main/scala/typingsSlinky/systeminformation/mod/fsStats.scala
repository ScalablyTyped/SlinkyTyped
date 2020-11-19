package typingsSlinky.systeminformation.mod

import typingsSlinky.systeminformation.mod.Systeminformation.FsStatsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "fsStats")
@js.native
object fsStats extends js.Object {
  
  def apply(): js.Promise[FsStatsData] = js.native
  def apply(cb: js.Function1[/* data */ FsStatsData, _]): js.Promise[FsStatsData] = js.native
}
