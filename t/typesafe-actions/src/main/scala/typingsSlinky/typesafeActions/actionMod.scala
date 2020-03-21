package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
  def action[T /* <: TypeConstant */](`type`: T): AnonTypeT[T] = js.native
  def action[T /* <: TypeConstant */, P](`type`: T, payload: P): AnonPayloadType[T, P] = js.native
  def action[T /* <: TypeConstant */, M](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M): AnonMetaType[T, M] = js.native
  def action[T /* <: TypeConstant */, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: js.UndefOr[scala.Nothing], error: E): AnonError[T, E] = js.native
  def action[T /* <: TypeConstant */, P, M](`type`: T, payload: P, meta: M): AnonMetaPayload[T, P, M] = js.native
  def action[T /* <: TypeConstant */, P, E](`type`: T, payload: P, meta: js.UndefOr[scala.Nothing], error: E): AnonPayload[T, P, E] = js.native
  def action[T /* <: TypeConstant */, M, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M, error: E): AnonMeta[T, M, E] = js.native
  def action[T /* <: TypeConstant */, P, M, E](`type`: T, payload: P, meta: M, error: E): AnonType[T, P, M, E] = js.native
}

