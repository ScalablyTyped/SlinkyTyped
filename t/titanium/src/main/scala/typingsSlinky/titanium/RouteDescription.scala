package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Object describing the current audio route.
  */
@js.native
trait RouteDescription extends js.Object {
  /**
  	 * An Array of current input ports for the session. See the `AUDIO_SESSION_PORT` constants.
  	 */
  var inputs: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
  	 * An Array of current output ports for the session. See the `AUDIO_SESSION_PORT` constants.
  	 */
  var outputs: js.UndefOr[js.Array[java.lang.String]] = js.native
}

object RouteDescription {
  @scala.inline
  def apply(): RouteDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteDescription]
  }
  @scala.inline
  implicit class RouteDescriptionOps[Self <: RouteDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
  }
  
}

