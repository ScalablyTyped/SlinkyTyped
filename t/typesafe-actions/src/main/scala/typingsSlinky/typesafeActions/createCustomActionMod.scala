package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.typeHelpersMod.ActionCreator
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-custom-action", JSImport.Namespace)
@js.native
object createCustomActionMod extends js.Object {
  def createCustomAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T): AC = js.native
  def createCustomAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T, createHandler: js.Function1[/* type */ T, AC]): AC = js.native
}

