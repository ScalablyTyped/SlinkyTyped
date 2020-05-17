package typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables access to the search suggestions that the SearchSuggestionManager provides. */
@js.native
trait SearchSuggestion extends js.Object {
  /** Gets the value that was passed to the detailText parameter of the AppendResultSuggestion method. */
  var detailText: String = js.native
  /** Gets the value that was passed to the image parameter of the AppendResultSuggestion method. */
  var image: IRandomAccessStreamReference = js.native
  /** Gets the value that was passed to the imageAlternateText parameter of the AppendResultSuggestion method. */
  var imageAlternateText: String = js.native
  /** Gets the type of suggestion. */
  var kind: SearchSuggestionKind = js.native
  /** Gets the value that was passed to the tag parameter of the AppendResultSuggestion method. */
  var tag: String = js.native
  /** Gets the localized text of the suggestion for display in the search suggestions UI. */
  var text: String = js.native
}

object SearchSuggestion {
  @scala.inline
  def apply(
    detailText: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String,
    kind: SearchSuggestionKind,
    tag: String,
    text: String
  ): SearchSuggestion = {
    val __obj = js.Dynamic.literal(detailText = detailText.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageAlternateText = imageAlternateText.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestion]
  }
  @scala.inline
  implicit class SearchSuggestionOps[Self <: SearchSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageAlternateText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlternateText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: SearchSuggestionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

