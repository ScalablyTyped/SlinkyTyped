package typingsSlinky.systeminformation.mod

import typingsSlinky.systeminformation.mod.Systeminformation.DockerContainerStatsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "dockerContainerStats")
@js.native
object dockerContainerStats extends js.Object {
  
  def apply(): js.Promise[js.Array[DockerContainerStatsData]] = js.native
  def apply(id: js.UndefOr[scala.Nothing], cb: js.Function1[/* data */ js.Array[DockerContainerStatsData], _]): js.Promise[js.Array[DockerContainerStatsData]] = js.native
  def apply(id: String): js.Promise[js.Array[DockerContainerStatsData]] = js.native
  def apply(id: String, cb: js.Function1[/* data */ js.Array[DockerContainerStatsData], _]): js.Promise[js.Array[DockerContainerStatsData]] = js.native
}
