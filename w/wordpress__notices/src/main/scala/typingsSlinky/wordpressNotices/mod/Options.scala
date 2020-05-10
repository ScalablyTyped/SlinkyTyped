package typingsSlinky.wordpressNotices.mod

import typingsSlinky.wordpressNotices.wordpressNoticesStrings.default
import typingsSlinky.wordpressNotices.wordpressNoticesStrings.snackbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * User actions to be presented with notice.
    */
  var actions: js.Array[Action] = js.native
  /**
    * Context under which to group notice.
    * @defaultValue `'global'`
    */
  var context: String = js.native
  /**
    * Identifier for notice. Automatically assigned if not specified.
    */
  var id: String = js.native
  /**
    * Whether the notice can be dismissed by user.
    * @defaultValue `true`
    */
  var isDismissible: Boolean = js.native
  /**
    * Whether the notice content should be announced to screen readers.
    * @defaultValue `true`
    */
  var speak: Boolean = js.native
  /**
    * The type of notice.
    * @defaultValue `'default'`
    */
  var `type`: default | snackbar = js.native
}

object Options {
  @scala.inline
  def apply(
    actions: js.Array[Action],
    context: String,
    id: String,
    isDismissible: Boolean,
    speak: Boolean,
    `type`: default | snackbar
  ): Options = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], speak = speak.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[Action]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDismissible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDismissible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: default | snackbar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

