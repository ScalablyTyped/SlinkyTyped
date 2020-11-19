package typingsSlinky.systeminformation.mod

import typingsSlinky.systeminformation.mod.Systeminformation.VersionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "versions")
@js.native
object versions extends js.Object {
  
  def apply(): js.Promise[VersionData] = js.native
  def apply(apps: js.UndefOr[scala.Nothing], cb: js.Function1[/* data */ VersionData, _]): js.Promise[VersionData] = js.native
  def apply(apps: String): js.Promise[VersionData] = js.native
  def apply(apps: String, cb: js.Function1[/* data */ VersionData, _]): js.Promise[VersionData] = js.native
}
