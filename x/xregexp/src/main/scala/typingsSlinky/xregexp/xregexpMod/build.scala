package typingsSlinky.xregexp.xregexpMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "build")
@js.native
object build extends js.Object {
  def apply(pattern: String, subs: js.Array[String]): js.RegExp = js.native
  def apply(pattern: String, subs: js.Array[String], flags: String): js.RegExp = js.native
  def apply(pattern: String, subs: StringDictionary[RegExp]): js.RegExp = js.native
  def apply(pattern: String, subs: StringDictionary[RegExp], flags: String): js.RegExp = js.native
}

