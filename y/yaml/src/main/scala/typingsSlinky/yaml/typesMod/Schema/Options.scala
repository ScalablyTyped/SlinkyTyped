package typingsSlinky.yaml.typesMod.Schema

import typingsSlinky.yaml.typesMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Array of additional tags to include in the schema, or a function that may
    * modify the schema's base tag array.
    */
  var customTags: js.UndefOr[
    (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
  ] = js.native
  /**
    * Enable support for `<<` merge keys.
    *
    * Default: `false` for YAML 1.2, `true` for earlier versions
    */
  var merge: js.UndefOr[Boolean] = js.native
  /**
    * The base schema to use.
    *
    * Default: `"core"` for YAML 1.2, `"yaml-1.1"` for earlier versions
    */
  var schema: js.UndefOr[Name] = js.native
  /**
    * When stringifying, sort map entries. If `true`, sort by comparing key values with `<`.
    *
    * Default: `false`
    */
  var sortMapEntries: js.UndefOr[Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double])] = js.native
  /**
    * @deprecated Use `customTags` instead.
    */
  var tags: js.UndefOr[
    (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomTagsFunction1(value: /* tags */ js.Array[Tag] => js.Array[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomTags(value: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTags")(js.undefined)
        ret
    }
    @scala.inline
    def withMerge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSortMapEntriesFunction2(value: (/* a */ Pair, /* b */ Pair) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMapEntries")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortMapEntries(value: Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMapEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortMapEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMapEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsFunction1(value: /* tags */ js.Array[Tag] => js.Array[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTags(value: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

