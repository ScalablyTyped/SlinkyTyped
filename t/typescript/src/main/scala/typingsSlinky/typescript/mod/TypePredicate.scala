package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.TypePredicateKind.AssertsIdentifier
import typingsSlinky.typescript.mod.TypePredicateKind.AssertsThis
import typingsSlinky.typescript.mod.TypePredicateKind.This
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ThisTypePredicate
  - typingsSlinky.typescript.mod.IdentifierTypePredicate
  - typingsSlinky.typescript.mod.AssertsThisTypePredicate
  - typingsSlinky.typescript.mod.AssertsIdentifierTypePredicate
*/
trait TypePredicate extends js.Object
object TypePredicate {
  
  @scala.inline
  def ThisTypePredicate(kind: This, `type`: Type): TypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicate]
  }
  
  @scala.inline
  def IdentifierTypePredicate(
    kind: typingsSlinky.typescript.mod.TypePredicateKind.Identifier,
    parameterIndex: Double,
    parameterName: java.lang.String,
    `type`: Type
  ): TypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicate]
  }
  
  @scala.inline
  def AssertsThisTypePredicate(kind: AssertsThis): TypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicate]
  }
  
  @scala.inline
  def AssertsIdentifierTypePredicate(kind: AssertsIdentifier, parameterIndex: Double, parameterName: java.lang.String): TypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicate]
  }
}
