package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtConfig extends js.Object {
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.Any = js.native
}

object AnonExtConfig {
  @scala.inline
  def apply(extConfig: js.Any): AnonExtConfig = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtConfig]
  }
  @scala.inline
  implicit class AnonExtConfigOps[Self <: AnonExtConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

