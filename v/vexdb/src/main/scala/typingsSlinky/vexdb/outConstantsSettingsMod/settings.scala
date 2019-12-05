package typingsSlinky.vexdb.outConstantsSettingsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vexdb.Anon_PollTime
import typingsSlinky.vexdb.Anon_Ttl
import typingsSlinky.vexdb.outConstantsRequestObjectsMod.RequestObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait settings extends js.Object {
  var baseURL: String
  var cache: Anon_Ttl
  var headers: StringDictionary[String]
  var live: Anon_PollTime
  var params: RequestObject
}

@JSImport("vexdb/out/constants/settings", "settings")
@js.native
object settings extends TopLevel[settings]

