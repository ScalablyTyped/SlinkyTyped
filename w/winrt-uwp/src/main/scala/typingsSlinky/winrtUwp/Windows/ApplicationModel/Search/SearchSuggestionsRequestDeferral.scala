package typingsSlinky.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the app to signal when it has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. Use a deferral if and only if your app needs to respond to a request for suggestions asynchronously. */
@js.native
trait SearchSuggestionsRequestDeferral extends js.Object {
  /** Signals that the app has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. */
  def complete(): Unit = js.native
}

object SearchSuggestionsRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): SearchSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SearchSuggestionsRequestDeferral]
  }
  @scala.inline
  implicit class SearchSuggestionsRequestDeferralOps[Self <: SearchSuggestionsRequestDeferral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

