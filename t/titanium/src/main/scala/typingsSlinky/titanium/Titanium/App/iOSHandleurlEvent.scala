package typingsSlinky.titanium.Titanium.App

import typingsSlinky.titanium.LaunchOptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a new URL is handled by the application.
		 */
@js.native
trait iOSHandleurlEvent extends iOSBaseEvent {
  /**
  			 * The launch options that are related to opening the URL.
  			 */
  var launchOptions: LaunchOptionsType = js.native
}

object iOSHandleurlEvent {
  @scala.inline
  def apply(launchOptions: LaunchOptionsType, source: iOS): iOSHandleurlEvent = {
    val __obj = js.Dynamic.literal(launchOptions = launchOptions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSHandleurlEvent]
  }
  @scala.inline
  implicit class iOSHandleurlEventOps[Self <: iOSHandleurlEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchOptions(value: LaunchOptionsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

