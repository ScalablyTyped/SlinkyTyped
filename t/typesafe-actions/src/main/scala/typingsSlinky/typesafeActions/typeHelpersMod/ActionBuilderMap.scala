package typingsSlinky.typesafeActions.typeHelpersMod

import typingsSlinky.typesafeActions.anon.TypeTType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * payload * / TPayloadArg, 
/ * meta * / TMetaArg, 
typingsSlinky.typesafeActions.anon.TypeTType[TType] with TActionProps]
  - js.Function1[
/ * payload * / TPayloadArg, 
typingsSlinky.typesafeActions.anon.TypeTType[TType] with TActionProps]
  - js.Function0[typingsSlinky.typesafeActions.anon.TypeTType[TType] with TActionProps]
*/
trait ActionBuilderMap[TType /* <: TypeConstant */, TActionProps /* <: js.Any */, TPayloadArg /* <: js.Any */, TMetaArg /* <: js.Any */] extends js.Object

object ActionBuilderMap {
  @scala.inline
  implicit def apply[TType, TActionProps, TPayloadArg, TMetaArg](value: js.Function0[TypeTType[TType] with TActionProps]): ActionBuilderMap[TType, TActionProps, TPayloadArg, TMetaArg] = value.asInstanceOf[ActionBuilderMap[TType, TActionProps, TPayloadArg, TMetaArg]]
  @scala.inline
  implicit def apply[TType, TActionProps, TPayloadArg, TMetaArg](value: js.Function1[/* payload */ TPayloadArg, TypeTType[TType] with TActionProps]): ActionBuilderMap[TType, TActionProps, TPayloadArg, TMetaArg] = value.asInstanceOf[ActionBuilderMap[TType, TActionProps, TPayloadArg, TMetaArg]]
  @scala.inline
  implicit def apply[TType, TActionProps, TPayloadArg, TMetaArg](
    value: js.Function2[/* payload */ TPayloadArg, /* meta */ TMetaArg, TypeTType[TType] with TActionProps]
  ): ActionBuilderMap[TType, TActionProps, TPayloadArg, TMetaArg] = value.asInstanceOf[ActionBuilderMap[TType, TActionProps, TPayloadArg, TMetaArg]]
}

