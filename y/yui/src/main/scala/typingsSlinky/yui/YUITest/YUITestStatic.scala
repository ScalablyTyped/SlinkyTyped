package typingsSlinky.yui.YUITest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YUITestStatic extends js.Object {
  var Assert: IAssert = js.native
  var Case: TestCase = js.native
  var Runner: TestRunner = js.native
}

object YUITestStatic {
  @scala.inline
  def apply(Assert: IAssert, Case: TestCase, Runner: TestRunner): YUITestStatic = {
    val __obj = js.Dynamic.literal(Assert = Assert.asInstanceOf[js.Any], Case = Case.asInstanceOf[js.Any], Runner = Runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[YUITestStatic]
  }
  @scala.inline
  implicit class YUITestStaticOps[Self <: YUITestStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssert(value: IAssert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCase(value: TestCase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Case")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunner(value: TestRunner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Runner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

