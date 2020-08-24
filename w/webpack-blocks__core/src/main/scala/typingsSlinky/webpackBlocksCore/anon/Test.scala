package typingsSlinky.webpackBlocksCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test extends js.Object {
  var test: js.RegExp | js.Array[js.RegExp] = js.native
}

object Test {
  @scala.inline
  def apply(test: js.RegExp | js.Array[js.RegExp]): Test = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
  @scala.inline
  implicit class TestOps[Self <: Test] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTestVarargs(value: js.RegExp*): Self = this.set("test", js.Array(value :_*))
    @scala.inline
    def setTestRegExp(value: js.RegExp): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: js.RegExp | js.Array[js.RegExp]): Self = this.set("test", value.asInstanceOf[js.Any])
  }
  
}

