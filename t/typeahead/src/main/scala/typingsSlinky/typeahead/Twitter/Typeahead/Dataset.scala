package typingsSlinky.typeahead.Twitter.Typeahead

import typingsSlinky.typeahead.Bloodhound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A typeahead is composed of one or more datasets. When an end-user
  * modifies the value of a typeahead, each dataset will attempt to render
  * suggestions for the new value.
  * For most use cases, one dataset should suffice. It's only in the scenario
  * where you want rendered suggestions to be grouped based on some sort of
  * categorical relationship that you'd need to use multiple datasets. For
  * example, on twitter.com, the search typeahead groups results into recent
  * searches, trends, and accounts  that would be a great use case for using
  * multiple datasets.
  */
@js.native
trait Dataset[T] extends js.Object {
  /**
    * Lets the dataset know if async suggestions should be expected.
    * If not set, this information is inferred from the signature of
    * source i.e. if the source function expects 3 arguments, async will
    * be set to true.
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * For a given suggestion, determines the string representation of it.
    * This will be used when setting the value of the input control after
    * a suggestion is selected. Can be either a key string or a function
    * that transforms a suggestion object into a string.
    * Defaults to stringifying the suggestion.
    */
  var display: js.UndefOr[String | (js.Function1[/* obj */ T, String])] = js.native
  /**
    * The max number of suggestions to be displayed. Defaults to 5.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The name of the dataset.
    * This will be appended to {{classNames.dataset}} - to form the class name of the containing DOM element.
    * Must only consist of underscores, dashes, letters (a-z), and numbers.
    * Defaults to a random number.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The backing data source for suggestions.
    * Expected to be a function with the signature (query, syncResults, asyncResults).
    * syncResults should be called with suggestions computed synchronously and
    *  asyncResults should be called with suggestions computed asynchronously
    * (e.g. suggestions that come for an AJAX request).
    *  source can also be a Bloodhound instance.
    */
  var source: Bloodhound[T] | (js.Function3[
    /* query */ String, 
    /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], 
    /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]], 
    Unit
  ]) = js.native
  /**
    * A hash of templates to be used when rendering the dataset. Note a
    * precompiled template is a function that takes a JavaScript object as
    * its first argument and returns a HTML string.
    */
  var templates: js.UndefOr[Templates[T]] = js.native
}

object Dataset {
  @scala.inline
  def apply[T](
    source: Bloodhound[T] | (js.Function3[
      /* query */ String, 
      /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], 
      /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]], 
      Unit
    ])
  ): Dataset[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset[T]]
  }
  @scala.inline
  implicit class DatasetOps[Self[t] <: Dataset[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSourceFunction3(
      value: (/* query */ String, /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSource(
      value: Bloodhound[T] | (js.Function3[
          /* query */ String, 
          /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], 
          /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]], 
          Unit
        ])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFunction1(value: /* obj */ T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplay(value: String | (js.Function1[/* obj */ T, String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: Templates[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
  }
  
}

