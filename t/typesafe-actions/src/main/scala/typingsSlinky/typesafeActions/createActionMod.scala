package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.typeHelpersMod.ActionCreator
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-action", JSImport.Namespace)
@js.native
object createActionMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typesafeActions.anon.MetaPayload[T, P, M]
    - typingsSlinky.typesafeActions.anon.PayloadType[T, P]
    - typingsSlinky.typesafeActions.anon.MetaType[T, M]
    - typingsSlinky.typesafeActions.anon.TypeT[T]
  */
  trait PayloadMetaAction[T /* <: TypeConstant */, P, M] extends js.Object
  
  def createAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T): AC = js.native
  def createAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](
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

