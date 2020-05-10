package typingsSlinky.typeahead.Bloodhound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BloodhoundOptions[T] extends js.Object {
  /**
    * Given a datum, returns a unique id for it.
    * Defaults to JSON.stringify. Note that it is highly recommended
    * to override this option.
    *
    * @param datum Suggestion.
    * @returns Unique id for the suggestion.
    */
  var identify: js.UndefOr[js.Function1[/* datum */ T, Double]] = js.native
  /**
    * If set to false, the Bloodhound instance will not be implicitly
    * initialized by the constructor function. Defaults to true.
    */
  var initialize: js.UndefOr[Boolean] = js.native
  /**
    * An array of data or a function that returns an array of data.
    * The data will be added to the internal search index when #initialize is called.
    */
  var local: js.UndefOr[js.Array[T] | js.Function0[js.Array[T]]] = js.native
  /**
    * Can be a URL to a JSON file containing an array of data or,
    * if more configurability is needed, a prefetch options hash.
    */
  var prefetch: js.UndefOr[String | PrefetchOptions[T]] = js.native
  /**
    * Can be a URL to fetch data from when the data provided by the internal
    * search index is insufficient or, if more configurability is needed,
    * a remote options hash.
    */
  var remote: js.UndefOr[String | RemoteOptions[T]] = js.native
  /**
    * A compare function used to sort data returned from the internal search index.
    *
    * @param a First suggestion.
    * @param b Second suggestion.
    * @returns Comparison result.
    */
  var sorter: js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.native
  /**
    * If the number of datums provided from the internal search index is
    * less than sufficient, remote will be used to backfill search
    * requests triggered by calling #search. Defaults to 5.
    */
  var sufficient: js.UndefOr[Double] = js.native
  /**
    * Transforms a datum into an array of string tokens.
    *
    * @param datum Suggestion.
    * @returns An array of string tokens.
    */
  def datumTokenizer(datum: T): js.Array[String] = js.native
  /**
    * Transforms a query into an array of string tokens.
    *
    * @param quiery Query.
    * @returns An array of string tokens.
    */
  def queryTokenizer(query: String): js.Array[String] = js.native
}

object BloodhoundOptions {
  @scala.inline
  def apply[T](datumTokenizer: T => js.Array[String], queryTokenizer: String => js.Array[String]): BloodhoundOptions[T] = {
    val __obj = js.Dynamic.literal(datumTokenizer = js.Any.fromFunction1(datumTokenizer), queryTokenizer = js.Any.fromFunction1(queryTokenizer))
    __obj.asInstanceOf[BloodhoundOptions[T]]
  }
  @scala.inline
  implicit class BloodhoundOptionsOps[Self[t] <: BloodhoundOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDatumTokenizer(value: T => js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datumTokenizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueryTokenizer(value: String => js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTokenizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIdentify(value: /* datum */ T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIdentify: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identify")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalFunction0(value: () => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocal(value: js.Array[T] | js.Function0[js.Array[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefetch(value: String | PrefetchOptions[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefetch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: String | RemoteOptions[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
    @scala.inline
    def withSorter(value: (/* a */ T, /* b */ T) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSorter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.undefined)
        ret
    }
    @scala.inline
    def withSufficient(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sufficient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSufficient: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sufficient")(js.undefined)
        ret
    }
  }
  
}

