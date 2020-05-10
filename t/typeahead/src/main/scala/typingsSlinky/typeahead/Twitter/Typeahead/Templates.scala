package typingsSlinky.typeahead.Twitter.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hash of templates to be used when rendering the dataset. Note a
  * precompiled template is a function that takes a JavaScript object as
  * its first argument and returns a HTML string.
  */
@js.native
trait Templates[T] extends js.Object {
  /**
    * Rendered at the bottom of the dataset when suggestions are present. Can be either a HTML string or
    * a precompiled template. If it's a precompiled template, the passed in context will contain
    * query and suggestions.
    */
  var footer: js.UndefOr[
    String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])
  ] = js.native
  /**
    * Rendered at the top of the dataset when suggestions are present. Can be either a HTML string or
    * a precompiled template. If it's a precompiled template, the passed in context will contain
    * query and suggestions.
    */
  var header: js.UndefOr[
    String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])
  ] = js.native
  /**
    * Rendered when 0 suggestions are available for the given query.
    * Can be either a HTML string or a precompiled template.
    * If it's a precompiled template, the passed in context will contain query.
    */
  var notFound: js.UndefOr[String | (js.Function1[/* query */ String, String])] = js.native
  /**
    * Rendered when 0 synchronous suggestions are available but asynchronous suggestions are expected.
    * Can be either a HTML string or a precompiled template.
    * If it's a precompiled template, the passed in context will contain query.
    */
  var pending: js.UndefOr[String | (js.Function1[/* query */ String, String])] = js.native
  /**
    * Used to render a single suggestion. If set, this has to be a precompiled template.
    * The associated suggestion object will serve as the context.
    * Defaults to the value of display wrapped in a div tag i.e. <div>{{value}}</div>.
    */
  var suggestion: js.UndefOr[js.Function1[/* suggestion */ T, String]] = js.native
}

object Templates {
  @scala.inline
  def apply[T](): Templates[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Templates[T]]
  }
  @scala.inline
  implicit class TemplatesOps[Self[t] <: Templates[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFooterFunction2(value: (/* query */ String, /* suggestions */ js.Array[T]) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFooter(value: String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFunction2(value: (/* query */ String, /* suggestions */ js.Array[T]) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeader(value: String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFoundFunction1(value: /* query */ String => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotFound(value: String | (js.Function1[/* query */ String, String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFound: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingFunction1(value: /* query */ String => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPending(value: String | (js.Function1[/* query */ String, String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestion(value: /* suggestion */ T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuggestion: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestion")(js.undefined)
        ret
    }
  }
  
}

