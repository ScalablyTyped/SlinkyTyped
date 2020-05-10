package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdd extends js.Object {
  var add: js.Any = js.native
  var `match`: js.Any = js.native
  var normalize: js.Any = js.native
  var pretest: js.Any = js.native
  var re: AnonEmailfuzzy = js.native
  var set: js.Any = js.native
  var test: js.Any = js.native
  var testSchemaAt: js.Any = js.native
  var tlds: js.Any = js.native
}

object AnonAdd {
  @scala.inline
  def apply(
    add: js.Any,
    `match`: js.Any,
    normalize: js.Any,
    pretest: js.Any,
    re: AnonEmailfuzzy,
    set: js.Any,
    test: js.Any,
    testSchemaAt: js.Any,
    tlds: js.Any
  ): AnonAdd = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], pretest = pretest.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], testSchemaAt = testSchemaAt.asInstanceOf[js.Any], tlds = tlds.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdd]
  }
  @scala.inline
  implicit class AnonAddOps[Self <: AnonAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPretest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRe(value: AnonEmailfuzzy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("re")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSchemaAt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSchemaAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTlds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

