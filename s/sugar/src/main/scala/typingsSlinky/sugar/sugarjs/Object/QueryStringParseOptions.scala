package typingsSlinky.sugar.sugarjs.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStringParseOptions[T, U] extends js.Object {
  var auto: js.UndefOr[Boolean] = js.native
  var deep: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
  var transform: js.UndefOr[js.Function3[/* key */ String, /* val */ T, /* obj */ js.Object, U]] = js.native
}

object QueryStringParseOptions {
  @scala.inline
  def apply[T, U](): QueryStringParseOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStringParseOptions[T, U]]
  }
  @scala.inline
  implicit class QueryStringParseOptionsOps[Self[t, u] <: QueryStringParseOptions[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withAuto(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
    @scala.inline
    def withDeep(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (/* key */ String, /* val */ T, /* obj */ js.Object) => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

