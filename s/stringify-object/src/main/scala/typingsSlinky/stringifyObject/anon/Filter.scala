package typingsSlinky.stringifyObject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  var filter: js.UndefOr[js.Function2[/* o */ js.Any, /* prop */ String | js.Symbol, Boolean]] = js.native
  var indent: js.UndefOr[String] = js.native
  var inlineCharacterLimit: js.UndefOr[Double] = js.native
  var singleQuotes: js.UndefOr[Boolean] = js.native
  var transform: js.UndefOr[
    js.Function3[
      /* val */ js.Array[_] | js.Object, 
      /* i */ Double | String | js.Symbol, 
      /* value */ String, 
      String
    ]
  ] = js.native
}

object Filter {
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: (/* o */ js.Any, /* prop */ String | js.Symbol) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineCharacterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineCharacterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineCharacterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineCharacterLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleQuotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleQuotes")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(
      value: (/* val */ js.Array[_] | js.Object, /* i */ Double | String | js.Symbol, /* value */ String) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

