package typingsSlinky.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptional extends js.Object {
  var errorFilter: js.UndefOr[
    js.Function3[/* errorMsg */ String, /* errorCode */ String, /* type */ String, Unit]
  ] = js.native
  var messages: js.UndefOr[StringDictionary[String]] = js.native
  var overrideMessages: js.UndefOr[Boolean] = js.native
}

object ValidationOptional {
  @scala.inline
  def apply(): ValidationOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptional]
  }
  @scala.inline
  implicit class ValidationOptionalOps[Self <: ValidationOptional] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorFilter(value: (/* errorMsg */ String, /* errorCode */ String, /* type */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutErrorFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMessages")(js.undefined)
        ret
    }
  }
  
}

