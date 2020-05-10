package typingsSlinky.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledConfig[O /* <: js.Object */] extends js.Object {
  // TODO: Add all types from the original StyledComponentWrapperProperties
  var shouldForwardProp: js.UndefOr[
    js.Function2[
      /* keyof O */ /* prop */ String, 
      /* defaultValidatorFn */ js.Function1[/* keyof O */ /* prop */ String, Boolean], 
      Boolean
    ]
  ] = js.native
}

object StyledConfig {
  @scala.inline
  def apply[O](): StyledConfig[O] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledConfig[O]]
  }
  @scala.inline
  implicit class StyledConfigOps[Self[o] <: StyledConfig[o], O] (val x: Self[O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[O] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[O] with Other]
    @scala.inline
    def withShouldForwardProp(
      value: (/* keyof O */ /* prop */ String, /* defaultValidatorFn */ js.Function1[/* keyof O */ /* prop */ String, Boolean]) => Boolean
    ): Self[O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldForwardProp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldForwardProp: Self[O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldForwardProp")(js.undefined)
        ret
    }
  }
  
}

