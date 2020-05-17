package typingsSlinky.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinEnabled extends js.Object {
  var builtinEnabled: Boolean = js.native
  var connector: js.UndefOr[
    js.Function4[
      /* level */ String, 
      /* category */ String, 
      /* label */ js.UndefOr[String], 
      /* content */ js.Any, 
      Unit
    ]
  ] = js.native
  var level: js.UndefOr[String | Double] = js.native
}

object BuiltinEnabled {
  @scala.inline
  def apply(builtinEnabled: Boolean): BuiltinEnabled = {
    val __obj = js.Dynamic.literal(builtinEnabled = builtinEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltinEnabled]
  }
  @scala.inline
  implicit class BuiltinEnabledOps[Self <: BuiltinEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuiltinEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtinEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnector(
      value: (/* level */ String, /* category */ String, /* label */ js.UndefOr[String], /* content */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

