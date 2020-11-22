package typingsSlinky.typeorm

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.commonObjectTypeMod.ObjectType
import typingsSlinky.typeorm.optionsRelationOptionsMod.RelationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/decorator/relations/OneToOne", JSImport.Namespace)
@js.native
object relationsOneToOneMod extends js.Object {
  
  def OneToOne[T](typeFunctionOrTarget: String): PropertyDecorator = js.native
  def OneToOne[T](typeFunctionOrTarget: String, inverseSide: js.UndefOr[scala.Nothing], options: RelationOptions): PropertyDecorator = js.native
  def OneToOne[T](typeFunctionOrTarget: String, inverseSide: String): PropertyDecorator = js.native
  def OneToOne[T](typeFunctionOrTarget: String, inverseSide: String, options: RelationOptions): PropertyDecorator = js.native
  def OneToOne[T](typeFunctionOrTarget: String, inverseSide: js.Function1[/* object */ T, _]): PropertyDecorator = js.native
  def OneToOne[T](
    typeFunctionOrTarget: String,
    inverseSide: js.Function1[/* object */ T, _],
    options: RelationOptions
  ): PropertyDecorator = js.native
  def OneToOne[T](typeFunctionOrTarget: String, options: RelationOptions): PropertyDecorator = js.native
  def OneToOne[T](typeFunctionOrTarget: js.Function1[js.UndefOr[js.Any], ObjectType[T]]): PropertyDecorator = js.native
  def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.UndefOr[scala.Nothing],
    options: RelationOptions
  ): PropertyDecorator = js.native
  def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String
  ): PropertyDecorator = js.native
  def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String,
    options: RelationOptions
  ): PropertyDecorator = js.native
  def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, _]
  ): PropertyDecorator = js.native
  def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, _],
    options: RelationOptions
  ): PropertyDecorator = js.native
  def OneToOne[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    options: RelationOptions
  ): PropertyDecorator = js.native
}
