package typingsSlinky.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional properties that control how the assistant responds. */
@js.native
trait MessageInputOptions extends js.Object {
  /** Whether to return more than one intent. Set to `true` to return all matching intents. */
  var alternate_intents: js.UndefOr[Boolean] = js.native
  /** Whether to return additional diagnostic information. Set to `true` to return additional information under the `output.debug` key. */
  var debug: js.UndefOr[Boolean] = js.native
  /** Whether to restart dialog processing at the root of the dialog, regardless of any previously visited nodes. **Note:** This does not affect `turn_count` or any other context variables. */
  var restart: js.UndefOr[Boolean] = js.native
  /** Whether to return session context with the response. If you specify `true`, the response will include the `context` property. */
  var return_context: js.UndefOr[Boolean] = js.native
}

object MessageInputOptions {
  @scala.inline
  def apply(): MessageInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageInputOptions]
  }
  @scala.inline
  implicit class MessageInputOptionsOps[Self <: MessageInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate_intents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate_intents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternate_intents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate_intents")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withRestart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_context(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_context")(js.undefined)
        ret
    }
  }
  
}

