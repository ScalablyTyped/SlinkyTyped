package typingsSlinky.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Exception Description
    *
    * Specifies the description of an exception.
    *
    * Max length: 150 Bytes
    *
    * Example value: `DatabaseError`
    */
  var exd: js.UndefOr[String] = js.native
  /**
    * Is Exception Fatal?
    *
    * Specifies whether the exception was fatal.
    */
  var exf: js.UndefOr[Boolean] = js.native
}

object ExceptionParams {
  @scala.inline
  def apply(): ExceptionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExceptionParams]
  }
  @scala.inline
  implicit class ExceptionParamsOps[Self <: ExceptionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exd")(js.undefined)
        ret
    }
    @scala.inline
    def withExf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exf")(js.undefined)
        ret
    }
  }
  
}

