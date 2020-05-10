package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSpecificParameterObject extends js.Object {
  var context_uri: js.UndefOr[String] = js.native
  var device_id: js.UndefOr[String] = js.native
  var offset: js.UndefOr[js.Object] = js.native
  var position_ms: js.UndefOr[Double] = js.native
  var uris: js.UndefOr[js.Array[String]] = js.native
}

object DeviceSpecificParameterObject {
  @scala.inline
  def apply(): DeviceSpecificParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSpecificParameterObject]
  }
  @scala.inline
  implicit class DeviceSpecificParameterObjectOps[Self <: DeviceSpecificParameterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_id")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(js.undefined)
        ret
    }
  }
  
}

