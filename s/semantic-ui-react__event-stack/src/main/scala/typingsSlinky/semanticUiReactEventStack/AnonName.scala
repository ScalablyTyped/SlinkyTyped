package typingsSlinky.semanticUiReactEventStack

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonName extends js.Object {
  /** An event name on which we will subscribe. */
  var name: Validator[String] = js.native
  /** An event handler or array of event handlers. */
  var on: Validator[
    (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
  ] = js.native
  /** A name of pool. */
  var pool: Requireable[String] = js.native
  /** A DOM element on which we will subscribe. */
  var target: Requireable[js.Object] = js.native
}

object AnonName {
  @scala.inline
  def apply(
    name: Validator[String],
    on: Validator[
      (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
    ],
    pool: Requireable[String],
    target: Requireable[js.Object]
  ): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
  @scala.inline
  implicit class AnonNameOps[Self <: AnonName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(
      value: Validator[
          (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPool(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

