package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LowLevelStyleFunctionArguments[N, S] extends js.Object {
  var alias: js.UndefOr[String] = js.native
  var cssProperty: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var prop: String = js.native
  // new v5 api
  var properties: js.UndefOr[js.Array[String]] = js.native
  var scale: js.UndefOr[S] = js.native
  var transformValue: js.UndefOr[js.Function2[/* n */ N, /* scale */ js.UndefOr[S], _]] = js.native
}

object LowLevelStyleFunctionArguments {
  @scala.inline
  def apply[N, S](prop: String): LowLevelStyleFunctionArguments[N, S] = {
    val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLevelStyleFunctionArguments[N, S]]
  }
  @scala.inline
  implicit class LowLevelStyleFunctionArgumentsOps[Self[n, s] <: LowLevelStyleFunctionArguments[n, s], N, S] (val x: Self[N, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[N, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[N, S]) with Other]
    @scala.inline
    def withProp(value: String): Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlias(value: String): Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withCssProperty(value: String): Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssProperty: Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[String]): Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: S): Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformValue(value: (/* n */ N, /* scale */ js.UndefOr[S]) => _): Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransformValue: Self[N, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformValue")(js.undefined)
        ret
    }
  }
  
}

