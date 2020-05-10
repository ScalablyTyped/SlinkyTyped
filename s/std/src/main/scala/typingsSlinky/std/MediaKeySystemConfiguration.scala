package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeySystemConfiguration extends js.Object {
  var audioCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.native
  var distinctiveIdentifier: js.UndefOr[MediaKeysRequirement] = js.native
  var initDataTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  var label: js.UndefOr[java.lang.String] = js.native
  var persistentState: js.UndefOr[MediaKeysRequirement] = js.native
  var sessionTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  var videoCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.native
}

object MediaKeySystemConfiguration {
  @scala.inline
  def apply(): MediaKeySystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeySystemConfiguration]
  }
  @scala.inline
  implicit class MediaKeySystemConfigurationOps[Self <: MediaKeySystemConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioCapabilities(value: js.Array[MediaKeySystemMediaCapability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withDistinctiveIdentifier(value: MediaKeysRequirement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinctiveIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistinctiveIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinctiveIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withInitDataTypes(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initDataTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitDataTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initDataTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentState(value: MediaKeysRequirement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentState")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionTypes(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoCapabilities(value: js.Array[MediaKeySystemMediaCapability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCapabilities")(js.undefined)
        ret
    }
  }
  
}

