package typingsSlinky.sugarCore.sugarjs.RegExp

import typingsSlinky.std.RegExpExecArray
import typingsSlinky.sugarCore.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def exec(string: String): SugarDefaultChainable[RegExpExecArray | Null] = js.native
  def test(string: String): SugarDefaultChainable[Boolean] = js.native
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    exec: String => SugarDefaultChainable[RegExpExecArray | Null],
    raw: RawValue,
    test: String => SugarDefaultChainable[Boolean]
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), raw = raw.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
  @scala.inline
  implicit class ChainableBaseOps[Self[rawvalue] <: ChainableBase[rawvalue], RawValue] (val x: Self[RawValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RawValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RawValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RawValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RawValue] with Other]
    @scala.inline
    def withExec(value: String => SugarDefaultChainable[RegExpExecArray | Null]): Self[RawValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRaw(value: RawValue): Self[RawValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: String => SugarDefaultChainable[Boolean]): Self[RawValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

