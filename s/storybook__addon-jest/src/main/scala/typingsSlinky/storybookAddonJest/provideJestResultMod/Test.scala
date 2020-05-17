package typingsSlinky.storybookAddonJest.provideJestResultMod

import typingsSlinky.storybookAddonJest.anon.AssertionResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test extends js.Object {
  var name: String = js.native
  var result: AssertionResults = js.native
}

object Test {
  @scala.inline
  def apply(name: String, result: AssertionResults): Test = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
  @scala.inline
  implicit class TestOps[Self <: Test] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: AssertionResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

