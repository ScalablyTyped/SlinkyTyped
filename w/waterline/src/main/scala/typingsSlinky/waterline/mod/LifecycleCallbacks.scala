package typingsSlinky.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleCallbacks extends js.Object {
  var afterCreate: js.UndefOr[
    (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  var afterDestroy: js.UndefOr[
    (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  var afterUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  var beforeCreate: js.UndefOr[
    (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  var beforeDestroy: js.UndefOr[
    (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  var beforeUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  var beforeValidate: js.UndefOr[
    (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
}

object LifecycleCallbacks {
  @scala.inline
  def apply(): LifecycleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleCallbacks]
  }
  @scala.inline
  implicit class LifecycleCallbacksOps[Self <: LifecycleCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCreateFunction2(value: (/* newlyCreatedRecord */ js.Any, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAfterCreate(
      value: (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDestroyFunction2(value: (/* destroyedInstance */ js.Any, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAfterDestroy(
      value: (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAfterUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCreateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeforeCreate(
      value: (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDestroyFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeforeDestroy(
      value: (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeforeUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeValidateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeforeValidate(
      value: (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(js.undefined)
        ret
    }
  }
  
}

