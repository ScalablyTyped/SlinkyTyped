package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.queryBuilderWhereExpressionMod.WhereExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Brackets")
@js.native
class Brackets protected ()
  extends typingsSlinky.typeorm.queryBuilderBracketsMod.Brackets {
  /**
    * Given WHERE query builder that will build a WHERE expression that will be taken into brackets.
    */
  def this(whereFactory: js.Function1[/* qb */ WhereExpression, _]) = this()
}
