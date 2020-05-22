package typingsSlinky.yaml.mod.scalarOptions

import typingsSlinky.yaml.anon.JsonEncoding
import typingsSlinky.yaml.anon.LineWidth
import typingsSlinky.yaml.typesMod.Scalar.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Str extends js.Object {
  /**
    * The default type of string literal used to stringify values
    *
    * Default: `'PLAIN'`
    */
  var defaultType: Type
  var doubleQuoted: JsonEncoding
  var fold: LineWidth
}

object Str {
  @scala.inline
  def apply(defaultType: Type, doubleQuoted: JsonEncoding, fold: LineWidth): Str = {
    val __obj = js.Dynamic.literal(defaultType = defaultType.asInstanceOf[js.Any], doubleQuoted = doubleQuoted.asInstanceOf[js.Any], fold = fold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Str]
  }
}

