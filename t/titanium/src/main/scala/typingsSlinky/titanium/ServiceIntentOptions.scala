package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to <Titanium.Android.createServiceIntent>.
  */
@js.native
trait ServiceIntentOptions extends js.Object {
  /**
  	 * One of the `START_*` constants from <Titanium.Android> to specify the "stickiness" of the Service when Android shuts down the host application.
  	 */
  var startMode: js.UndefOr[Double] = js.native
  /**
  	 * URL for the service's JavaScript.
  	 */
  var url: js.UndefOr[java.lang.String] = js.native
}

object ServiceIntentOptions {
  @scala.inline
  def apply(): ServiceIntentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceIntentOptions]
  }
  @scala.inline
  implicit class ServiceIntentOptionsOps[Self <: ServiceIntentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMode")(js.undefined)
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

