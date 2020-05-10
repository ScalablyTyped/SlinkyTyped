package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Hooks
// ~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/hooks.js
//
/**
  * Options for Sequelize.define. We mostly duplicate the Hooks here, since there is no way to combine the two
  * interfaces.
  *
  * beforeValidate, afterValidate, beforeBulkCreate, beforeBulkDestroy, beforeBulkUpdate, beforeCreate,
  * beforeDestroy, beforeSave, beforeUpdate, afterCreate, afterDestroy, afterSave, afterUpdate, afterBulkCreate,
  * afterBulkDestroy and afterBulkUpdate.
  */
@js.native
trait HooksDefineOptions[TInstance] extends js.Object {
  var afterBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  var afterBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  var afterBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  var afterBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  var afterCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  var afterDelete: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  var afterDestroy: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  var afterFind: js.UndefOr[
    js.Function3[
      /* instancesOrInstance */ js.Array[TInstance] | TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  var afterSave: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  var afterUpdate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  var afterValidate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  var beforeBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  var beforeBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  var beforeBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  var beforeBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  var beforeCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.native
  var beforeDelete: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  var beforeDestroy: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  var beforeFind: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  var beforeFindAfterExpandIncludeAll: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  var beforeFindAfterOptions: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.native
  var beforeSave: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  var beforeUpdate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
  var beforeValidate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.native
}

object HooksDefineOptions {
  @scala.inline
  def apply[TInstance](): HooksDefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HooksDefineOptions[TInstance]]
  }
  @scala.inline
  implicit class HooksDefineOptionsOps[Self[tinstance] <: HooksDefineOptions[tinstance], TInstance] (val x: Self[TInstance]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TInstance] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TInstance]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TInstance] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TInstance] with Other]
    @scala.inline
    def withAfterBulkCreate(
      value: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBulkCreate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterBulkCreate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBulkCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterBulkDelete(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBulkDelete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterBulkDelete: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBulkDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterBulkDestroy(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBulkDestroy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterBulkDestroy: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBulkDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterBulkUpdate(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBulkUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterBulkUpdate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBulkUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCreate(
      value: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterCreate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDelete(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDelete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterDelete: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDestroy(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterDestroy: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterFind(
      value: (/* instancesOrInstance */ js.Array[TInstance] | TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFind")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterFind: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFind")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSave(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterSave: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSave")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUpdate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterUpdate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterValidate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterValidate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterValidate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBulkCreate(
      value: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBulkCreate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeBulkCreate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBulkCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBulkDelete(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBulkDelete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeBulkDelete: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBulkDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBulkDestroy(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBulkDestroy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeBulkDestroy: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBulkDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBulkUpdate(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBulkUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeBulkUpdate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBulkUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCreate(
      value: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _
    ): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeCreate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDelete(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDelete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeDelete: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDestroy(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeDestroy: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFind(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFind")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeFind: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFind")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFindAfterExpandIncludeAll(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFindAfterExpandIncludeAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeFindAfterExpandIncludeAll: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFindAfterExpandIncludeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFindAfterOptions(value: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFindAfterOptions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeFindAfterOptions: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFindAfterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSave(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeSave: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSave")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUpdate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeUpdate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeValidate(value: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => _): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeValidate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(js.undefined)
        ret
    }
  }
  
}

