package typingsSlinky.typeorm.mod

import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "RelationId")
@js.native
object RelationId extends js.Object {
  
  def apply[T](relation: String): PropertyDecorator = js.native
  def apply[T](
    relation: String,
    alias: js.UndefOr[scala.Nothing],
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
  def apply[T](relation: String, alias: String): PropertyDecorator = js.native
  def apply[T](
    relation: String,
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
  def apply[T](relation: js.Function1[/* object */ T, _]): PropertyDecorator = js.native
  def apply[T](
    relation: js.Function1[/* object */ T, _],
    alias: js.UndefOr[scala.Nothing],
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
  def apply[T](relation: js.Function1[/* object */ T, _], alias: String): PropertyDecorator = js.native
  def apply[T](
    relation: js.Function1[/* object */ T, _],
    alias: String,
    queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]
  ): PropertyDecorator = js.native
}
