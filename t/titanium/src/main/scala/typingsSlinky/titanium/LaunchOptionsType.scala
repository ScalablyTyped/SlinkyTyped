package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters used to identify an incoming URL that is handled
  * by the application.
  */
@js.native
trait LaunchOptionsType extends js.Object {
  /**
  	 * The application or service that triggered the handled URL.
  	 */
  var source: js.UndefOr[java.lang.String] = js.native
  /**
  	 * The url that was triggered by the application or service.
  	 */
  var url: js.UndefOr[java.lang.String] = js.native
}

object LaunchOptionsType {
  @scala.inline
  def apply(): LaunchOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptionsType]
  }
  @scala.inline
  implicit class LaunchOptionsTypeOps[Self <: LaunchOptionsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

