package typingsSlinky.writeJsonFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Detect indentation automatically if the file exists.
  		@default false
  		*/
  val detectIndent: js.UndefOr[Boolean] = js.native
  /**
  		Indentation as a string or number of spaces. Pass in `undefined` for no formatting.
  		@default '\t'
  		*/
  val indent: js.UndefOr[String | Double] = js.native
  /**
  		Mode used when writing the file.
  		@default 0o666
  		*/
  val mode: js.UndefOr[Double] = js.native
  /**
  		Passed into `JSON.stringify`.
  		*/
  val replacer: js.UndefOr[Replacer | (js.Array[Double | String])] = js.native
  /**
  		Sort the keys recursively. Optionally pass in a compare function.
  		@default false
  		*/
  val sortKeys: js.UndefOr[Boolean | SortKeys] = js.native
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
    def withDetectIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String | Double): Self = {
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
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacer(value: Replacer | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
        ret
    }
    @scala.inline
    def withSortKeysFunction2(value: (/* a */ String, /* b */ String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKeys")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortKeys(value: Boolean | SortKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKeys")(js.undefined)
        ret
    }
  }
  
}

