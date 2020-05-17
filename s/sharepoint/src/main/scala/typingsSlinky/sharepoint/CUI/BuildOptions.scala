package typingsSlinky.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptions extends js.Object {
  var attachToDOM: Boolean = js.native
  var clientID: String = js.native
  var dataExtensions: js.Array[_] = js.native
  var fixedPositioningEnabled: Boolean = js.native
  var lazyMenuInit: Boolean = js.native
  var trimmedIds: js.Array[String] = js.native
  var validateServerRendering: Boolean = js.native
}

object BuildOptions {
  @scala.inline
  def apply(
    attachToDOM: Boolean,
    clientID: String,
    dataExtensions: js.Array[_],
    fixedPositioningEnabled: Boolean,
    lazyMenuInit: Boolean,
    trimmedIds: js.Array[String],
    validateServerRendering: Boolean
  ): BuildOptions = {
    val __obj = js.Dynamic.literal(attachToDOM = attachToDOM.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], dataExtensions = dataExtensions.asInstanceOf[js.Any], fixedPositioningEnabled = fixedPositioningEnabled.asInstanceOf[js.Any], lazyMenuInit = lazyMenuInit.asInstanceOf[js.Any], trimmedIds = trimmedIds.asInstanceOf[js.Any], validateServerRendering = validateServerRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions]
  }
  @scala.inline
  implicit class BuildOptionsOps[Self <: BuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachToDOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachToDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataExtensions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedPositioningEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPositioningEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazyMenuInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyMenuInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrimmedIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimmedIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateServerRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateServerRendering")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

