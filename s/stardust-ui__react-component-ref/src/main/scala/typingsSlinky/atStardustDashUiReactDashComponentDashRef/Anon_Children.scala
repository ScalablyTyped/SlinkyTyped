package typingsSlinky.atStardustDashUiReactDashComponentDashRef

import typingsSlinky.propDashTypes.propDashTypesMod.ReactElementLike
import typingsSlinky.propDashTypes.propDashTypesMod.Validator
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: Validator[ReactElementLike]
  var innerRef: Validator[Ref[_]]
}

object Anon_Children {
  @scala.inline
  def apply(children: Validator[ReactElementLike], innerRef: Validator[Ref[_]]): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Children]
  }
}

