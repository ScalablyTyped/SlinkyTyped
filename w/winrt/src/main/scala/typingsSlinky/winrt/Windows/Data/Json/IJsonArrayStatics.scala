package typingsSlinky.winrt.Windows.Data.Json

import typingsSlinky.winrt.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonArrayStatics extends js.Object {
  def parse(input: String): JsonArray = js.native
  def tryParse(input: String): AnonResult = js.native
}

object IJsonArrayStatics {
  @scala.inline
  def apply(parse: String => JsonArray, tryParse: String => AnonResult): IJsonArrayStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonArrayStatics]
  }
  @scala.inline
  implicit class IJsonArrayStaticsOps[Self <: IJsonArrayStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: String => JsonArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryParse(value: String => AnonResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryParse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

