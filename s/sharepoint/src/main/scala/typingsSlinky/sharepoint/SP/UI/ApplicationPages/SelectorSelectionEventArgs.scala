package typingsSlinky.sharepoint.SP.UI.ApplicationPages

import typingsSlinky.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorSelectionEventArgs extends EventArgs {
  def get_entities(): js.Any = js.native
}

object SelectorSelectionEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_entities: () => js.Any): SelectorSelectionEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_entities = js.Any.fromFunction0(get_entities))
    __obj.asInstanceOf[SelectorSelectionEventArgs]
  }
  @scala.inline
  implicit class SelectorSelectionEventArgsOps[Self <: SelectorSelectionEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_entities(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_entities")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

