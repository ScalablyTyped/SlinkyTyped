package typingsSlinky.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database_ extends js.Object {
  var Geo: typingsSlinky.wxServerSdk.mod.Geo = js.native
  var command: Command = js.native
  var createCollection: js.Promise[CreateCollectionSuccess] = js.native
  def RegExp(options: RegExpOptions): js.RegExp = js.native
  def collection(name: String): Collection = js.native
  def serverDate(): js.Date = js.native
  def serverDate(options: js.Object): js.Date = js.native
}

