package typingsSlinky.vexdb.settingsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vexdb.anon.PollTime
import typingsSlinky.vexdb.anon.Ttl
import typingsSlinky.vexdb.requestObjectsMod.RequestObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait settings extends js.Object {
  var baseURL: String
  var cache: Ttl
  var headers: StringDictionary[String]
  var live: PollTime
  var params: RequestObject
}

@JSImport("vexdb/out/constants/settings", "settings")
@js.native
object settings extends TopLevel[settings]

