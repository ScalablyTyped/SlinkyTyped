package typingsSlinky.styleSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Syntax feature options all accept three keywords:"skip", "check", "only".
  * An error will be thrown if you use "only" more than once
  */
@js.native
trait Options extends js.Object {
  /**
    * This includes both standard `/ * CSS comments *\/`
    * and non-standard but widely used `// single line comments`.
    * @default 'skip'
    */
  var comments: js.UndefOr[SyntaxFeatureOption] = js.native
  /**
    * @default 'check'
    */
  var functionArguments: js.UndefOr[SyntaxFeatureOption] = js.native
  /**
    * @default 'skip'
    */
  var functionNames: js.UndefOr[SyntaxFeatureOption] = js.native
  /**
    * If true, the search will stop after one match is found.
    * @default false
    */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * @default 'check'
    */
  var parentheticals: js.UndefOr[SyntaxFeatureOption] = js.native
  /** The source string to search through. */
  var source: String = js.native
  /**
    * @default 'skip'
    */
  var strings: js.UndefOr[SyntaxFeatureOption] = js.native
  /**
    * The target of the search. Can be
    * - a single character
    * - a string with some length
    * - an array of strings, all of which count as matches
    * (the match object passed to the callback will differentiate which string in the array
    * got matched via its target property)
    */
  var target: String | js.Array[String] = js.native
}

object Options {
  @scala.inline
  def apply(source: String, target: String | js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: SyntaxFeatureOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionArguments(value: SyntaxFeatureOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionNames(value: SyntaxFeatureOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionNames")(js.undefined)
        ret
    }
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withParentheticals(value: SyntaxFeatureOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentheticals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentheticals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentheticals")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: SyntaxFeatureOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
  }
  
}

