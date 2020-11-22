package typingsSlinky.typeorm

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.commonObjectTypeMod.ObjectType
import typingsSlinky.typeorm.optionsRelationOptionsMod.RelationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/decorator/relations/OneToMany", JSImport.Namespace)
@js.native
object relationsOneToManyMod extends js.Object {
  
  def OneToMany[T](typeFunctionOrTarget: String, inverseSide: String): PropertyDecorator = js.native
  def OneToMany[T](typeFunctionOrTarget: String, inverseSide: String, options: RelationOptions): PropertyDecorator = js.native
  def OneToMany[T](typeFunctionOrTarget: String, inverseSide: js.Function1[/* object */ T, _]): PropertyDecorator = js.native
  def OneToMany[T](
    typeFunctionOrTarget: String,
    inverseSide: js.Function1[/* object */ T, _],
    options: RelationOptions
  ): PropertyDecorator = js.native
  def OneToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String
  ): PropertyDecorator = js.native
  def OneToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String,
    options: RelationOptions
  ): PropertyDecorator = js.native
  def OneToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, _]
  ): PropertyDecorator = js.native
  def OneToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, _],
    options: RelationOptions
  ): PropertyDecorator = js.native
}
