package typingsSlinky.shellQuote.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shell-quote", "parse")
@js.native
object parse extends js.Object {
  def apply(cmd: String): js.Array[ParseEntry] = js.native
  def apply(cmd: String, env: js.Function1[/* key */ String, String | js.Object]): js.Array[ParseEntry] = js.native
  def apply(
    cmd: String,
    env: js.Function1[/* key */ String, String | js.Object],
    opts: StringDictionary[String]
  ): js.Array[ParseEntry] = js.native
  def apply(cmd: String, env: StringDictionary[String]): js.Array[ParseEntry] = js.native
  def apply(cmd: String, env: StringDictionary[String], opts: StringDictionary[String]): js.Array[ParseEntry] = js.native
}

