package typingsSlinky.twilioSync.servicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var backoffConfig: js.Any = js.native
  var documentsUri: String = js.native
  var insightsUri: String = js.native
  var listsUri: String = js.native
  var mapsUri: String = js.native
  var sessionStorageEnabled: Boolean = js.native
  var streamsUri: String = js.native
  var subscriptionsUri: String = js.native
}

object Configuration {
  @scala.inline
  def apply(
    backoffConfig: js.Any,
    documentsUri: String,
    insightsUri: String,
    listsUri: String,
    mapsUri: String,
    sessionStorageEnabled: Boolean,
    streamsUri: String,
    subscriptionsUri: String
  ): Configuration = {
    val __obj = js.Dynamic.literal(backoffConfig = backoffConfig.asInstanceOf[js.Any], documentsUri = documentsUri.asInstanceOf[js.Any], insightsUri = insightsUri.asInstanceOf[js.Any], listsUri = listsUri.asInstanceOf[js.Any], mapsUri = mapsUri.asInstanceOf[js.Any], sessionStorageEnabled = sessionStorageEnabled.asInstanceOf[js.Any], streamsUri = streamsUri.asInstanceOf[js.Any], subscriptionsUri = subscriptionsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackoffConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentsUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentsUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsightsUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insightsUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListsUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listsUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapsUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapsUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionStorageEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionStorageEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamsUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamsUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionsUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionsUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

