package typingsSlinky.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponents extends js.Object {
  /**
    * Routing path (keys) from origin and file-path 
    * (values) to custom REST components.
    * Use the RestRouterGenerator plugin to generate 
    * a template router (see the generated file for more info).
    *   config.rest.components = {};
    */
  var components: js.Any = js.native
}

object AnonComponents {
  @scala.inline
  def apply(components: js.Any): AnonComponents = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponents]
  }
  @scala.inline
  implicit class AnonComponentsOps[Self <: AnonComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

