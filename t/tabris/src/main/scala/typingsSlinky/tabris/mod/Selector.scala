package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabris.mod.SelectorString
  - typingsSlinky.tabris.mod.SelectorFunction[Candidate]
  - typingsSlinky.tabris.mod.Constructor[Result]
  - typingsSlinky.tabris.mod.SFC[Result]
*/
trait Selector[Candidate /* <: Widget */, Result /* <: Candidate */] extends js.Object

object Selector {
  @scala.inline
  implicit def apply[Candidate, Result](value: Constructor[Result]): Selector[Candidate, Result] = value.asInstanceOf[Selector[Candidate, Result]]
  @scala.inline
  implicit def apply[Candidate, Result](value: SFC[Result]): Selector[Candidate, Result] = value.asInstanceOf[Selector[Candidate, Result]]
  @scala.inline
  implicit def apply[Candidate, Result](value: SelectorFunction[Candidate]): Selector[Candidate, Result] = value.asInstanceOf[Selector[Candidate, Result]]
  @scala.inline
  implicit def apply[Candidate, Result](value: SelectorString): Selector[Candidate, Result] = value.asInstanceOf[Selector[Candidate, Result]]
}

