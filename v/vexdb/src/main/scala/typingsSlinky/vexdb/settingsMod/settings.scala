package typingsSlinky.vexdb.settingsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vexdb.anon.PollTime
import typingsSlinky.vexdb.anon.Ttl
import typingsSlinky.vexdb.requestObjectsMod.RequestObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait settings extends js.Object {
  var baseURL: String = js.native
  var cache: Ttl = js.native
  var headers: StringDictionary[String] = js.native
  var live: PollTime = js.native
  var params: RequestObject = js.native
}

@JSImport("vexdb/out/constants/settings", "settings")
@js.native
object settings extends TopLevel[settings]

