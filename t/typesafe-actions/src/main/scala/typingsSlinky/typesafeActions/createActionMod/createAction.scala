package typingsSlinky.typesafeActions.createActionMod

import typingsSlinky.typesafeActions.typeHelpersMod.ActionCreator
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-action", "createAction")
@js.native
object createAction extends js.Object {
  def apply[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T): AC = js.native
  def apply[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](
    `type`: T,
    createHandler: js.Function1[
      /* actionCallback */ js.Function2[
        /* payload */ js.UndefOr[scala.Nothing], 
        /* meta */ js.UndefOr[scala.Nothing], 
        PayloadMetaAction[T, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]
      ], 
      AC
    ]
  ): AC = js.native
}

