package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.TypePredicateKind.AssertsIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertsIdentifierTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_AssertsIdentifierTypePredicate: AssertsIdentifier = js.native
  var parameterIndex: Double = js.native
  var parameterName: java.lang.String = js.native
}

object AssertsIdentifierTypePredicate {
  @scala.inline
  def apply(kind: AssertsIdentifier, parameterIndex: Double, parameterName: java.lang.String): AssertsIdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertsIdentifierTypePredicate]
  }
  @scala.inline
  implicit class AssertsIdentifierTypePredicateOps[Self <: AssertsIdentifierTypePredicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: AssertsIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

