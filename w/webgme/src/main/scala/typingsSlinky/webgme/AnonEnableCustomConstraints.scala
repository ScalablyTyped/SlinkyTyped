package typingsSlinky.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnableCustomConstraints extends js.Object {
  // GmeClasses.Core;
  /**
    * If true will enable validation (which takes place on the server) 
    * of custom constraints defined in the meta nodes.
    *   config.core.enableCustomConstraints = false;
    */
  var enableCustomConstraints: Boolean = js.native
}

object AnonEnableCustomConstraints {
  @scala.inline
  def apply(enableCustomConstraints: Boolean): AnonEnableCustomConstraints = {
    val __obj = js.Dynamic.literal(enableCustomConstraints = enableCustomConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnableCustomConstraints]
  }
  @scala.inline
  implicit class AnonEnableCustomConstraintsOps[Self <: AnonEnableCustomConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableCustomConstraints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCustomConstraints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

