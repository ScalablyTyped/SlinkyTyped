package typingsSlinky.sheetify

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sheetify", JSImport.Namespace)
@js.native
object sheetifyMod extends js.Object {
  def apply(src: String): String = js.native
  def apply(src: String, filename: String): String = js.native
  def apply(src: String, filename: String, options: StringDictionary[js.Any]): String = js.native
  def apply(
    src: String,
    filename: String,
    options: StringDictionary[js.Any],
    done: js.Function3[/* err */ js.Error, /* css */ String, /* prefix */ String, Unit]
  ): String = js.native
  def apply(src: String, options: StringDictionary[js.Any]): Unit = js.native
  def apply(src: TemplateStringsArray): String = js.native
  def apply(src: TemplateStringsArray, filename: String): String = js.native
  def apply(src: TemplateStringsArray, filename: String, options: StringDictionary[js.Any]): String = js.native
  def apply(
    src: TemplateStringsArray,
    filename: String,
    options: StringDictionary[js.Any],
    done: js.Function3[/* err */ js.Error, /* css */ String, /* prefix */ String, Unit]
  ): String = js.native
  def apply(src: TemplateStringsArray, options: StringDictionary[js.Any]): Unit = js.native
  def getPrefix(css: String): String = js.native
}

