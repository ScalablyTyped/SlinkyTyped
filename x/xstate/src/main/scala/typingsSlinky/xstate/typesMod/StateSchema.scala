package typingsSlinky.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateSchema[TC] extends js.Object {
  var context: js.UndefOr[Partial[TC]] = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var states: js.UndefOr[StringDictionary[StateSchema[TC]]] = js.native
}

object StateSchema {
  @scala.inline
  def apply[TC](): StateSchema[TC] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateSchema[TC]]
  }
  @scala.inline
  implicit class StateSchemaOps[Self[tc] <: StateSchema[tc], TC] (val x: Self[TC]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TC] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TC]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TC] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TC] with Other]
    @scala.inline
    def withContext(value: Partial[TC]): Self[TC] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TC] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self[TC] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[TC] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: StringDictionary[StateSchema[TC]]): Self[TC] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self[TC] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(js.undefined)
        ret
    }
  }
  
}

