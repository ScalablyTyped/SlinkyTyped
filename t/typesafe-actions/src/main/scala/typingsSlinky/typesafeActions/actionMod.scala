package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.anon.Error
import typingsSlinky.typesafeActions.anon.Meta
import typingsSlinky.typesafeActions.anon.MetaPayload
import typingsSlinky.typesafeActions.anon.MetaType
import typingsSlinky.typesafeActions.anon.Payload
import typingsSlinky.typesafeActions.anon.PayloadType
import typingsSlinky.typesafeActions.anon.Type
import typingsSlinky.typesafeActions.anon.TypeT
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
  def action[T /* <: TypeConstant */](`type`: T): TypeT[T] = js.native
  def action[T /* <: TypeConstant */, P](`type`: T, payload: P): PayloadType[T, P] = js.native
  def action[T /* <: TypeConstant */, M](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M): MetaType[T, M] = js.native
  def action[T /* <: TypeConstant */, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: js.UndefOr[scala.Nothing], error: E): Error[T, E] = js.native
  def action[T /* <: TypeConstant */, P, M](`type`: T, payload: P, meta: M): MetaPayload[T, P, M] = js.native
  def action[T /* <: TypeConstant */, P, E](`type`: T, payload: P, meta: js.UndefOr[scala.Nothing], error: E): Payload[T, P, E] = js.native
  def action[T /* <: TypeConstant */, M, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M, error: E): Meta[T, M, E] = js.native
  def action[T /* <: TypeConstant */, P, M, E](`type`: T, payload: P, meta: M, error: E): Type[T, P, M, E] = js.native
}

