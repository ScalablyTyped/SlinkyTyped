package typingsSlinky.wxDashServerDashSdk.wxDashServerDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var Geo: typingsSlinky.wxDashServerDashSdk.wxDashServerDashSdkMod.Geo = js.native
  var command: Command = js.native
  var createCollection: js.Promise[CreateCollectionSuccess] = js.native
  def RegExp(options: RegExpOptions): js.RegExp = js.native
  def collection(name: String): Collection = js.native
  def serverDate(): js.Date = js.native
  def serverDate(options: js.Object): js.Date = js.native
}

@JSImport("wx-server-sdk", "database")
@js.native
object database extends js.Object {
  // 数据库 API
  def apply(): Database = js.native
  def apply(options: DatabaseOptions): Database = js.native
}

