package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocationSuccess extends js.Object {
  /**
    * 位置的精确度
    */
  var accuracy: js.UndefOr[String] = js.native
  /**
    * 地址信息
    */
  var address: js.UndefOr[js.Any] = js.native
  /**
    * 高度，单位 m
    */
  var altitude: js.UndefOr[Double] = js.native
  /**
    * 水平精度，单位 m
    */
  var horizontalAccuracy: js.UndefOr[Double] = js.native
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * 经度，范围为-180~180，负数表示西经
    */
  var longitude: js.UndefOr[Double] = js.native
  /**
    * 速度，浮点数，单位m/s
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * 垂直精度，单位 m（Android 无法获取，返回 0）
    */
  var verticalAccuracy: js.UndefOr[Double] = js.native
}

object GetLocationSuccess {
  @scala.inline
  def apply(): GetLocationSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationSuccess]
  }
  @scala.inline
  implicit class GetLocationSuccessOps[Self <: GetLocationSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAccuracy")(js.undefined)
        ret
    }
  }
  
}

