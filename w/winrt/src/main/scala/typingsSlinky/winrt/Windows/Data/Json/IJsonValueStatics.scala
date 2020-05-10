package typingsSlinky.winrt.Windows.Data.Json

import typingsSlinky.winrt.AnonResultSucceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonValueStatics extends js.Object {
  def createBooleanValue(input: Boolean): JsonValue = js.native
  def createNumberValue(input: Double): JsonValue = js.native
  def createStringValue(input: String): JsonValue = js.native
  def parse(input: String): JsonValue = js.native
  def tryParse(input: String): AnonResultSucceeded = js.native
}

object IJsonValueStatics {
  @scala.inline
  def apply(
    createBooleanValue: Boolean => JsonValue,
    createNumberValue: Double => JsonValue,
    createStringValue: String => JsonValue,
    parse: String => JsonValue,
    tryParse: String => AnonResultSucceeded
  ): IJsonValueStatics = {
    val __obj = js.Dynamic.literal(createBooleanValue = js.Any.fromFunction1(createBooleanValue), createNumberValue = js.Any.fromFunction1(createNumberValue), createStringValue = js.Any.fromFunction1(createStringValue), parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonValueStatics]
  }
  @scala.inline
  implicit class IJsonValueStaticsOps[Self <: IJsonValueStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateBooleanValue(value: Boolean => JsonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBooleanValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateNumberValue(value: Double => JsonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNumberValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateStringValue(value: String => JsonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStringValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: String => JsonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryParse(value: String => AnonResultSucceeded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryParse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

