package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeTType[TType /* <: TypeConstant */] extends js.Object {
  var `type`: TType
}

object TypeTType {
  @scala.inline
  def apply[TType](`type`: TType): TypeTType[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeTType[TType]]
  }
}

