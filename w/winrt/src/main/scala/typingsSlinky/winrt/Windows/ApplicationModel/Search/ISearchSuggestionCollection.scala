package typingsSlinky.winrt.Windows.ApplicationModel.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchSuggestionCollection extends js.Object {
  var size: Double = js.native
  def appendQuerySuggestion(text: String): Unit = js.native
  def appendQuerySuggestions(suggestions: IIterable[String]): Unit = js.native
  def appendResultSuggestion(
    text: String,
    detailText: String,
    tag: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String
  ): Unit = js.native
  def appendSearchSeparator(label: String): Unit = js.native
}

object ISearchSuggestionCollection {
  @scala.inline
  def apply(
    appendQuerySuggestion: String => Unit,
    appendQuerySuggestions: IIterable[String] => Unit,
    appendResultSuggestion: (String, String, String, IRandomAccessStreamReference, String) => Unit,
    appendSearchSeparator: String => Unit,
    size: Double
  ): ISearchSuggestionCollection = {
    val __obj = js.Dynamic.literal(appendQuerySuggestion = js.Any.fromFunction1(appendQuerySuggestion), appendQuerySuggestions = js.Any.fromFunction1(appendQuerySuggestions), appendResultSuggestion = js.Any.fromFunction5(appendResultSuggestion), appendSearchSeparator = js.Any.fromFunction1(appendSearchSeparator), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchSuggestionCollection]
  }
  @scala.inline
  implicit class ISearchSuggestionCollectionOps[Self <: ISearchSuggestionCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendQuerySuggestion(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendQuerySuggestion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendQuerySuggestions(value: IIterable[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendQuerySuggestions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendResultSuggestion(value: (String, String, String, IRandomAccessStreamReference, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendResultSuggestion")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAppendSearchSeparator(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendSearchSeparator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

