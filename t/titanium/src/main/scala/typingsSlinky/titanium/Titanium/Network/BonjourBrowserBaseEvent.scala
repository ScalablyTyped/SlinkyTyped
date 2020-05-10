package typingsSlinky.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.Network.BonjourBrowser
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait BonjourBrowserBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: BonjourBrowser = js.native
}

object BonjourBrowserBaseEvent {
  @scala.inline
  def apply(source: BonjourBrowser): BonjourBrowserBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourBrowserBaseEvent]
  }
  @scala.inline
  implicit class BonjourBrowserBaseEventOps[Self <: BonjourBrowserBaseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: BonjourBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

