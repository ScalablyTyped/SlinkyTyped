package typingsSlinky.sixRuntime.Six.plugins.dataProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProvider extends js.Object {
  def execute(ctx: js.Object, args: js.Any): js.Any = js.native
  def prepare(ctx: js.Object, depsRes: js.Object): js.Any = js.native
}

object DataProvider {
  @scala.inline
  def apply(execute: (js.Object, js.Any) => js.Any, prepare: (js.Object, js.Object) => js.Any): DataProvider = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), prepare = js.Any.fromFunction2(prepare))
    __obj.asInstanceOf[DataProvider]
  }
  @scala.inline
  implicit class DataProviderOps[Self <: DataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: (js.Object, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrepare(value: (js.Object, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

