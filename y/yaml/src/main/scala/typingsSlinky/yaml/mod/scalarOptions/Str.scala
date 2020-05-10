package typingsSlinky.yaml.mod.scalarOptions

import typingsSlinky.yaml.AnonJsonEncoding
import typingsSlinky.yaml.AnonLineWidth
import typingsSlinky.yaml.typesMod.Scalar.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Str extends js.Object {
  /**
    * The default type of string literal used to stringify values
    *
    * Default: `'PLAIN'`
    */
  var defaultType: Type = js.native
  var doubleQuoted: AnonJsonEncoding = js.native
  var fold: AnonLineWidth = js.native
}

object Str {
  @scala.inline
  def apply(defaultType: Type, doubleQuoted: AnonJsonEncoding, fold: AnonLineWidth): Str = {
    val __obj = js.Dynamic.literal(defaultType = defaultType.asInstanceOf[js.Any], doubleQuoted = doubleQuoted.asInstanceOf[js.Any], fold = fold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Str]
  }
  @scala.inline
  implicit class StrOps[Self <: Str] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubleQuoted(value: AnonJsonEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleQuoted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFold(value: AnonLineWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

