package typingsSlinky.swaggerNodeRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSwagger extends js.Object {
  var swagger: AnonPath = js.native
}

object AnonSwagger {
  @scala.inline
  def apply(swagger: AnonPath): AnonSwagger = {
    val __obj = js.Dynamic.literal(swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSwagger]
  }
  @scala.inline
  implicit class AnonSwaggerOps[Self <: AnonSwagger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSwagger(value: AnonPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swagger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

