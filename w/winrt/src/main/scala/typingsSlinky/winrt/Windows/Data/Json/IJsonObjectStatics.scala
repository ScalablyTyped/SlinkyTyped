package typingsSlinky.winrt.Windows.Data.Json

import typingsSlinky.winrt.AnonSucceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonObjectStatics extends js.Object {
  def parse(input: String): JsonObject = js.native
  def tryParse(input: String): AnonSucceeded = js.native
}

object IJsonObjectStatics {
  @scala.inline
  def apply(parse: String => JsonObject, tryParse: String => AnonSucceeded): IJsonObjectStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonObjectStatics]
  }
  @scala.inline
  implicit class IJsonObjectStaticsOps[Self <: IJsonObjectStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: String => JsonObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryParse(value: String => AnonSucceeded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryParse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

