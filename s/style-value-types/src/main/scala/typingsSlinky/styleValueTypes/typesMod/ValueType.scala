package typingsSlinky.styleValueTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueType extends js.Object {
  var createTransformer: js.UndefOr[js.Function1[/* template */ String, Transformer]] = js.native
  var default: js.UndefOr[js.Any] = js.native
  var getAnimatableNone: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.native
  var transform: js.UndefOr[Transformer] = js.native
  def parse(v: js.Any): js.Any = js.native
  def test(v: js.Any): Boolean = js.native
}

object ValueType {
  @scala.inline
  def apply(parse: js.Any => js.Any, test: js.Any => Boolean): ValueType = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[ValueType]
  }
  @scala.inline
  implicit class ValueTypeOps[Self <: ValueType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTest(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateTransformer(value: /* template */ String => Transformer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTransformer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnimatableNone(value: /* v */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimatableNone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAnimatableNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimatableNone")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* v */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

