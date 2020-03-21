package typingsSlinky.stardustUiReactComponentRef

import typingsSlinky.propTypes.mod.ReactElementLike
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: Validator[ReactElementLike]
  var innerRef: Validator[Ref[_]]
}

object AnonChildren {
  @scala.inline
  def apply(children: Validator[ReactElementLike], innerRef: Validator[Ref[_]]): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}

