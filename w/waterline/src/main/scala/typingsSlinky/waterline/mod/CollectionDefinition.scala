package typingsSlinky.waterline.mod

import typingsSlinky.waterline.waterlineStrings.alter
import typingsSlinky.waterline.waterlineStrings.drop
import typingsSlinky.waterline.waterlineStrings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined waterline.waterline.LifecycleCallbacks & {  attributes ? :waterline.waterline.Attributes,   connection ? :string,   identity ? :string,   tableName ? :string,   migrate ? :'alter' | 'drop' | 'safe',   autoPK ? :boolean,   autoCreatedAt ? :boolean,   autoUpdatedAt ? :boolean,   schema ? :boolean,   types ? :any} */
@js.native
trait CollectionDefinition extends js.Object {
  var afterCreate: js.UndefOr[
    (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  var afterDestroy: js.UndefOr[
    (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  var afterUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  var attributes: js.UndefOr[Attributes] = js.native
  var autoCreatedAt: js.UndefOr[Boolean] = js.native
  var autoPK: js.UndefOr[Boolean] = js.native
  var autoUpdatedAt: js.UndefOr[Boolean] = js.native
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
  var connection: js.UndefOr[String] = js.native
  var identity: js.UndefOr[String] = js.native
  var migrate: js.UndefOr[alter | drop | safe] = js.native
  var schema: js.UndefOr[Boolean] = js.native
  var tableName: js.UndefOr[String] = js.native
  var types: js.UndefOr[js.Any] = js.native
}

object CollectionDefinition {
  @scala.inline
  def apply(): CollectionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDefinition]
  }
  @scala.inline
  implicit class CollectionDefinitionOps[Self <: CollectionDefinition] (val x: Self) extends AnyVal {
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
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCreatedAt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPK(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPK")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpdatedAt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdatedAt")(js.undefined)
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
    @scala.inline
    def withConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrate(value: alter | drop | safe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

