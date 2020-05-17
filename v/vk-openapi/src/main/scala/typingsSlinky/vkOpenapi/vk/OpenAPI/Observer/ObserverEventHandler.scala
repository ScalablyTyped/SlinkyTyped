package typingsSlinky.vkOpenapi.vk.OpenAPI.Observer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[scala.Unit]
  - js.Function1[/ * uid * / scala.Double, scala.Unit]
  - js.Function4[
/ * num * / scala.Double, 
/ * lastComment * / java.lang.String, 
/ * date * / java.lang.String, 
/ * sign * / java.lang.String, 
scala.Unit]
*/
trait ObserverEventHandler[E /* <: ObserverEvent */] extends js.Object

object ObserverEventHandler {
  @scala.inline
  implicit def apply[E](value: js.Function0[Unit]): ObserverEventHandler[E] = value.asInstanceOf[ObserverEventHandler[E]]
  @scala.inline
  implicit def apply[E](value: js.Function1[/* uid */ Double, Unit]): ObserverEventHandler[E] = value.asInstanceOf[ObserverEventHandler[E]]
  @scala.inline
  implicit def apply[E](
    value: js.Function4[/* num */ Double, /* lastComment */ String, /* date */ String, /* sign */ String, Unit]
  ): ObserverEventHandler[E] = value.asInstanceOf[ObserverEventHandler[E]]
}

